class Person{
	String name;
	String Address;
	String Number;
	public Person(String name, String Address, String Number) {
		this.name = name;
		this.Address = Address;
		this.Number = Number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String name) {
		this.Address = Address;
	}

	public String getPhoneNumber() {
		return Number;
	}
	public void setPhoneNumber(String name) {
		this.Number = Number;
	}
}

class Customer extends Person{
	int IdNumber;
	int Mileage;
	public Customer() {
		
	}
	public Customer(int IdNumber,int Mileage) {
		this.IdNumber = IdNumber;
		this.Mileage = Mileage;
	}

	public int getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(int i) {
		this.IdNumber = IdNumber;
	}

	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int i) {
		// TODO Auto-generated method stub
		this.Mileage = Mileage;
	}
}
public class pcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setName("양현주");
		c1.setAddress("제주시 노형동");
		c1.setPhoneNumber("010-1234-5678");
		c1.setIdNumber(1);
		c1.setMileage(500);
		
		Customer c2 = new Customer(2,300);
		c1.setName("김동글");
		c1.setAddress("제주시 아라동");
		c1.setPhoneNumber("010-1111-1111");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
