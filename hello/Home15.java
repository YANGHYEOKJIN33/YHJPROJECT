
public class Home15 {
	
		private int month;
		private int day;
		private int year;
		
		private static final int[] daysPerMonth =
			{0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
	
	
	public Home15(int month, int day, int year) {
		
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException(
					"month("+ month + ") must be 1 - 12");
		}
		
		if (day <= 0 ||
				(day > daysPerMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException(
					"day("+ day + ") out-of-range for the specified month and year");
		}
		
		if (month == 2 && day == 29 && !(year % 400 == 0 ||(year % 4 == 0 && year %100 != 0))) {
			throw new IllegalArgumentException(
					"day("+ day + ") out-of-range for the specified month and year");
		}
		
		if (year < 0 ) {
			throw new IllegalArgumentException(
					"year("+ year + ") must be over 1");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
		
	}
	private void nextDay() {
        if (day == 28 && month == 2 && (year % 400 == 0 ||(year % 4 == 0 && year %100 != 0))) {
        	day += 1;
        } 
        else if (day >= daysPerMonth[month]) {
        	nextMonth();       
        } 
        else
        	day += 1;
    }

    private void nextMonth() {
        if (month == 12) {
        	nextYear();
        } 
        else {
        	month += 1;
        	day = 1;
        }
    }
    private void nextYear() {
        year += 1;
        month = 1;
        day = 1;
        }
    
	public String toString() {
		
		return String.format("%d,%d,%d", month, day, year);
	}
	


		public static void main(String[] args) {
	         Home15 d1 = new Home15(2, 28, 2000);

	         for (int i = 0; i < 10; i++) {

	         d1.nextDay();

	         System.out.println(d1.toString());

	         }
	      }
	}


