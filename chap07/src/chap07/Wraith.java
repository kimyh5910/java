package chap07;

// �߻� Ŭ������ ��ӹ��� �� ��ӹ��� �߻� �޼��带 �������� ������ 1�� �̻��� �߻� �޼��带 ������ �ִ� ���� �Ǳ� ������ ��ӹ��� �ڽ� Ŭ������ ���� �߻� Ŭ������ �����
// abstract Ű���带 �߰��Ͽ� ������ �߻����� �ʵ��� �ؾ� ��
// �ڽ� Ŭ������ �߻� Ŭ������ ����Ǿ��� ������ ��ü ������ �Ұ�����
public abstract class Wraith extends Unit {
	public Wraith(String name, int hp) {
		super(name,hp);
	}

	abstract void move();
//	public void fly() {
//		System.out.println(name + "�� �̵��մϴ�.");
//	}
}
