package chap04;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		public static void sum() {
//			int a = 10;
//			int b = 5;
//			System.out.println(a + b);

//	�ܼ� �޼��� ���
//	sum();
//	}

		
		// Ŭ������ �̿��ؼ� �����ϴ� ���
		Cal cal = new Cal();
		cal.a = 10;
		cal.b = 5;
		
		cal.sum();
		cal.sub();
		cal.multi();
		cal.div();
	}
	

}


class Cal {
	int a; // �������(Ŭ���� ��� ����) �ش� Ŭ���� �������� ���� ��𼭵� ��� ����
	int b;
	
	void sum() { // ��� �޼��� / �� �޼��带 ����Ϸ��� Ŭ������ �ν��Ͻ�ȭ �ؾ� ��� ����
		int c = a + b; // ���������� �ν��Ͻ�ȭ �۾��� ��ġ�� ������ �޸𸮿� �ε����� ����
		System.out.println(a + " + " + b + " = " + c);
	}
	
	void sub() {
		int c = a - b;
		System.out.println(a + " - " + b + " = " + c);
	}
	
	void multi() {
		int c = a * b;
		System.out.println(a + " * " + b + " = " + c);
	}
	
	void div() {
		int c = a / b;
		System.out.println(a + " / " + b + " = " + c);
	}
}