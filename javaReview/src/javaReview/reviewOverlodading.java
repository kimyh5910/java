package javaReview;

public class reviewOverlodading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޼��� �����ε� : �ϳ��� Ŭ���� ������ ������ �̸��� �޼��带 ������ ����ϴ� ��
//					   : ������ ����� ����
		// �����ε� ���� : 1. �Ű������� ������ �ٸ� ��
		//			   2. �Ű������� Ÿ���� �ٸ� ��
		
		sum();
		sum(20,10);
		sum(20.0,10.0);
	}
	
	public static void sum() {
		int a = 20;
		int b = 10;
		System.out.print("���� a + b = " + (a + b));
	}
	
	// �����ε��� sum�Լ� // �⺻ sum�Լ��� �Ű������� ������ �ٸ�
	public static void sum(int a, int b) {
		System.out.print("���� a + b = " + (a + b));
	}
		
	// �����ε��� sum�Լ� // ������ �Ű������� �޴� sum �Լ��� �Ű������� Ÿ���� �ٸ�
	public static void sum(double a, double b) {
		System.out.print("���� a + b = " + (a + b));
	}
	
	// �ż��� �����ε��� ���Ͽ� -, *, / ����� ���� 3���� (�⺻ ,int �Ű�����, double �Ű�����) ����
	public static void div() {
		int a = 20;
		int b = 10;
		System.out.print("���� a - b = " + (a - b));
	}
	

	public static void div(int a, int b) {
		System.out.print("���� a - b = " + (a - b));
	}
		

	public static void div(double a, double b) {
		System.out.print("���� a - b = " + (a - b));
	}
	
	public static void a() {
		int a = 20;
		int b = 10;
		System.out.print("���� a * b = " + (a * b));
	}
	
	public static void a(int a, int b) {
		
		System.out.print("���� a * b = " + (a * b));
	}
	
	public static void a(double a, double b) {
		System.out.print("���� a * b = " + (a * b));
	}
	
	public static void b() {
		int a = 20;
		int b = 10;
		System.out.print("���� a / b = " + (a / b));
	}
	
	public static void b(int a, int b) {
		
		System.out.print("���� a / b = " + (a / b));
	}
	
	public static void b(double a, double b) {
		System.out.print("���� a / b = " + (a / b));
	}
	
} 