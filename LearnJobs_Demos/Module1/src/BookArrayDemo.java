
public class BookArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookArray=new Book[] {new Book("Learn Java","Uday",2500),
				new Book("Learn Java 8.0","Uday",1700),
				new Book("Learn Java 9.0","Narayan",3500)};
		
		findBookbyMaxPrice(bookArray);
		findBookbyMinPrice(bookArray);
		
		int[] numbers=new int[] {10,50,20,40};
		findMaxNumber(numbers);

	}

	private static void findMaxNumber(int[] numbers) {
		int max=0;
		for(int number:numbers)
			if(number>max)
				max=number;
		System.out.println("maximum is :"+max);
	}
	
	private static void findBookbyMaxPrice(Book[] bookArray) {
		// TODO Auto-generated method stub
		double max=0;
		Book maxBook=null;//null reference says there is no object connectd with reference 
		for(Book book:bookArray)
			if(book.bookPrice>max) {
				max=book.bookPrice;
				maxBook=book;
			}
		
		maxBook.displayBookInformation();
	}
	


	private static void findBookbyMinPrice(Book[] bookArray) {
		// TODO Auto-generated method stub
		
		
	}

	

}
