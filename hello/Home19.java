import java.util.InputMismatchException;
import java.util.Scanner;

class NegException extends Exception{
	
	public NegException() {
		// TODO Auto-generated constructor stub
		System.out.println("������ �Է��� �� ����");
	}
	
}
public class Home19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();	
			int b = sc.nextInt();
				if(a < 0) {
					NegException e1 = new NegException();
					throw e1;
			}
				if(b == 0) {
					ArithmeticException e2 = new ArithmeticException();
					throw e2;
			}
			
				System.out.println(a/b);
				

		}catch (InputMismatchException e3) {

			System.out.println("�ùٸ��� ���� �Է°��Դϴ�.");
		  
		} catch (ArithmeticException e2) {

				System.out.println("0���� ���� �� ����");
			  
		} catch (NegException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		finally {
				System.out.print("�Ϸ�");
			}
	}

}

