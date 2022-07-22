import java.util.InputMismatchException;
import java.util.Scanner;

class NegException extends Exception{
	
	public NegException() {
		// TODO Auto-generated constructor stub
		System.out.println("음수는 입력할 수 없다");
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

			System.out.println("올바르지 않은 입력값입니다.");
		  
		} catch (ArithmeticException e2) {

				System.out.println("0으로 나눌 수 없다");
			  
		} catch (NegException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		finally {
				System.out.print("완료");
			}
	}

}

