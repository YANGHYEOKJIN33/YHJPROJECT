abstract class Shape{
	String toString;
	String color;
	double getArea;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getToString() {
		return toString;
	}

	public void setToString(String toString) {
		this.toString = toString;
	}

	public double getGetArea() {
		return getArea;
	}

	public void setGetArea(double getArea) {
		this.getArea = getArea;
	}

	public Shape(String toString,double getArea, String color) {
		this.toString = toString;
		this.getArea = getArea;
		this.color = color;
	}
	
	

}

class Rectangle extends Shape{

	int length;
	int width;
	
	public Rectangle(String toString, double getArea, String color) {
		super(toString, getArea, color);
		// TODO Auto-generated constructor stub
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void Area(int length, int width) {
		 double getArea = length*width;
		System.out.println("Area is =" + getArea);
	}
	
	public String toString() {
		return "[length = " + length +" width = " + width + " Shape[color = "+color +"]]";
	}

}

class Triangle extends Shape{

	int base;
	int height;
	
	public Triangle(String toString, double getArea, String color) {
		super(toString, getArea, color);
		// TODO Auto-generated constructor stub
	}

	

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void Area(int length, int width) {
		 double getArea = base*height/2;
		System.out.println("¿µ¿ªÀº " + getArea);
	}
	
	public String toString() {
		return "[base = " + base +" height = " + height + "Shape[color = "+color+"]]";
	}
}

public class Home16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle(null, 0, "red");
		
		
		rectangle.setLength(4);
		rectangle.setWidth(5);
		System.out.println(rectangle.toString());
		rectangle.Area(4,5);
		
		
		Triangle triangle = new Triangle(null, 0, "blue");
		
		
		triangle.setBase(4);
		triangle.setHeight(5);
		System.out.println(triangle.toString());
		triangle.Area(4,5);
	}

}
