public class Home20 {
	public static void main(String[] args) {
		String str = "to be, or not to be: that is the question";
		for(char i = 97; i < 123; i++) {
			System.out.print("number of " + i + ": ");
			System.out.println(countChar(str, i)); 
		}
			

		}
	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
		}
	
}

