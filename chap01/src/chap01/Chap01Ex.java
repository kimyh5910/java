package chap01;

import java.util.Scanner;

public class Chap01Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹٴ� ���� ���� �� ������ �ڵ� �� ������ ������ �̸��� ������ ������ �� ����
		
		// å 75 �������� ���� ���� �غ���
		// ���� 1
		System.out.println("---- ����1 ----");
		double w;
		double h;
		double area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		w = in.nextDouble();
		
		System.out.print("���簢���� ���� ���̸� �Է��ϼ��� : ");
		h = in.nextDouble();
		
		area = w * h;
		System.out.println("���簢���� ���̴�" + area + "�Դϴ�.");
		
		
		// ���� 2
		// �ڹٴ� �⺻ �ڷ��� ���� �� ����� ���ÿ� ���� �߰����� ������ �ڵ����� �ʱⰪ�� �����
		// �ڹٽ�ũ��Ʈ�� var�� �̿��Ͽ� ������ �ڵ� �߷� ����� ����ϱ� ������ �ش� ������ Ư�� �ڷ����� ����Ϸ��� �ʱⰪ�� ���� �Է��ؾ� ������, �ڹٴ� ���� ���� 			�� �ڷ����� �Է��ϱ� ������ ���� �ʱⰪ�� �Է����� �ʾƵ� �������
		// ���������� ���� ���� �� �ʱⰪ�� �Է��ϴ� ���� ����
		System.out.println("---- ����2 ----");
		int a;
		System.out.print("������ �Է��ϼ��� : ");
		a = in.nextInt();
		a = a%2;
			if (a == 0) {
				System.out.println("¦���Դϴ�.");
			}
			else {
				System.out.println("Ȧ���Դϴ�.");
			}

		System.out.println("---- ����3 ----");
		
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  *******");
		System.out.println(" *********");
		System.out.println(" **********");
	}

}
