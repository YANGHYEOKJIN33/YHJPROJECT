
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10/num;
		}
		catch(AritmeticException e) {
			System.out.println("������ 0���� ������ �ȵſ�");
		}
		System.out.println("�����");
	}

}
