package chap01;

import java.util.Scanner;

public class Chap02Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p80 ���� 2 ~ 9 �� Ǯ��
		
		System.out.println("---- ���� 2 ----");
		int a;
		int result1 = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : "); 
		a = in.nextInt(); // int Ÿ�� ���� �Է�
		
		result1 = a * a;
		System.out.println("a" + "�� ������ " + result1);
		
		
		System.out.println("---- ���� 3 ----");	
		double r = 10; 
		double h = 10;
		final double p = 3.14;
		double result2 = 0.0;
		
		System.out.println("������� �ظ� ��������? " + r);
		System.out.println("������� ���̴�? " + h);
		
		result2 = r* r * h * p;
		
		System.out.println("������� ���Ǵ� " + result2);
		
		System.out.println("---- ���� 4 ----");
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int t = in.nextInt();
		int hour = (t / 60) / 60; 
		int min = (t / 60) % 60;
		int sec = t % 60;
		
		System.out.println(hour + "�ð�" + min + "��" + sec + "��");
				
		System.out.println("---- ���� 5 ----");
		
		// ���� k�� �Է��ϸ� ascii �ڵ忡 ���ؼ� k�� 10���� 107�� ��
		// �ƽ�Ű�ڵ忡�� ���� �ҹ��ڴ� 10���� 97 ~ 122�����̰�, ���� �빮�ڴ� 65 ~ 90������
		// �ҹ��ڸ� �빮�ڷ� ��ȯ�Ϸ��� 97 - 65 = 32 �̰� �ҹ��� k�� 107�̰�, �빮�� K�� 75�̹Ƿ� ���� ���� 32�̴�
		// �ᱹ 32�� ���� �������ָ� �ҹ��ڿ��� �빮�ڷ�, �빮�ڿ��� �ҹ��ڷ� ��ȯ�� �����ϴ�
		System.out.print("���� �ҹ��ڸ� �ѱ��� �Է����ּ���");
		String str = in.next();
		char c = str.charAt(0);
		
		System.out.printf("%c", c - (32));
		
		System.out.println("---- ���� 6 ----");
		
//		(ȭ���µ� - 32) / 1.8 = �����µ� 
		System.out.println("ȭ�� �µ��� �Է����ּ���");
		double f = in.nextDouble();
		double ftoc = (f - 32) / 1.8 ;
		System.out.println("ȭ�� " + f + "�� ������ ��ȯ�ϸ� " + ftoc + "�Դϴ�.");
		
		
		System.out.println("---- ���� 7 ----");
		
		System.out.print("������ �Է����ּ���");
		boolean and;
		boolean or;
		
		int num = in.nextInt();
		
		and = (num % 4 == 0) && (num % 5 == 0);
		or = (num % 4 == 0) || (num % 5 == 0);
		
		System.out.println(num + "�� �� ���� ��� ������ ���� : " + and);
		System.out.println(or + "�� �� �� �� �ϳ��� ������ ���� : " + or);
		
		System.out.println("---- ���� 8 ----");
		
		System.out.println("0 ~ 999������ ������ �ϳ��� �Է��ϼ��� : ");
		int num999= in.nextInt(); // �Է¹��� ���� ��
		int d = num999; // �� �ڸ��� ���ϱ� ���ؼ� ����� ��
		int sum = 0; // �� �ڸ��� ���� ���� �����͸� �����ϱ� ���� ����
		
		sum = d % 10; // 999�� ���� �������� 9�� ��, ���� sum�� ����
		d = d / 10; // 999�� 10���� ������ 99.9�� �ǰ� int Ÿ���̹Ƿ� 99�� ��
		sum = sum + (d % 10); // 99�� ���� �������� 9�� ��, ���� sum�� ����� ���� ����
		
		d = d / 10;
		
		sum = sum + d;
		
		System.out.println(d + "�� �� �ڸ��� ����" + sum + "�Դϴ�.");
		
		
		
		System.out.println("---- ���� 9 ----");
		
		System.out.println("���� ������ �Է��ϼ��� : ");
		int aa = in.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int bb = in.nextInt();
		System.out.println("�Ϲ� ������ �Է��ϼ��� : ");
		int cc = in.nextInt();
		
		boolean result = (aa + bb + cc >= 140) &&
			(
				(aa >= 70) &&
				((bb >= 30 && cc >= 30) || (bb + cc >= 80))
			);
		
		System.out.println(result);
		

	}

}
