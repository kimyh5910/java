package chap10;

// ���׸� Ŭ���� ����
// Number Ŭ������ ���׸��� ��ӹ޾Ƽ� �������� ��� ���� �ϵ��� ����
public class Pair<T extends Number> {
	private T num1; // ��� ���� Ÿ���̵� ��� ������ ������ ���׸� Ÿ�� ��� ����
	private T num2;
	
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public T first() {
		return num1;
	}
	
	public T second() {
		return num2;
	}
}
