
class Publication{
	String title;
	double price;
	public Publication(String title, double price) {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void Sell(int qty) {
		 System.out.println(price*qty);
	}
}
class Book extends Publication{
	String author;
	public Book(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void Sell(int qty) {
		System.out.println((price*qty)-(1000*qty));
	}
	public String toString() {
		return title+ "\n" + price + "\n" + author;
	}

}

class Magazine extends Publication{
	String issue;
	public Magazine(String title, double price) {
		super(title, price);
		// TODO Auto-generated constructor stub
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public void Sell(int qty) {	
		System.out.println((price*qty)-(500*qty));
	}
	public String toString() {
		return title+ "\n" + price + "\n" + issue;
	}

}

public class PublicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(null, 0);		
		book.setTitle("∞¥√•");
		book.setPrice(50000);
		book.setAuthor("æÁ«ˆ¡÷");
		System.out.println(book.toString());
		book.Sell(2);
		
		
		Magazine magazine = new Magazine(null, 0);
		magazine.setTitle("¿‚√•");
		magazine.setPrice(10000);
		magazine.setIssue("æÁ«ı¡¯");
		System.out.println(magazine.toString());
		magazine.Sell(2);
		
	}

}
