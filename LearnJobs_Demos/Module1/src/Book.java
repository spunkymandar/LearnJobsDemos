
public class Book {
	public String bookName;
	public String bookAuthor;
	public double bookPrice;
	
	public Book(String bookName, String bookAuthor,double bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice=bookPrice;
	}
	
	public void displayBookInformation() {
		System.out.println(bookName +" , "+bookAuthor +" , "+bookPrice);
	}
	
	

}
