package chap07;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ShapeŬ������ �߻�Ŭ���� �̹Ƿ� ��ü�� ������ �� ����
		// �߻� Ŭ������ �ݵ�� ����� �޾Ƽ� �ڽ�Ŭ������ ��ӹ��� �߻� �޼��带 �������̵��Ͽ� �޼���� �����ؼ� ����ؾ� ��
		// Shape s = new Shape();
		
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("���� ���̴� %.1f\n", c.findArea());
		
		
	}

}
