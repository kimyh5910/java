package chap10;

class MyDate {
	int year = 2035;
	int month = 12;
	int day = 25;
}

public class NullPointExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate d = null;
		
		try {	
			System.out.printf("%d�� %d�� %d��\n", d.year, d.month,d.day);
		}
		catch (NullPointerException e) {
			System.out.println("�����Ͱ� NULL�� ���� �����Ͽ����ϴ�.");
			d = new MyDate();
			System.out.printf("%d�� %d�� %d��\n", d.year, d.month,d.day);
		}
		
	}

}
