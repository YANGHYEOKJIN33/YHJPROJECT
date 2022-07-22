import java.util.List;
import java.util.LinkedList; //array�� arrayList�� �������� ���� (�Ѵ� �迭�̴�), linkedList�� ���Ḯ��Ʈ�̴�. 
import java.util.ListIterator;

public class ListTest {
   public static void main(String[] args) {
      // list1�� ���� ��� �߰�
      String[] colors = 
         {"black", "yellow", "green", "blue", "violet", "silver"};
      List<String> list1 = new LinkedList<>(); 

      for (String color : colors) {
         list1.add(color);
      }

      // list2�� ���� ��� �߰�  
      String[] colors2 = 
         {"gold", "white", "brown", "blue", "gray", "silver"};
      List<String> list2 = new LinkedList<>();

      for (String color : colors2) {
         list2.add(color);
      }
      
      list1.addAll(list2); // ������
      list2 = null; // ���ҽ� ����
      printList(list1); // list1 ��� ���

      convertToUppercaseStrings(list1); // �빮�� ���ڿ��� ��ȯ
      printList(list1); // list1 ��� ���

      System.out.printf("%nDeleting elements 4 to 6...");
      removeItems(list1, 4, 7); // ����Ʈ���� �׸� 4-6 ����
      printList(list1); // list1 ��� ���
      printReversedList(list1); //�������� ��� �μ�
   }                                     

   // ����Ʈ ���� ���
   private static void printList(List<String> list) {
      System.out.printf("%nlist:%n");
   
      for (String color : list) {
         System.out.printf("%s ", color);
      }

      System.out.println();
   }                                                    

   // String ��ü�� ã�� �빮�ڷ� ��ȯ
   private static void convertToUppercaseStrings(List<String> list) {
      ListIterator<String> iterator = list.listIterator();

      while (iterator.hasNext()) {
         String color = iterator.next(); // get item                
         iterator.set(color.toUpperCase()); // �빮�ڷ� ��ȯ
      } 
   } 

   // ���� ����� ��� clear �޼ҵ带 ����Ͽ� ���� ��� �׸� ����
   private static void removeItems(List<String> list, 
      int start, int end) {
      list.subList(start, end).clear(); // remove items
   } 

   // ���� list ���
   private static void printReversedList(List<String> list) {
      ListIterator<String> iterator = list.listIterator(list.size());

      System.out.printf("%nReversed List:%n");

      // �������� ����Ʈ ���
      while (iterator.hasPrevious()) {
         System.out.printf("%s ", iterator.previous()); 
      }
   } 
}