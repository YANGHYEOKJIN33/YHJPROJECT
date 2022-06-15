import java.util.Scanner;
public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
				
		while(true)
		{
			b += 1;
			if(a%2==0)
			{
				a = a/2;
			}
			else
			{
				a = 3*a+1;
			}
			if(a == 1)
				break;
		}
		System.out.printf("%d", b);
	}

}
