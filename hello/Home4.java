import java.util.Scanner;
public class Home4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String counts1 = new String(); //1�� �迭 ����
		String[] counts3 = new String[100]; //3�� �迭 ����
		int a = 0;
		counts1 = sc.next();	//1�� �迭 �Է�
		int size = counts1.length();	//1�� �迭�� ����
		int size2 = sc.nextInt();	//2���Է�   
		for(int i = 0; i < size2; i++) 
		{
			// 3���ڿ� �Է�
			counts3[i] = sc.next();
		}
		int count = 0;
		for(int x = 0 ; x < size2 ; x++) {	//������ ������ŭ ���ʴ�� �ݺ�
			for(int i = 0 ; i < 10 ; i++) {	//���� �̵�
				for(int z = 0 ; z < size ; z++)	//1�� �迭�� 3�� �迭 �� ��� ��
					if(counts1.charAt(z) == counts3[x].charAt((i+z)%10))
						a++;
				if(a == size) {	//��� ��� ��ġ�� �� ī��Ʈ
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
