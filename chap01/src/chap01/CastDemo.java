package chap01;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ÿ�� ��ȯ : ���� �ٸ� ������ Ÿ���� �����ϱ� ���ؼ� ������ ������ Ÿ������ ������ Ÿ���� ��ȯ�ϴ� ��
		// byte -> int ������ ��ȯ
		// float -> double ������ ��ȯ
		// int -> double ������ ��ȯ

		// �ڵ� Ÿ�� ��ȯ : ���� �ٸ� ������ Ÿ���� ���� �� �� ū ������ Ÿ������ �ڵ����� ��ȯ�Ͽ� ������ �����ϴ� ��
		double d1 = 5 * 3.14; // int Ÿ�� 5�� double Ÿ�� 3.14�� �����ϸ� �ڵ� Ÿ�� ��ȯ�� �߻��Ͽ� 5.0 * 3.14 �� �����
		double d2 = 1; // int Ÿ�� 1�� double�� ���� d2�� ���� �� �ڵ� Ÿ�� ��ȯ�� �߻��Ǿ� 1.0�� d2�� �����

		// ���� Ÿ�� ��ȯ : ���� �ٸ� ������ Ÿ���� ���� �� Ư���� ������ Ÿ������ ����ڰ� ���� ������ Ÿ�� ��ȯ�� ���� �ϴ� ��
		// ����
		// (��ȯ�� ������ Ÿ��)�����Ͱ�;
//		float f = (float)3.14; // float�� ���� f�� double�� ����Ŀ �� 3.14�� ������ �� �����Ƿ�(float)�� ����Ͽ� ���������� �����Ͱ��� float������ ��ȯ���� ����
//		byte b = (byte)300; // byte �� ���� b�� int�� �����Ͱ� 300�� ������ �� �����Ƿ� (byte)�� ����Ͽ� ���������� ������ ���� byte������ ��ȯ���� ������
//		byte x = (byte)3.14; // byte �� ���� x�� double�� �����Ͱ� 3.14�� ������ �� �����Ƿ� (byte)�� ����Ͽ� ���������� ������ ���� byte���� ��ȯ�Ͽ� ������
//		double d = (double)3.14f; // double �� ���� d�� float�� �����Ͱ��� double������ ��ȯ�Ͽ� ������

		byte by = 100;
		System.out.println("byte Ÿ�� ���� by �� �� : " + by);
		int inta = by; // �ڵ� Ÿ�� ��ȯ
		System.out.println("int Ÿ�� ���� inta �� �� : " + inta);

		inta = 130;
		System.out.println("int Ÿ�� ���� inta �� �� : " + inta);
		by = (byte) 130; // ���� Ÿ�� ��ȯ
		System.out.println("byte Ÿ�� ���� by �� �� : " + by);

		System.out.println("--------------------------------");

		int intb = 100;
		System.out.println("int Ÿ�� ���� inta �� �� : " + intb);
		double dbb = intb; // �ڵ� Ÿ�� ��ȯ
		System.out.println("double Ÿ�� ���� dbb �� �� : " + dbb);
		intb = (int) dbb; // ���� �߻�, ���� Ÿ�� ��ȯ�� �ʿ���
		System.out.println("int Ÿ�� ���� inta �� �� : " + intb);
		intb = (int) 3.14; // ���� Ÿ�� ��ȯ, �Ҽ��� �ڸ��� �����Ͱ� ���� ��
		System.out.println("int Ÿ�� ���� inta �� �� : " + intb);

		System.out.println("--------------------------------");

		int i;
		double d;
		byte b;

		i = 7 / 4; // ���� ������ �����̹Ƿ� �Ҽ��� �ڸ��� ǥ������ ����, �Ҽ��� ���ϴ� �������� ����
		System.out.println(i);
		d = 7 / 4; // ���������� �����̹Ƿ� ����� 1��, double Ÿ���� ������ ����Ǿ� �ڵ� Ÿ�� ��ȯ�� ���� ��
		System.out.println(d);
		d = 7 / (double) 4; // intŸ�԰� double Ÿ���� �������� int Ÿ���� �ڵ� Ÿ�� ��ȯ�� ����Ǿ� doubleŸ���� �� 7.0 / double Ÿ���� ��
							// 4.0�� �Ǿ� ������� 1.75�� ���
		System.out.println(d);

		i = 300; // int Ÿ�� ���� i�� �� 300 ����
		// 300�� byte Ÿ���� �ּҰ� -128�� �ִ밪 127 ���̿� ���� �����Ƿ� byte������ �� ��ȯ �Ұ�
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�");
		} else {
			b = (byte) i;
		}
	}
}
