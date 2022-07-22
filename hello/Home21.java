import java.util.Scanner;

public class Home21 {
	

	public static void main(String[] args) {
       // get sentence
	   
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a sentence and press Enter");
       String sentence = scanner.nextLine();

       // process user sentence
       String[] tokens = sentence.split(" ");
       String token;
       int[] arr = new int[10]; //단어 길이 저장
       int[] count = new int[10]; 
       for(int i = 0; i < tokens.length; i++) {
    	   token = tokens[i];
    	   arr[i] = token.length();
       }
       for(int i = 0; i < arr.length; i++) {
    	   count[arr[i]]++;
       }
       for(int i = 1; i < arr.length; i++) {
    	   System.out.println(i + "의 개수: " + count[i]);
       }
   } 
} 