package chap04;

public class CircleDemo {
	static double radius; // 클래스 멤버 변수
	static int xx = 100;
	static int yy = 200;
	
	static double findArea() {
		return 3.14 * radius * radius; // 멤버변수 radius 사용 시 동일한 클래스 내에서 사용하므로 객체명 없이 그냥 사용함
	}
	

	static void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n" , x, y);
	}
	
	static void test() {
		// this : 객체 자기 자신을 뜻하는 키워드
		// 지역변수와 클래스 멤버 변수의 이름이 같을 경우 우선권이 지역변수에게 주어진다.
		// 이때 클래스 멤버 변수를 호출하여 사용하려면 this 키워드를 사용해야 함
		int xx = 1000; // 지역변수를 클래스 멤버 변수와 동일한 이름으로 선언
		int yy = 2000;
		 System.out.println("지역 변수 xx의 값 : " + xx + "\n지역 변수 yy의 값 : " + yy);
		 System.out.println("클래스 멤버 변수 xx의 값 : " + xx + "\n클래스 멤버 변수 yy의 값 : " + yy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius = 10.0; // 객체명 없이 그냥 사용
		
		double area =  findArea();
		
		show(radius, area);
		
		test();
	}

}
