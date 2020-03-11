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
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month,d.day);
		}
		catch (NullPointerException e) {
			System.out.println("데이터가 NULL인 곳에 접근하였습니다.");
			d = new MyDate();
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month,d.day);
		}
		
	}

}
