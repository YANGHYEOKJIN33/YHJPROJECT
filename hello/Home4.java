import java.util.Scanner;
public class Home4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String counts1 = new String(); //1번 배열 선언
		String[] counts3 = new String[100]; //3번 배열 선언
		int a = 0;
		counts1 = sc.next();	//1번 배열 입력
		int size = counts1.length();	//1번 배열의 길이
		int size2 = sc.nextInt();	//2번입력   
		for(int i = 0; i < size2; i++) 
		{
			// 3문자열 입력
			counts3[i] = sc.next();
		}
		int count = 0;
		for(int x = 0 ; x < size2 ; x++) {	//반지의 개수만큼 차례대로 반복
			for(int i = 0 ; i < 10 ; i++) {	//필터 이동
				for(int z = 0 ; z < size ; z++)	//1번 배열과 3번 배열 각 요소 비교
					if(counts1.charAt(z) == counts3[x].charAt((i+z)%10))
						a++;
				if(a == size) {	//모든 요소 일치할 시 카운트
					count++;
					a = 0;
					break;
				}
				else
					a = 0;
			}
		}
		System.out.printf("%d", count);
	}

}
