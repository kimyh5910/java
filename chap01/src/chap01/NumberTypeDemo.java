package chap01;

public class NumberTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������ Ÿ�� ����
		// �ڹٿ����� ���� ���� �� �ش� ������ Ÿ���� �����ؾ���
		// ������ ������ Ÿ���� �⺻�� int�� �ַ� �����
		// 32��Ʈ CPU�� ����ϸ鼭���� int���� ũ�⸦ 32��Ʈ�� ������
		// ���� 64��Ʈ CPU�� �ַ��� �Ǿ����� ������ int���� 32��Ʈ�� ����Ǿ� ����
		int mach; // �޸𸮿� ������ ����
		int distance;

		mach = 340; // ������ ������ ����
		distance = mach * 60 * 60; // ������ ������ ���� ����

		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ� : " + distance + "m");

		// double�� �Ǽ� ���� �ڷ����� �⺻��
		double radius; // ������ ����(�Ǽ�)�� �޸𸮿� ����
		double area;

		// �Ǽ� ���� �ڷ��� ��� �� ������ ���� d�� ������ �ʾƵ� �������(�Ǽ����� �⺻�̱� ����)
		// float �� �ݵ�� ������ ���� f�� �ٿ�����
		// float�� ����ϴ� ������ �޸𸮸� ���� ����ϱ� ����
		radius = 10.0;
		area = radius * radius * 3.14;
		System.out.println("�������� " + radius + "�� ���� ���� : " + area);

	}
}
