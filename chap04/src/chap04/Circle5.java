package chap04;

public class Circle5 {
	double radius;
	String color;
	
	// 사용자가 만든 기본 생성자
	public Circle5() {
		this(10.0, "빨강"); // this()를 사용함, 생성자 Circle5(double radius, String color) 실행
	}
	
	public Circle5(String color) {
		this(10.0, color);
	}
	
	public Circle5(double radius) {
		this(radius, "파랑");
	}
	
	
	public Circle5(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void show() {
		System.out.println("radius : " + radius + "\ncolor : " + color);
	}
}
