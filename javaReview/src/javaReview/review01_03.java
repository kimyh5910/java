package javaReview;

public class review01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드 : 자바스크립트의 함수와 동일한 개념을 가지고 있음, 어떤 특정한 기능을 수행하기 위해서 위한 코드의 모임, 함수는 혼자서 동작하지만 메서드는 클래스의 멤버 포함되어서 동작함
		// 메서드 오버로딩 : 하나의 클래스 내에서 동일한 이름의 메서드를 여러개 사용하는 것
		// 오버로딩 기준 : 1. 매개변수의 개수가 다를 것
		//			   2. 매개변수의 타입이 다를 것
		
		// 메서드 실행 : 동일한 클래스 내에서 멤버 메서드를 호출시는 메서드명만 입력하여 호출
		//			   다른 클래스에 있는 메서드를 호출 시는 객체명.메서드명 형식으로 호출
		
		// 1번 방식으로 메서드 생성 및 실행
		sum();
		sub();
		multi();
		div();
	}
	
	// 4칙 연산 메서드
	// 1번 방식으로 생성(매개변수x, 반환타입x)
	public static void sum() {
		// 접근제한자 : public 외부에서 접근 가능
		// static : 클래스가 메모리에 로드 시 같이 메모리에 로드됨
		// 반환타입 : void 반환값 없음
		int a = 20;
		int b = 10;
		System.out.println("변수 a + b는" + (a + b));
	}
	
	public static void sub() {
		int a = 20;
		int b = 10;
		System.out.println("변수 a - b는" + (a - b));
	}
	
	public static void multi() {
		int a = 20;
		int b = 10;
		System.out.println("변수 a * b는" + (a * b));
	}
	
	public static void div() {
		int a = 20;
		int b = 3;
		System.out.println("변수 a / b는" + (a / b));
	}
	
}
