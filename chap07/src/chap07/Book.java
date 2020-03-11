package chap07;

// 사용자가 생성한 클래스 객체를 비교하기 위해서 Comparable 인터페이스를 상속받아 구현해야 함
// CompareTo() 메서드를 구현해야 함
// 클래스가 인터페이스를 상속받을려면 implements 사용
public class Book implements Comparable {
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	void show() {
		System.out.println("Book [price = " + price + "]");
	}
	
	public int comapreTo(Object o) {
		Book b = (Book) o;
		
		if(this.price < b.price) {
			return 1;
		}
		else if(this.price == b.price) {
			return 0;
		}
		else {
			return -1;
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

	