import java.util.Scanner;
//0�� �޸� 1�� �ո�
//�� D 0�� 4��		0
//�� C 0�� 3��		1
//�� B 0�� 2��		2
//�� A 0�� 1��		3
//�� E 1�� 4��		4

public class Yutnori {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		//���� ��3�� 4���� �ް� ����� ������� 3�� ����Ѵ�.

		

		int num[][] = new int[3][4];//3�� 4���� ���ڸ� ����

		int result[] =new int[3];	//���	

		

		for(int i=0; i<3; i++){		//3�� �ްٴ�

			for(int j=0; j<4; j++){	//4�� �ްٴ�

				num[i][j] = sc.nextInt();

				if(num[i][j]==1){

					result[i] = result[i] + 1;	//i���� ���������ʰ� j�� ���� �����Ҷ� j�� 1�̸� result�� 1�� ������Ų��.

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