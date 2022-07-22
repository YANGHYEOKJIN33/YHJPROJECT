
class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println(name + "(이)가 멍하고 짖습니다.");
	}
}
class Cat extends Animal{

	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void meow() {
		System.out.println(name + "(이)가 야옹하고 웁니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("벨라");
		Cat cat = new Cat ("코코");
		
		dog.bark();
		dog.eat();
		dog.sleep();
		
		System.out.println();
		
		cat.meow();
		cat.eat();
		cat.sleep();
		
	}

}

