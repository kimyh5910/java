package chap04;

public class CircleDemo {
	static double radius; // Ŭ���� ��� ����
	static int xx = 100;
	static int yy = 200;
	
	static double findArea() {
		return 3.14 * radius * radius; // ������� radius ��� �� ������ Ŭ���� ������ ����ϹǷ� ��ü�� ���� �׳� �����
	}
	

	static void show(double x, double y) {
		System.out.printf("������ = %.1f, ���� = %.1f\n" , x, y);
	}
	
	static void test() {
		// this : ��ü �ڱ� �ڽ��� ���ϴ� Ű����
		// ���������� Ŭ���� ��� ������ �̸��� ���� ��� �켱���� ������������ �־�����.
		// �̶� Ŭ���� ��� ������ ȣ���Ͽ� ����Ϸ��� this Ű���带 ����ؾ� ��
		int xx = 1000; // ���������� Ŭ���� ��� ������ ������ �̸����� ����
		int yy = 2000;
		 System.out.println("���� ���� xx�� �� : " + xx + "\n���� ���� yy�� �� : " + yy);
		 System.out.println("Ŭ���� ��� ���� xx�� �� : " + xx + "\nŬ���� ��� ���� yy�� �� : " + yy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radius = 10.0; // ��ü�� ���� �׳� ���
		
		double area =  findArea();
		
		show(radius, area);
		
		test();
	}

}
