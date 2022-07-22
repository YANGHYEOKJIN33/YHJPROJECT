import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
   public static void main(String[] args) {
      // ����Ʈ �ȿ� ��� ����ֱ�
      String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
      List<String> list = new ArrayList<String>();

      for (String color : colors) {
         list.add(color); // colors�� ��� color�� ����
      }

      // �� ����
      String[] removeColors = {"RED", "WHITE", "BLUE"};
      List<String> removeList = new ArrayList<String>();
      
      for (String color : removeColors) {
         removeList.add(color);
      }

      // ����Ʈ�� ��� ���
      System.out.println("ArrayList: ");

      for (int count = 0; count < list.size(); count++) {
         System.out.printf("%s ", list.get(count));
      }

      // removeList�� ���Ե� ������ ��Ͽ��� ����
      removeColors(list, removeList);

      // ����Ʈ ���� ��� ���
      System.out.printf("%n%nArrayList after calling removeColors:%n");

      for (String color : list) {
         System.out.printf("%s ", color);
      }
   } 

   // collection1���� collection2�� ������ ���� ����
   private static void removeColors(Collection<String> collection1, 
      Collection<String> collection2) {
      // get iterator
      Iterator<String> iterator = collection1.iterator(); 

      // �÷��ǿ� �׸��� �ִ� ���� �ݺ�
      while (iterator.hasNext()) {
         if (collection2.contains(iterator.next())) {   
            iterator.remove(); // ���� ��� ����
         }                                              
      } 
   } 
}


