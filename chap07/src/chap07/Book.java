package chap07;

// ����ڰ� ������ Ŭ���� ��ü�� ���ϱ� ���ؼ� Comparable �������̽��� ��ӹ޾� �����ؾ� ��
// CompareTo() �޼��带 �����ؾ� ��
// Ŭ������ �������̽��� ��ӹ������� implements ���
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

	