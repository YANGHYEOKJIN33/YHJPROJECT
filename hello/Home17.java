class A{
	String toString;
	String A;
	public String getToString() {
		return toString;
	}
	public void setToString(String toString) {
		this.toString = toString;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
}

class B extends A{
	String toString;
	String B;

	public String getToString() {
		return toString;
	}
	public void setToString(String toString) {
		this.toString = toString;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
}

class C extends B{

	String toString;
	String C;
	public String getToString() {
		return toString;
	}
	public void setToString(String toString) {
		this.toString = toString;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
}

public class Home17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a2 = b;
		B b2 = new B();
		if(a2 instanceof B) {
			B bb = (B)a2;
			System.out.println("a2을 B타입으로 캐스팅");
		}
		else {
			System.out.println("캐스팅 실패");
		}
		if(b2 instanceof B) {
			B bb = (B)b2;
			System.out.println("b2을 B타입으로 캐스팅");
		}
		else {
			System.out.println("캐스팅 실패");
		}
		
		
		C c1 = new C();
		A a1 = c1;
		if(a1 instanceof C) {
			C c = (C)a1;
			System.out.println("a1을 C타입으로 캐스팅");
		}
		else {
			System.out.println("캐스팅 실패");
		}
		
		B b1 = c1;
		if(b1 instanceof C) {
			C c = (C)b1;
			System.out.println("b1을 C타입으로 캐스팅");
		}
		else {
			System.out.println("캐스팅 실패");
		
		}
		if(c1 instanceof C) {
			C c = (C)c1;
			System.out.println("c1을 C타입으로 캐스팅");
		}
		else {
			System.out.println("캐스팅 실패");
		}
		

		
	}
}
