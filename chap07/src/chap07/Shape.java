package chap07;

// �߻� Ŭ���� : �߻� �޼��尡 1�� �̻� �����ϴ� Ŭ����
// �߻�Ŭ������ ��ü ������ �ȵ�
// �ݵ�� ��ӹ޾� ����ؾ� ��
abstract public class Shape {
	double pi = 3.14;
	
	// �߻� �޼��� : �޼����� ������ ����� ���� �޼��� / ���� �ڵ� �κ��� ����
	// �ش� �޼��带 �������̵��Ͽ� �����ؼ� ����ؾ� ��
	abstract void draw();
	
	public double finArea() {
		return 0.0;
	}
}
