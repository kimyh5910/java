package chap04;

public class CircleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(); // ������ Ŭ������ �ƴϹǷ� ����� ���ؼ� �ν��Ͻ� ȭ
		myCircle.radius = 10.0; // ��ü�� ��� ������ �����ϱ� ���ؼ� . �� ���
		myCircle.show(myCircle.radius, myCircle.findArea());

	}

}

class Circle {
	double radius;
	final double PI = 3.14; // ��� ����
	
	double findArea() {
		return PI * radius * radius;
	}
	
	void show(double x, double y) {
	System.out.printf("������ = %.1f, ���� = %.1f\n",x, y);
	}
}
