package javaReview;

public class reviewOverlodading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드 오버로딩 : 하나의 클래스 내에서 동일한 이름의 메서드를 여러개 사용하는 것
//					   : 동일한 기능을 수행
		// 오버로딩 기준 : 1. 매개변수의 개수가 다를 것
		//			   2. 매개변수의 타입이 다를 것
		
		sum();
		sum(20,10);
		sum(20.0,10.0);
	}
	
	public static void sum() {
		int a = 20;
		int b = 10;
		System.out.print("변수 a + b = " + (a + b));
	}
	
	// 오버로딩된 sum함수 // 기본 sum함수와 매개변수의 개수가 다름
	public static void sum(int a, int b) {
		System.out.print("변수 a + b = " + (a + b));
	}
		
	// 오버로딩된 sum함수 // 정수를 매개변수로 받는 sum 함수와 매개변수의 타입이 다름
	public static void sum(double a, double b) {
		System.out.print("변수 a + b = " + (a + b));
	}
	
	// 매서드 오버로딩을 통하여 -, *, / 기능을 각각 3개씩 (기본 ,int 매개변수, double 매개변수) 생성
	public static void div() {
		int a = 20;
		int b = 10;
		System.out.print("변수 a - b = " + (a - b));
	}
	

	public static void div(int a, int b) {
		System.out.print("변수 a - b = " + (a - b));
	}
		

	public static void div(double a, double b) {
		System.out.print("변수 a - b = " + (a - b));
	}
	
	public static void a() {
		int a = 20;
		int b = 10;
		System.out.print("변수 a * b = " + (a * b));
	}
	
	public static void a(int a, int b) {
		
		System.out.print("변수 a * b = " + (a * b));
	}
	
	public static void a(double a, double b) {
		System.out.print("변수 a * b = " + (a * b));
	}
	
	public static void b() {
		int a = 20;
		int b = 10;
		System.out.print("변수 a / b = " + (a / b));
	}
	
	public static void b(int a, int b) {
		
		System.out.print("변수 a / b = " + (a / b));
	}
	
	public static void b(double a, double b) {
		System.out.print("변수 a / b = " + (a / b));
	}
	
} 