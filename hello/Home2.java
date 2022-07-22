import java.util.Scanner;
public class Home2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if((a == 0)&&(b == 0)&&(c == 0))
				break;
			if(a==0)
			{
				a = c/b; 
			}
			if(b==0)
			{
				b = c/a;
			}
			if(c==0)
			{
				c = a*b;
			}
			System.out.printf("%d %d %d\n",a, b, c);
		}
		
	}

}
