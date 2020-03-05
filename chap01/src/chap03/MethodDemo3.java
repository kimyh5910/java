package chap03;

public class MethodDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2 수의 사칙연산을 출력하는 메서드 4가지 방식으로 생성
		// 기본적으로 자바스크립트의 함수와 동일한 사용형태를 가지고 있음
		// 반환타입 설정과 매개변수 선언 시 데이터 타입을 확실히 해야 함
		method1(); // 1번 방식으로 실행
		method2(20,5); // 2번 방식으로 실행, 매개변수 존재
		int[] result3 = new int[4]; // 3번 방식으로 실행
		result3 = method3();
		
		System.out.println("---- 3번 방식 함수 ----");
		System.out.println("변수 a + b 는 : " + result3[0]);
		System.out.println("변수 a + b 는 : " + result3[1]);
		System.out.println("변수 a + b 는 : " + result3[2]);
		System.out.println("변수 a + b 는 : " + result3[3]);
		
		int[] result4 = new int[4]; // 4번 방식으로 실행
		result4 = method4(20,5);
		
		System.out.println("---- 4번 방식 함수 ----");
		System.out.println("변수 a + b 는 : " + result4[0]);
		System.out.println("변수 a + b 는 : " + result4[1]);
		System.out.println("변수 a + b 는 : " + result4[2]);
		System.out.println("변수 a + b 는 : " + result4[3]);
	}

	// 1번 방식, 매개변수 x, 반환값 x
	public static void method1() {
		int a = 20;
		int b = 5;
		int c = a + b;
		
		System.out.println("---- 1번 방식 함수 ----");
		
		System.out.println("변수 a + b 는 : " + c);
		
		c = a - b;
		System.out.println("변수 a - b 는 : " + c);
		
		c = a * b;
		System.out.println("변수 a * b 는 : " + c);
		
		c = a / b;
		System.out.println("변수 a / b 는 : " + c);
	}
	
	// 2번 방식, 매개변수 o, 반환값 x
	public static void method2(int a, int b) {
		int c = a + b;
		
		System.out.println("---- 2번 방식 함수 ----");
		
		System.out.println("변수 a + b 는 : " + c);
		
		c = a - b;
		System.out.println("변수 a - b 는 : " + c);
		
		c = a * b;
		System.out.println("변수 a * b 는 : " + c);
		
		c = a / b;
		System.out.println("변수 a / b 는 : " + c);
	}
	
	// 3번 방식, 매개변수 x, 반환값 o
	public static int[] method3() {
		int a = 20;
		int b = 5;
		
		// 4가지 연산의 결과값을 한번에 반환하기 위해서 배열을 사용
		int[] c = new int[4]; // 배열 선언
		c[0] = a + b;
		c[1] = a - b;
		c[2] = a * b;
		c[3] = a / b;
		
		return c;
		
	}
	
	// 3번 방식, 매개변수 o, 반환값 o
	public static int[] method4(int a, int b) {
		int[] c = new int[4];
		c[0] = a + b;
		c[1] = a - b;
		c[2] = a * b;
		c[3] = a / b;
		c[4] = 100; // 선언된 배열의 최대 크기를 벗어난 곳에 접근으로 인하여 오류 발생
		
		return c;
	}
}
