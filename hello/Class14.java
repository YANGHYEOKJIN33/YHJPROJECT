abstract class Vehicle{
	abstract void move();
	}

class Car extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("���η� �ٴѴ�");
	}
	
}

class Ship extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("���η� �ٴѴ�");
	}
	
}

class Plane extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("�ϴ÷� �ٴѴ�");
	}
	
}

class Use{
	void VehicleUse(Vehicle a) {
		a.move();
	}

	public void VehicleUse(Car car1) {
		// TODO Auto-generated method stub
		
	}
	public void VehicleUse(Ship ship1) {
		// TODO Auto-generated method stub
		
		
	}
	public void VehicleUse(Plane plane1) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		Ship ship1 = new Ship();
		Plane plane1 = new Plane();
		
		Use vUse = new Use();
		vUse.VehicleUse(car1);
		vUse.VehicleUse(ship1);
		vUse.VehicleUse(plane1);
	}

}
