class ArgsException extends Exception{
	private int argsNumber;
	public int getArgsNumber() {
		return argsNumber;
	}
	
	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}
	public ArgsException(String msg) {
		super(msg);
	}
}
public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			if(args.length !=2 ) {
				ArgsException e = new ArgsException("���ڸ� �ΰ� �Է��ؾ� �մϴ�.");
				throw e;
			}
			
		
		else {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			System.out.println(num1+num2);
			
			}
		}
		catch(ArgsException a) {
			System.out.println(a.getMessage());
			System.out.println("�Է��� ���ڼ�: " + a.getArgsNumber());
		}
	}

}
