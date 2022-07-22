public class GenericMethodTest {
   public static void main(String[] args) {
      // Integer, Double 및 Character의 배열 생성
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

      System.out.printf("Array integerArray contains: ");
      printArray(integerArray); // 정수 배열 전달
      System.out.printf("Array doubleArray contains: ");
      printArray(doubleArray); // 더블형 배열 전달
      System.out.printf("Array characterArray contains: ");
      printArray(characterArray); // 문자형 배열 전달
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