import java.util.Scanner;
public class Home12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(fibo(input));
	}
	public static int fibo(int n) {

		if (n <= 1)
			return n;
		else
			return fibo(n-2) + fibo(n-1);

	}

}
