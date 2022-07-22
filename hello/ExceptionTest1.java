
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
		}
		catch(AritmeticException e) {
			System.out.println("정수를 0으로 나누면 안돼요");
		}
		System.out.println("실행됨");
	}

}
