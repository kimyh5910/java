package javaReview;

public class review01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޼��� : �ڹٽ�ũ��Ʈ�� �Լ��� ������ ������ ������ ����, � Ư���� ����� �����ϱ� ���ؼ� ���� �ڵ��� ����, �Լ��� ȥ�ڼ� ���������� �޼���� Ŭ������ ��� ���ԵǾ ������
		// �޼��� �����ε� : �ϳ��� Ŭ���� ������ ������ �̸��� �޼��带 ������ ����ϴ� ��
		// �����ε� ���� : 1. �Ű������� ������ �ٸ� ��
		//			   2. �Ű������� Ÿ���� �ٸ� ��
		
		// �޼��� ���� : ������ Ŭ���� ������ ��� �޼��带 ȣ��ô� �޼���� �Է��Ͽ� ȣ��
		//			   �ٸ� Ŭ������ �ִ� �޼��带 ȣ�� �ô� ��ü��.�޼���� �������� ȣ��
		
		// 1�� ������� �޼��� ���� �� ����
		sum();
		sub();
		multi();
		div();
	}
	
	// 4Ģ ���� �޼���
	// 1�� ������� ����(�Ű�����x, ��ȯŸ��x)
	public static void sum() {
		// ���������� : public �ܺο��� ���� ����
		// static : Ŭ������ �޸𸮿� �ε� �� ���� �޸𸮿� �ε��
		// ��ȯŸ�� : void ��ȯ�� ����
		int a = 20;
		int b = 10;
		System.out.println("���� a + b��" + (a + b));
	}
	
	public static void sub() {
		int a = 20;
		int b = 10;
		System.out.println("���� a - b��" + (a - b));
	}
	
	public static void multi() {
		int a = 20;
		int b = 10;
		System.out.println("���� a * b��" + (a * b));
	}
	
	public static void div() {
		int a = 20;
		int b = 3;
		System.out.println("���� a / b��" + (a / b));
	}
	
}
