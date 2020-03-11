package chap07;

import java.util.Arrays;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] books = new Book[3];
		books[0] = new Book(15000);
		books[1] = new Book(50000);
		books[2] = new Book(20000);
//		
//		Book[] books = new Book[3];
//		Book b1 = new Book(15000);
//		Book b2 = new Book(50000);
//		Book b3 = new Book(20000);
//		books[0] = b1;
//		books[1] = b2;
//		books[2] = b3;
		
//		Book[] books = {new Book(15000),new Book(50000),new Book(20000)};
		
		System.out.println("정렬 전");
		for (Book b : books) {
			b.show();
		}
		
		Arrays.sort(books);
		
		System.out.println("정렬 후");
		for (Book b : books) {
			b.show();
		}
	}

}

