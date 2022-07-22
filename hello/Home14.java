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
					 System.out.println("중복되는 수 입니다 다시입력하세요.");
					 System.exit(0); 
				 }//중복되는 입력값 확인
				 
			}//배열안에 입력
		}
		int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); //int형 변환
		for(int i = 1; i < args.length; i++) {
			userNumberlist.add(nums[i]);
		}  //string to list
        

	    for (int i = 0; i < userNumberlist.size(); i++) {
	         for (int j = 0; j < userNumberlist.size(); j++) {
	              if (lotterNumberlist.indexOf(i) == (lotterNumberlistCopy.indexOf(j))) {   // 중복 검사
	                   lotterNumberlist.removeAll(lotterNumberlist);
	                   lotterMaker();
	                }
	            }   
	        }            
										
		lotterNumberlist.sort(Comparator.naturalOrder()); // 오름차순 정렬
		System.out.println("사용자가 입력한 숫자 : " + userNumberlist);
		userNumberlist.retainAll(lotterNumberlist); //중복된 값
		System.out.println("생성된 로또 숫자 : " + lotterNumberlist);
		System.out.printf("일치하는 숫자의 개수 : %d\n", userNumberlist.size());
		System.out.println("일치하는 숫자 : " + userNumberlist);
				
	}
}	