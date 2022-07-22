import java.util.Scanner;
public class Home3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int Sum, d;
		int[] counts = new int[10];
		Sum	= a * b * c;
		while(Sum > 0) {
			d = Sum % 10;
			if(d == 0)
				counts[0] ++;
			if(d == 1)
				counts[1] ++;
			if(d == 2)
				counts[2] ++;
			if(d == 3)
				counts[3] ++;
			if(d == 4)
				counts[4] ++;
			if(d == 5)
				counts[5] ++;
			if(d == 6)
				counts[6] ++;
			if(d == 7)
				counts[7] ++;
			if(d == 8)
				counts[8] ++;
			if(d == 9)
				counts[9] ++;
			
			Sum = Sum / 10;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}


	}
	
}
