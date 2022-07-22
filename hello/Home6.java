import java.util.Scanner;
public class Home6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int output = 1;
		for(int i = 1; i <= input ; i++)
		{
			output *= i;
			
		}
		System.out.printf("%d", output);
	}

}
