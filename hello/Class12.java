import java.util.ArrayList;
import java.util.Scanner;

public class Class12 {
	static double num = 0;
	public static void Distance(int x1,int y1,int x2,int y2) {
		 
		num +=  Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> point = new ArrayList<Integer>();
		point.add(0, 0);
		point.add(1, 0);
		for(int i = 2; i < 12; i++) {
				point.add(i,sc.nextInt());
			}
			Distance(point.get(0),point.get(1),point.get(2),point.get(3));
			Distance(point.get(2),point.get(3),point.get(4),point.get(5));
			Distance(point.get(4),point.get(5),point.get(6),point.get(7));
			Distance(point.get(6),point.get(7),point.get(8),point.get(9));
			Distance(point.get(8),point.get(9),point.get(10),point.get(11));
			Distance(point.get(10),point.get(11),point.get(0),point.get(1));
			System.out.printf("%.0f",num);
		
	}

}
