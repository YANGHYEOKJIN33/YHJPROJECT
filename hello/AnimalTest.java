
class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println(name + "(��)�� ���ϰ� ¢���ϴ�.");
	}
}
class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void meow() {
		System.out.println(name + "(��)�� �߿��ϰ� ��ϴ�.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("����");
		Cat cat = new Cat ("����");
		
		dog.bark();
		dog.eat();
		dog.sleep();
		
		System.out.println();
		
		cat.meow();
		cat.eat();
		cat.sleep();
		
	}

}

