import java.util.Scanner;
public class Home8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++) {
			if(i%2 == 1)
				num *= i;
		}
		System.out.printf("%d", num);
		
		
		
	}

}
