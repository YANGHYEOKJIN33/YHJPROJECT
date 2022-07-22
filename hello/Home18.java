interface Payable { 
	double getPaymentAmount(); 
} 

class Invoice implements Payable {
	   private final String partNumber; 
	   private final String partDescription;
	   private final int quantity;
	   private final double pricePerItem;

	   
	   public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
	      if (quantity < 0) { 
	         throw new IllegalArgumentException("Quantity must be >= 0");
	      }
	      
	      if (pricePerItem < 0.0) { 
	         throw new IllegalArgumentException(
	            "Price per item must be >= 0");
	      }

	      this.quantity = quantity;
	      this.partNumber = partNumber;
	      this.partDescription = partDescription;
	      this.pricePerItem = pricePerItem;
	   } 

	  
	   public String getPartNumber() {
		   return partNumber;
	   }

	   
	   public String getPartDescription() {return partDescription;}

	   
	   public int getQuantity() {return quantity;}

	   
	   public double getPricePerItem() {return pricePerItem;}

	   
	   @Override
	   public String toString() {
	      return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", 
	         "invoice", "part number", getPartNumber(), getPartDescription(), 
	         "quantity", getQuantity(), "price per item", getPricePerItem());
	   } 

	   
	   @Override                                                           
	   public double getPaymentAmount() {                                  
	      return getQuantity() * getPricePerItem(); // calculate total cost
	   }                                                                   
	} 

abstract class Employee1 implements Payable {
	   private final String firstName;
	   private final String lastName;
	   private final String socialSecurityNumber;

	   
	   public Employee1(String firstName, String lastName, 
	      String socialSecurityNumber) {
	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.socialSecurityNumber = socialSecurityNumber;
	   } 

	  
	   public String getFirstName() {return firstName;}

	  
	   public String getLastName() {return lastName;}

	 
	   public String getSocialSecurityNumber() {return socialSecurityNumber;}

	   
	   @Override
	   public String toString() {
	      return String.format("%s %s%nsocial security number: %s", 
	         getFirstName(), getLastName(), getSocialSecurityNumber());
	   }

	   
	   public abstract double earnings(); 

	  
	   public double getPaymentAmount() {return earnings();}            
	} 

class SalariedEmployee extends Employee1 {
	   private double weeklySalary;

	   
	   public SalariedEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double weeklySalary) {
	      super(firstName, lastName, socialSecurityNumber); 

	      if (weeklySalary < 0.0) {
	         throw new IllegalArgumentException(
	            "Weekly salary must be >= 0.0");
	      }

	      this.weeklySalary = weeklySalary;
	   } 

	  
	   public void setWeeklySalary(double weeklySalary) {
	      if (weeklySalary < 0.0) {
	         throw new IllegalArgumentException(
	            "Weekly salary must be >= 0.0");
	      }

	      this.weeklySalary = weeklySalary;
	   } 

	 
	   public double getWeeklySalary() {return weeklySalary;}

	   
	   @Override                                                           
	   public double earnings() {return getWeeklySalary();}                

	  
	   @Override                                                   
	   public String toString() {                                  
	      return String.format("salaried employee: %s%n%s: $%,.2f",
	         super.toString(), "weekly salary", getWeeklySalary());
	   }                                                           
	} 

class PieceWorker extends Employee1 {
	private double wage;
	private int pieces;

	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);

		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {

		this.wage = wage;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	@Override
	public String toString() {
		return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", super.toString(), "piece wage", getWage(),
				"number of pieces", getPieces());
	}
}

public class Home18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payable[] payableObjects = new Payable[] {
		         new Invoice("01234", "seat", 2, 375.00),
		         new Invoice("56789", "tire", 4, 79.95),
		         new SalariedEmployee("현주", "양", "111-11-1111", 800.00),
		         new SalariedEmployee("혁진", "양", "888-88-8888", 1200.00)
		      };
		      
		      for (Payable currentPayable : payableObjects) {
		        
		         System.out.printf("%n%s %npayment due: $%,.2f%n", 
		            currentPayable.toString(), 
		            currentPayable.getPaymentAmount()); 
		      } 
	} 
} 