import java.util.Scanner;
public class Home11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		System.out.printf("%.0f", power(base, exponent));
		
	}
	public static double power(int exponent, int base) {

		if(base == 0) {
			return 1;
		}
		else {
			return power(exponent, base-1)*exponent;
		}
	}

}
