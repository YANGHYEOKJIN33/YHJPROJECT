import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum1 = num1 + num2;
		int sum2 = num1 - num2;
		int sum3 = num1 * num2;
		int sum4 = num1 / num2;
		int sum5 = num1 % num2;
		System.out.printf("%d\n", sum1);
		System.out.printf("%d\n", sum2);
		System.out.printf("%d\n", sum3);
		System.out.printf("%d\n", sum4);
		System.out.printf("%d\n", sum5);
		
		
	}

}
