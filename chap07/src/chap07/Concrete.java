package chap07;
// �߻� Ŭ���� Abstract�� ��� ����
public class Concrete extends Abstract {
	int j;
	
	public Concrete(int j, int i) {
		super(i); // �θ� Ŭ������ �����ڸ� �����ϴ� �κ� / �θ� Ŭ������ ����ڰ� ������ �����ڰ� ���� ��� �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϴ� �κ��� �ʿ���
		this.j = j;
	}
	
	// ��ӹ��� �߻� Ŭ������ ��� �߻� �޼��带 �����ؾ���
	@Override
	void show() {
		System.out.println("i = " + i + ", j = " +j);
	}
}
