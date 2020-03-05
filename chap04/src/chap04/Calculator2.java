package chap04;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal2 cal2 = new Cal2(10, 5);
//		cal2.a = 10;
//		cal2.b = 5;
		
		cal2.sum();
		
		Cal3 cal3 = new Cal3();
		
		
		cal3.sub();
		
	}
}

class Cal2 {
	int a; // int 타입의 변수를 사용자가 초기화하지 않을 경우 기본값이 0이 들어감
	int b;
	
	// 생성자로서 자동 실행 됨
	// 생성자를 이용한 멤버 변수의 초기화
	public Cal2(int x, int y) {
		a = x;
		b = y;
	}
	
	public void sum() {
		int c = a + b;
		System.out.println("a + b = " + c);
	}
}

class Cal3 {
	private int a;
	private int b;
	
	// 생성자
	// 생성자는 이름이 클래스와 동일해야 함
	// 생성자는 반환 타입이 없음(반환 타입 입력 부분 자체가 없음)
	// 사용자가 생성자를 만들지 않았을 경우 자동으로 컴파일러가 내용이 빈 생성자를 생성하여 실행함
	// 만약 사용자가 내용이 빈 생성자를 만들었을 경우 컴파일러는 생성자를 자동 생성하지 않음
	// 사용자가 생성자를 하나라도 만들었을 경우 컴파일러는 빈 생성자를 자동 생성하지 않음
	// 생성자도 오버로딩이 가능함
	
	public Cal3() { // 생성자를 이용하여 멤버 변수를 초기화
		a = 10;
		b = 5;
	}

	// 생성자 오버로딩으로 인하여 만들어진 여러개의 생성자
	public Cal3(int x) { // 매개변수로 값을 1개 받아서 멤버변수를 초기화
		a = x;
		b = a - 5;
	}
	
	public Cal3(int x, int y) {
		a = x;
		b = y;
				
	}
	
	public void sub() {
		int c = a - b;
		System.out.println("a - b = " + c);
	}
}
