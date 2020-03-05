package chap04;

public class Circle5 {
	double radius;
	String color;
	
	// ����ڰ� ���� �⺻ ������
	public Circle5() {
		this(10.0, "����"); // this()�� �����, ������ Circle5(double radius, String color) ����
	}
	
	public Circle5(String color) {
		this(10.0, color);
	}
	
	public Circle5(double radius) {
		this(radius, "�Ķ�");
	}
	
	
	public Circle5(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void show() {
		System.out.println("radius : " + radius + "\ncolor : " + color);
	}
}
