package chap10;

public class GenMethod3Demo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket[] a = {new Ticket(5), new Ticket(3), new Ticket(10), new Ticket(7), new Ticket(7), new Ticket(4)};
		
		System.out.println(countGT(a,a[4]));
	}
	// Comparable �� �������̽������� ���׸� ������ ����� ��� extends Ű���带 �����
	// �������̽� Comparable �� ��ӹ��� Ticket Ŭ���� Ÿ�Ը� ���׽� T �� ����� �� ����
	public static <T extends Comparable> int countGT(T[] a, T elem) {
		int count = 0;
		
		for (T e : a) {
			if (e.compareTo(elem) > 0) {
				++count;
			}
		}
		return count;
	}

}

class Ticket implements Comparable {
	int no;
	
	public Ticket(int no) {
		this.no = no;
	}
	
	public int compareTo(Object o) {
		Ticket t = (Ticket)o;
		int result = 0;
		
		if (no < t.no ) {
			result = -1;
		}
		else if (no > t.no) {
			result = 1;
		}
		else {
			result = 0;
		}
		return result;
	}
}