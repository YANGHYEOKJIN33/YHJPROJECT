import java.util.List;
import java.util.LinkedList; //array와 arrayList는 가변성의 차이 (둘다 배열이다), linkedList는 연결리스트이다. 
import java.util.ListIterator;

public class ListTest {
   public static void main(String[] args) {
      // list1에 색상 요소 추가
      String[] colors = 
         {"black", "yellow", "green", "blue", "violet", "silver"};
      List<String> list1 = new LinkedList<>(); 

      for (String color : colors) {
         list1.add(color);
      }

      // list2에 색상 요소 추가  
      String[] colors2 = 
         {"gold", "white", "brown", "blue", "gray", "silver"};
      List<String> list2 = new LinkedList<>();

      for (String color : colors2) {
         list2.add(color);
      }
      
      list1.addAll(list2); // 연결목록
      list2 = null; // 리소스 해제
      printList(list1); // list1 요소 출력

      convertToUppercaseStrings(list1); // 대문자 문자열로 변환
      printList(list1); // list1 요소 출력

      System.out.printf("%nDeleting elements 4 to 6...");
      removeItems(list1, 4, 7); // 리스트에서 항목 4-6 제거
      printList(list1); // list1 요소 출력
      printReversedList(list1); //역순으로 목록 인쇄
   }                                     

   // 리스트 내용 출력
   private static void printList(List<String> list) {
      System.out.printf("%nlist:%n");
   
      for (String color : list) {
         System.out.printf("%s ", color);
      }

      System.out.println();
   }                                                    

   // String 객체를 찾아 대문자로 변환
   private static void convertToUppercaseStrings(List<String> list) {
      ListIterator<String> iterator = list.listIterator();

      while (iterator.hasNext()) {
         String color = iterator.next(); // get item                
         iterator.set(color.toUpperCase()); // 대문자로 뱐환
      } 
   } 

   // 하위 목록을 얻고 clear 메소드를 사용하여 하위 목록 항목 삭제
   private static void removeItems(List<String> list, 
      int start, int end) {
      list.subList(start, end).clear(); // remove items
   } 

   // 역순 list 출력
   private static void printReversedList(List<String> list) {
      ListIterator<String> iterator = list.listIterator(list.size());

      System.out.printf("%nReversed List:%n");

      // 역순으로 리스트 출력
      while (iterator.hasPrevious()) {
         System.out.printf("%s ", iterator.previous()); 
      }
   } 
}