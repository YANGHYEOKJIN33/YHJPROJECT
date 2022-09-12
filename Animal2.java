abstract class Animal{
	public abstract void eat();
	
}


interface Swimable{
	void swim();	
}

interface Flyable{
	void fly();
}

class Swan extends Animal implements Swimable, Flyable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("백조 먹다");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("백조 날다");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("백조 수영");
	}
	
}

public class Animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
