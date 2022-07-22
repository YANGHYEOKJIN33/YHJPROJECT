class Person{
	String name;
	int Address;
	int age;
	public Person(String name, int Address, int age) {
		this.name = name;
		this.Address = Address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddress() {
		return Address;
	}
	public void setAddress(int address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class President extends Person{

	String nation;
	int salary;
	
	public President(String name, int Address, int age) {
		super(name, Address, age);
		// TODO Auto-generated constructor stub
	}
	public String getnation() {
		return nation;
	}
	public void setnation(String nation) {
		this.nation = nation;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
}

class Student extends Person{

	String schoolKind;
	int grade;
	
	public Student(String name, int Address, int age) {
		super(name, Address, age);
		// TODO Auto-generated constructor stub
	}
	public String getschoolKind() {
		return schoolKind;
	}
	public void setschoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public int getgrade() {
		return grade;
	}
	public void setgrade(int grade) {
		this.grade = grade;
	}
	
}


public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		President president1 = new President(null, 0, 0);
		Person person1 = president1;
		President president2 = (President)person1;
		Person person2 = new Person(null, 0, 0);
		//President persident3 = (President)person2; 원래는 안됨
		//Student student = (Student)president2; 자식간 케스팅 안됨
		
		
	}

}
