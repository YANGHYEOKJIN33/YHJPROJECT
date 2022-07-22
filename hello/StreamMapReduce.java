import java.util.stream.IntStream;

public class StreamMapReduce {
   public static void main(String[] args) {
      // 2에서 20까지의 짝수 정수의 합
      System.out.printf("Sum of the even ints from 2 through 20 is: %d%n",
         IntStream.rangeClosed(1, 10)              // 1...10
                  .map((int x) -> {return x * 2;}) // multiply by 2
                  .sum());                         // sum
   } 
} 