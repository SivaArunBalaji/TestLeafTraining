package week2.day1;

public class Library {
	
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	protected void issueBook() {
		System.out.println("Book issued successfully");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library books = new Library();
		System.out.println(books.addBook("Java"));
		books.issueBook();

	}

}
