package chap04;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal2 cal2 = new Cal2(10, 5);
//		cal2.a = 10;
//		cal2.b = 5;
		
		cal2.sum();
		
		Cal3 cal3 = new Cal3();
		
		
		cal3.sub();
		
	}
}

class Cal2 {
	int a; // int Ÿ���� ������ ����ڰ� �ʱ�ȭ���� ���� ��� �⺻���� 0�� ��
	int b;
	
	// �����ڷμ� �ڵ� ���� ��
	// �����ڸ� �̿��� ��� ������ �ʱ�ȭ
	public Cal2(int x, int y) {
		a = x;
		b = y;
	}
	
	public void sum() {
		int c = a + b;
		System.out.println("a + b = " + c);
	}
}

class Cal3 {
	private int a;
	private int b;
	
	// ������
	// �����ڴ� �̸��� Ŭ������ �����ؾ� ��
	// �����ڴ� ��ȯ Ÿ���� ����(��ȯ Ÿ�� �Է� �κ� ��ü�� ����)
	// ����ڰ� �����ڸ� ������ �ʾ��� ��� �ڵ����� �����Ϸ��� ������ �� �����ڸ� �����Ͽ� ������
	// ���� ����ڰ� ������ �� �����ڸ� ������� ��� �����Ϸ��� �����ڸ� �ڵ� �������� ����
	// ����ڰ� �����ڸ� �ϳ��� ������� ��� �����Ϸ��� �� �����ڸ� �ڵ� �������� ����
	// �����ڵ� �����ε��� ������
	
	public Cal3() { // �����ڸ� �̿��Ͽ� ��� ������ �ʱ�ȭ
		a = 10;
		b = 5;
	}

	// ������ �����ε����� ���Ͽ� ������� �������� ������
	public Cal3(int x) { // �Ű������� ���� 1�� �޾Ƽ� ��������� �ʱ�ȭ
		a = x;
		b = a - 5;
	}
	
	public Cal3(int x, int y) {
		a = x;
		b = y;
				
	}
	
	public void sub() {
		int c = a - b;
		System.out.println("a - b = " + c);
	}
}
