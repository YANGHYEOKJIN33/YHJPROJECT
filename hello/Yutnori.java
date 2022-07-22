import java.util.Scanner;
//0은 뒷면 1은 앞면
//윷 D 0이 4개		0
//걸 C 0이 3개		1
//개 B 0이 2개		2
//도 A 0이 1개		3
//모 E 1이 4개		4

public class Yutnori {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		//숫자 를3번 4개씩 받고 결과를 순서대로 3번 출력한다.

		

		int num[][] = new int[3][4];//3번 4개씩 숫자를 받음

		int result[] =new int[3];	//결과	

		

		for(int i=0; i<3; i++){		//3번 받겟다

			for(int j=0; j<4; j++){	//4번 받겟다

				num[i][j] = sc.nextInt();

				if(num[i][j]==1){

					result[i] = result[i] + 1;	//i값이 증가하지않고 j의 값이 증가할때 j가 1이면 result에 1씩 증가시킨다.

				}

			}			

		}

		for(int k=0; k<3; k++){

		switch(result[k]){

		case 0: 

			System.out.println("D");

			break;

		case 1:

			System.out.println("C");

			break;

		case 2:

			System.out.println("B");

			break;

		case 3:

			System.out.println("A");

			break;

		case 4:

			System.out.println("E");

			break;

		}

		}

		sc.close();

	}

}