package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메서드 오버로딩 : 동일한 이름을 가지는 메서드 (여러개 가질수 있음)
			// 1. 매개변수의 수가 달라야함
			// 2. 반환값의 형태가 달라야함
		// 메서드 이름은 같지만 시그니처가 다른 메서드를 정의하는 것을 메서드 오버로딩이라고 한다.
		// 메서드 시그니처 : 매개변수의 개수, 데이터 타입, 순서를 의미

		// 메서드 오버로딩
		// 하나의 클래스에 동일한 이름의 메서드가 여러개 존재하는 것
		// 오버로딩의 조건은 매개변수의 갯수, 데이터 타입, 반환 타입이 서로 달라야함
		// 오버로딩 조건
		// 1. 매개변수의 개수
		// 2. 매개변수의 데이터 타입
		// 3. 매개변수의 순서
		
		int i1 = 3;
		int i2 = 7;
		int i3 = 10;
		
		double d1 = 7.0;
		double d2 = 3.0;
		
		System.out.printf("mad(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("mad(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("mad(%d, %d, %d) = %d\n", i1, i2, i3,max(i1, i2, i3));
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		sum();
		sum(x);
		sum(x,y);
		sum(x,y,z);
	}
	
	// max(int n1, int n2)와 max(double n1, double n2) 메서드는 서로 매개변수의 갯수는 동일하지만 매개변수의 데이터 타입이 다르므로 메서드 오버로딩이 적용되어 다른 메서드로 인식함
	public static int max(int n1, int n2) {
		int result = n2;
		
		if(n1 > n2) {
			result = n1;
		}
		else {
			result = n2;
		}
		
		return result;
	}

	public static double max(double n1, double n2) {
		double result = 0.0;
		
		if (n1 > n2) {
			result = n1;
		}
		else {
			result = n2;
		}
		
		return result;
	}
	
	// max(int n1, int n2)와 max(int n1, int n2, int n3) 메서드는 서로 사용하는 매개변수의 데이터 타입은 int 타입으로 동일하지만 매개변수의 갯수가 다르므로 메서드 오버로딩이 적용되어 다른 메서드로 인식함
	public static int max(int n1, int n2, int n3) {
//		return max(max(n1, n2), n3);
		
		int result = max(n1, n2); // max(int n1, int n2)를 사용하여 매개변수의 크기를 비교
		result = max(result, n3); // max(int n1, int n2)를 사용하여 매개변수의 크기를 비교
		
		return result;
	}
	
	public static void sum() {
		System.out.println("매개변수가 없는 sum함수");
	}
	
	public static void sum(int x) {
		System.out.println("매개변수가 1개인 sum 함수");
	}
	
	public static void sum(int x, int y) {
		System.out.println("매개변수가 2개인 sum 함수");
	}
	
	public static void sum(int x, int y, int z) {
		System.out.println("매개변수가 3개인 sum 함수");
	}
}
