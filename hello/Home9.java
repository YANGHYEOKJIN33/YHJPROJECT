import java.util.Scanner;
public class Home9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double sum = 0;
		for(int i = 0; i < input; i++) {
			sum += 1/fac(i);
		}
		
		System.out.printf("%.6f", sum);
		
		
		
	}

	public static double fac(int input) {//���丮�� �Լ�
		if(input == 0)
			return 1;
		else
			return fac(input-1)*input;
	}
}