package chap07;

// �߻� Ŭ������ �θ� Ŭ������ ��ӹ޾Ƽ� ���
// �߻� Ŭ������ ����ϴ� ������ �θ� Ŭ������ ��ӹ޾� ����� �ڽ� Ŭ�������� ���������� ����ؾ��ϴ� �κ��� ����(����)�ϱ� ����
public class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// ��ӹ��� �߻� �޼��带 �������̵��Ͽ� ���
	
	public void draw() {
		System.out.println("���� �׸���.");
	}
	
	public double findArea() {
		return pi * radius * radius;
	}
}
