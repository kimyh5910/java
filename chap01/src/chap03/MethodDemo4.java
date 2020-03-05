package chap03;

public class MethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �޼��� �����ε� : ������ �̸��� ������ �޼��� (������ ������ ����)
			// 1. �Ű������� ���� �޶����
			// 2. ��ȯ���� ���°� �޶����
		// �޼��� �̸��� ������ �ñ״�ó�� �ٸ� �޼��带 �����ϴ� ���� �޼��� �����ε��̶�� �Ѵ�.
		// �޼��� �ñ״�ó : �Ű������� ����, ������ Ÿ��, ������ �ǹ�

		// �޼��� �����ε�
		// �ϳ��� Ŭ������ ������ �̸��� �޼��尡 ������ �����ϴ� ��
		// �����ε��� ������ �Ű������� ����, ������ Ÿ��, ��ȯ Ÿ���� ���� �޶����
		// �����ε� ����
		// 1. �Ű������� ����
		// 2. �Ű������� ������ Ÿ��
		// 3. �Ű������� ����
		
		int i1 = 3;
		int i2 = 7;
		int i3 = 10;
		
		double d1 = 7.0;
		double d2 = 3.0;
		
		System.out.printf("mad(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("mad(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("mad(%d, %d, %d) = %d\n", i1, i2, i3,max(i1, i2, i3));
		
		int x = 10;
		int y = 20;
		int z = 30;
		
		sum();
		sum(x);
		sum(x,y);
		sum(x,y,z);
	}
	
	// max(int n1, int n2)�� max(double n1, double n2) �޼���� ���� �Ű������� ������ ���������� �Ű������� ������ Ÿ���� �ٸ��Ƿ� �޼��� �����ε��� ����Ǿ� �ٸ� �޼���� �ν���
	public static int max(int n1, int n2) {
		int result = n2;
		
		if(n1 > n2) {
			result = n1;
		}
		else {
			result = n2;
		}
		
		return result;
	}

	public static double max(double n1, double n2) {
		double result = 0.0;
		
		if (n1 > n2) {
			result = n1;
		}
		else {
			result = n2;
		}
		
		return result;
	}
	
	// max(int n1, int n2)�� max(int n1, int n2, int n3) �޼���� ���� ����ϴ� �Ű������� ������ Ÿ���� int Ÿ������ ���������� �Ű������� ������ �ٸ��Ƿ� �޼��� �����ε��� ����Ǿ� �ٸ� �޼���� �ν���
	public static int max(int n1, int n2, int n3) {
//		return max(max(n1, n2), n3);
		
		int result = max(n1, n2); // max(int n1, int n2)�� ����Ͽ� �Ű������� ũ�⸦ ��
		result = max(result, n3); // max(int n1, int n2)�� ����Ͽ� �Ű������� ũ�⸦ ��
		
		return result;
	}
	
	public static void sum() {
		System.out.println("�Ű������� ���� sum�Լ�");
	}
	
	public static void sum(int x) {
		System.out.println("�Ű������� 1���� sum �Լ�");
	}
	
	public static void sum(int x, int y) {
		System.out.println("�Ű������� 2���� sum �Լ�");
	}
	
	public static void sum(int x, int y, int z) {
		System.out.println("�Ű������� 3���� sum �Լ�");
	}
}
