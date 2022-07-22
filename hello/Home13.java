import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;
public class Home13 {

	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자 6개를 입력하세요 :");
		int[] userNumber = new int[6]; 
		for(int i = 0; i < 6; i++)
		{
			userNumber[i] = sc.nextInt(); 
			for(int j = 0; j < i; j++) {
				 if (userNumber[i] == userNumber[j]) {
					 System.out.println("중복되는 수 입니다 다시입력하세요.");
					 i--;	 
				 }//중복되는 입력값 확인
				 
			}//배열안에 입력
		}
		Arrays.sort(userNumber); // 배열 오름차순 정렬
		int[] lotterNumber = new int[6];
		for(int i = 0; i < 6; i++) {
			lotterNumber[i] = 1 + randomNumbers.nextInt(45);
			for(int j = 0; j < i; j++) {
				if(lotterNumber[i] == lotterNumber[j]) {
					i--;
					break; //로또번호 중복제거
				}
			}
		} // 로또 번호저장
		Arrays.sort(lotterNumber); // 로또번호 오름차순 정렬
		int count = 0; //로또 일치 숫자
		int x = 0;
		int[] sameNumber = new int[6];
		for(int i = 0; i < 6; i++) {
			  for (int j = 0; j < i; j++) {
				  if (userNumber[i] == lotterNumber[j]) {					  
					  sameNumber[x] = lotterNumber[j]; 
					  x++;
					  count++;	// 일치하는 숫자를 저장하는데 숫자가 저장되면 종료		  
					  }
					  		  
			}
		}// 일치된 숫자를 저장하고 카운트
		
		System.out.printf("사용자가 입력한 숫자 :");
		System.out.println(Arrays.toString(userNumber));
		System.out.printf("생성된 로또 숫자 :");
		System.out.println(Arrays.toString(lotterNumber));		
		System.out.printf("일치하는 숫자의 개수 : ");
		System.out.printf("%d\n", count);
		System.out.printf("일치하는 숫자 : ");
		System.out.println(Arrays.toString(sameNumber));	 
	}

}

// 1. 사용자는 1부터 45까지 6개의 다른 숫자로 구성된 로또 번호를 추측하려고 합니다. 따라서 프로그램은 사용자로부터 6개의 다른 숫자를 입력합니다.
// 2. 이 때 프로그램은 중복 번호를 확인하고 오류 메시지를 사용자에게 알리고 사용자에게 번호를 다시 입력하라는 메시지를 표시해야 합니다.
// 3. 이 프로그램은 안전한 랜덤 클래스를 사용하여 6개의 다른 복권 번호를 생성합니다.
// 4. 프로그램은 사용자가 입력한 번호, 생성된 로또 번호, 일치하는 총 번호, 일치하는 번호를 오름차순으로 인쇄합니다.