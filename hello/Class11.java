import java.util.ArrayList;
import java.util.Scanner;
public class Class11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int count=0;
		int countMax=0;
		for(int i = 0; i < 10; i++) {
			numList.add(i, sc.nextInt());
		}
		for(int i:numList) {
			
			if(numList.get(i) == (numList.get(i+1))) {
				count++;
			}
			else {
				if(count>countMax)
					countMax=count;
			}
				
		}
		
		System.out.printf("%d", countMax);
	}

}
