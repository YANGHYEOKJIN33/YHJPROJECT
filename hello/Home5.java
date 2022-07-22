import java.util.Scanner;
public class Home5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] counts = new int[num];
		int count = 0;
		
		for(int i = 0; i < num; i++)
		{
			int num1 = sc.nextInt();
			counts[i] = num1; 
		}
		
		for(int i = 0; i < num; i++)
		{
			if(counts[i] > 0)
			{
				count++;
			}
			
		}
		System.out.printf("%d", count);
	}

}
