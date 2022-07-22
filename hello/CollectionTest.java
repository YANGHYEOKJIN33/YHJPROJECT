import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
   public static void main(String[] args) {
      // 리스트 안에 요소 집어넣기
      String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
      List<String> list = new ArrayList<String>();

      for (String color : colors) {
         list.add(color); // colors의 요소 color에 대입
      }

      // 색 제거
      String[] removeColors = {"RED", "WHITE", "BLUE"};
      List<String> removeList = new ArrayList<String>();
      
      for (String color : removeColors) {
         removeList.add(color);
      }

      // 리스트의 요소 출력
      System.out.println("ArrayList: ");

      for (int count = 0; count < list.size(); count++) {
         System.out.printf("%s ", list.get(count));
      }

      // removeList에 포함된 색상을 목록에서 제거
      removeColors(list, removeList);

      // 리스트 안의 요소 출력
      System.out.printf("%n%nArrayList after calling removeColors:%n");

      for (String color : list) {
         System.out.printf("%s ", color);
      }
   } 

   // collection1에서 collection2에 지정된 색상 제거
   private static void removeColors(Collection<String> collection1, 
      Collection<String> collection2) {
      // get iterator
      Iterator<String> iterator = collection1.iterator(); 

      // 컬렉션에 항목이 있는 동안 반복
      while (iterator.hasNext()) {
         if (collection2.contains(iterator.next())) {   
            iterator.remove(); // 현재 요소 제거
         }                                              
      } 
   } 
}


