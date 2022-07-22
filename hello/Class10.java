import java.util.ArrayList;
import java.util.Scanner;
public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i=0; i < 6; i++) {
			nameList.add(i, sc.next());
		}
		int longName = 0;
		for(int i=0; i<nameList.size();i++) {
			if(nameList.get(longName).length() < nameList.get(i).length())
				longName = i;
						
			}
			
		System.out.println(longName);	
			
		}
		
		
	

}
