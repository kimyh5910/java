package chap04;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		public static void sum() {
//			int a = 10;
//			int b = 5;
//			System.out.println(a + b);

//	단순 메서드 방식
//	sum();
//	}

		
		// 클래스를 이용해서 실행하는 방식
		Cal cal = new Cal();
		cal.a = 10;
		cal.b = 5;
		
		cal.sum();
		cal.sub();
		cal.multi();
		cal.div();
	}
	

}


class Cal {
	int a; // 멤버변수(클래스 멤버 변수) 해당 클래스 내에서는 언제 어디서든 사용 가능
	int b;
	
	void sum() { // 멤버 메서드 / 이 메서드를 사용하려면 클래스를 인스턴스화 해야 사용 가능
		int c = a + b; // 지역변수는 인스턴스화 작업을 거치지 않으면 메모리에 로딩되지 않음
		System.out.println(a + " + " + b + " = " + c);
	}
	
	void sub() {
		int c = a - b;
		System.out.println(a + " - " + b + " = " + c);
	}
	
	void multi() {
		int c = a * b;
		System.out.println(a + " * " + b + " = " + c);
	}
	
	void div() {
		int c = a / b;
		System.out.println(a + " / " + b + " = " + c);
	}
}