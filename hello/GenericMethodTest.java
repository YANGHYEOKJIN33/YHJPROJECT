public class GenericMethodTest {
   public static void main(String[] args) {
      // Integer, Double �� Character�� �迭 ����
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

      System.out.printf("Array integerArray contains: ");
      printArray(integerArray); // ���� �迭 ����
      System.out.printf("Array doubleArray contains: ");
      printArray(doubleArray); // ������ �迭 ����
      System.out.printf("Array characterArray contains: ");
      printArray(characterArray); // ������ �迭 ����
   }

   // generic method printArray                     
   public static <T> void printArray(T[] inputArray) {
      // display array elements            
      for (T element : inputArray) {       
         System.out.printf("%s ", element);
      }                                    

      System.out.println();
   } 
} 