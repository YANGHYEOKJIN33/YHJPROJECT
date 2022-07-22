import java.util.Scanner;
public class Home7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
	    double dec = 0;
	    int re = 0;
	    int i = 0;
	    while (bin != 0) {
	    		re = bin % 10;
	    		if(re == 1)
	    		{
	    			dec = dec + Math.pow(2, i);
	    		}
	    		bin /= 10;
	    		i++;
	    	
	    }
	    System.out.printf("%.0f", dec);
	}

}
