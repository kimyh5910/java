package chap01;

// import : �̹� ������� �ִ� �ڹ��� ���� Ŭ������ �ٸ� ����� ����� ���� Ŭ������ ������ ���Ϸ� �ε��ؼ� ����ϴ� �� 
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner Ŭ������ ��ü�� �����Ͽ� ���
		// new : Ŭ������ ����ü�� ��ü�� �����ϴ� ��ɾ�
		
		Scanner in = new Scanner(System.in); // Scanner Ŭ������ ��üȭ�Ͽ� in�� ������
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int x = in.nextInt(); // Ű������ ���� �Է��� �޴� �޼��� / intŸ�� ���� x�� ����
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int y = in.nextInt(); // Ű������ ���� �Է��� �޴� �޼��� / intŸ�� ���� y�� ����
		
		System.out.println(x + "*" + y + "��" + x * y + "�Դϴ�.");
//		System.out.printf("%d * %d�� %d�Դϴ�. \n",  x, y, x * y);
		
		// Scanner Ŭ������ �����ϴ� ������ �Է� �޼���
		// next() : ���ڿ��� �Է¹���, ���� Ȥ�� ���ڿ��� ������ �������� �� �ܾ�, �� ���ھ� �Է� ����
		// nextByte() : byte Ÿ���� �����͸� �Է¹���
		// nextShort() : short Ÿ���� �����͸� �Է¹���
		// nextInt() : int Ÿ���� �����͸� �Է¹���
		// nextLong() : long Ÿ���� �����͸� �Է¹���
		// nextFloat() : float Ÿ���� �����͸� �Է¹���
		// nextDouble() : double Ÿ���� �����͸� �Է¹���
		// nextLine() : ���ڿ��� �Է¹���, ���� Ȥ�� ���ڿ��� �� ���� ��ü�� �Է� ����
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = in.next();
		System.out.println("�Էµ� �̸��� : " + name + "�Դϴ�.");
	}

}
