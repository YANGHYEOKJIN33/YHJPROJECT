import java.security.SecureRandom;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Home14 {

	private static final SecureRandom randomNumbers = new SecureRandom();
	static  ArrayList<Integer> lotterNumberlist = new ArrayList<Integer>();
	static ArrayList<Integer> userNumberlist = new ArrayList<Integer>();
	public static void lotterMaker() {
		
		for(int i = 0; i < userNumberlist.size(); i++) {
			int lotterNumber = 1 + randomNumbers.nextInt(45);
			lotterNumberlist.add(i, lotterNumber);			
		}		
	}
	static final ArrayList<Integer> lotterNumberlistCopy = (ArrayList<Integer>) lotterNumberlist.clone();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 1; i < args.length; i++)
		{ 
			for(int j = 1; j < i; j++) {
				 if (args[i] == args[j]) {
					 System.out.println("�ߺ��Ǵ� �� �Դϴ� �ٽ��Է��ϼ���.");
					 System.exit(0); 
				 }//�ߺ��Ǵ� �Է°� Ȯ��
				 
			}//�迭�ȿ� �Է�
		}
		int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); //int�� ��ȯ
		for(int i = 1; i < args.length; i++) {
			userNumberlist.add(nums[i]);
		}  //string to list
        

	    for (int i = 0; i < userNumberlist.size(); i++) {
	         for (int j = 0; j < userNumberlist.size(); j++) {
	              if (lotterNumberlist.indexOf(i) == (lotterNumberlistCopy.indexOf(j))) {   // �ߺ� �˻�
	                   lotterNumberlist.removeAll(lotterNumberlist);
	                   lotterMaker();
	                }
	            }   
	        }            
										
		lotterNumberlist.sort(Comparator.naturalOrder()); // �������� ����
		System.out.println("����ڰ� �Է��� ���� : " + userNumberlist);
		userNumberlist.retainAll(lotterNumberlist); //�ߺ��� ��
		System.out.println("������ �ζ� ���� : " + lotterNumberlist);
		System.out.printf("��ġ�ϴ� ������ ���� : %d\n", userNumberlist.size());
		System.out.println("��ġ�ϴ� ���� : " + userNumberlist);
				
	}
}	