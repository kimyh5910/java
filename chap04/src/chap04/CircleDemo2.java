package chap04;

public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(); // 동일한 클래스가 아니므로 사용을 위해서 인스턴스 화
		myCircle.radius = 10.0; // 객체의 멤버 변수에 접근하기 위해서 . 을 사용
		myCircle.show(myCircle.radius, myCircle.findArea());

	}

}

class Circle {
	double radius;
	final double PI = 3.14; // 상수 선언
	
	double findArea() {
		return PI * radius * radius;
	}
	
	void show(double x, double y) {
	System.out.printf("반지름 = %.1f, 넓이 = %.1f\n",x, y);
	}
}
