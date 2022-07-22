import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;
public class Home13 {

	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� 6���� �Է��ϼ��� :");
		int[] userNumber = new int[6]; 
		for(int i = 0; i < 6; i++)
		{
			userNumber[i] = sc.nextInt(); 
			for(int j = 0; j < i; j++) {
				 if (userNumber[i] == userNumber[j]) {
					 System.out.println("�ߺ��Ǵ� �� �Դϴ� �ٽ��Է��ϼ���.");
					 i--;	 
				 }//�ߺ��Ǵ� �Է°� Ȯ��
				 
			}//�迭�ȿ� �Է�
		}
		Arrays.sort(userNumber); // �迭 �������� ����
		int[] lotterNumber = new int[6];
		for(int i = 0; i < 6; i++) {
			lotterNumber[i] = 1 + randomNumbers.nextInt(45);
			for(int j = 0; j < i; j++) {
				if(lotterNumber[i] == lotterNumber[j]) {
					i--;
					break; //�ζǹ�ȣ �ߺ�����
				}
			}
		} // �ζ� ��ȣ����
		Arrays.sort(lotterNumber); // �ζǹ�ȣ �������� ����
		int count = 0; //�ζ� ��ġ ����
		int x = 0;
		int[] sameNumber = new int[6];
		for(int i = 0; i < 6; i++) {
			  for (int j = 0; j < i; j++) {
				  if (userNumber[i] == lotterNumber[j]) {					  
					  sameNumber[x] = lotterNumber[j]; 
					  x++;
					  count++;	// ��ġ�ϴ� ���ڸ� �����ϴµ� ���ڰ� ����Ǹ� ����		  
					  }
					  		  
			}
		}// ��ġ�� ���ڸ� �����ϰ� ī��Ʈ
		
		System.out.printf("����ڰ� �Է��� ���� :");
		System.out.println(Arrays.toString(userNumber));
		System.out.printf("������ �ζ� ���� :");
		System.out.println(Arrays.toString(lotterNumber));		
		System.out.printf("��ġ�ϴ� ������ ���� : ");
		System.out.printf("%d\n", count);
		System.out.printf("��ġ�ϴ� ���� : ");
		System.out.println(Arrays.toString(sameNumber));	 
	}

}

// 1. ����ڴ� 1���� 45���� 6���� �ٸ� ���ڷ� ������ �ζ� ��ȣ�� �����Ϸ��� �մϴ�. ���� ���α׷��� ����ڷκ��� 6���� �ٸ� ���ڸ� �Է��մϴ�.
// 2. �� �� ���α׷��� �ߺ� ��ȣ�� Ȯ���ϰ� ���� �޽����� ����ڿ��� �˸��� ����ڿ��� ��ȣ�� �ٽ� �Է��϶�� �޽����� ǥ���ؾ� �մϴ�.
// 3. �� ���α׷��� ������ ���� Ŭ������ ����Ͽ� 6���� �ٸ� ���� ��ȣ�� �����մϴ�.
// 4. ���α׷��� ����ڰ� �Է��� ��ȣ, ������ �ζ� ��ȣ, ��ġ�ϴ� �� ��ȣ, ��ġ�ϴ� ��ȣ�� ������������ �μ��մϴ�.