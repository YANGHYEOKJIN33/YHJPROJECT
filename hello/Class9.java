
public class Class9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {32, 23, 25, 46, 24, 36, 74, 53};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
