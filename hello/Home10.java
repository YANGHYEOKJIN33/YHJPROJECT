public class Home10 {
	static class point{
		public static double Distance(int x1,int y1,int x2,int y2) {
			 
			return  Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		}
		public static double Distance(int x1,int y1,int z1,int x2,int y2,int z2) {		
			
			return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2) + Math.pow((z1-z2), 2));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%.6f\n",point.Distance(0, 0, 2, 2));
		System.out.printf("%.6f",point.Distance(0, 0, 0, 3, 3, 3));
	}

}
