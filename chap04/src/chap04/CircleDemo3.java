package chap04;

public class CircleDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle3 myCircle = new Circle3();
		// 기존 방식, Circle3 클래스의 멤버 변수에 직접 접근을 하고 있음
		// 값을 직접 입력하는 형태이기 때문에 입력한 값이 정확한지 검증할 수 없음
		// 중요한 멤버 변수, 멤버 메서드의 경우는 외부로 노출시키지 않고,  getter, setter 등을 통하여, 데이터를 입력하고 가져오는 방식을 사용함
//		myCircle.radius = 10.0;
		myCircle.setRadius(10.0);;
//		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());

	}

}


class Circle3 {
	// 멤버 변수나 메서드에 접근제한자 private 설정 시 외부 접근 불가능
	private double radius;
	final double PI = 3.14;
	
//	public double getRadius() {
//		return radius;
//	}
//	
//	public void setRadius(double value) {
//		radius = value;
//	}
	
	double findArea() {
		return 3.14 * getRadius() * getRadius();
	}
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
