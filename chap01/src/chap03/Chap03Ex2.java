package chap03;

import java.util.Scanner;

public class Chap03Ex2 {

	// Ŭ������ ��� ������ ����
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question01();
		question02();
		question03();
		question04();
	}
	public static void question01() {
		
		System.out.println("--------���� 1");
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = in.nextInt();
		
		if (age > 18) {
			System.out.println("����");
		}
		else {
			System.out.println("�̼���");
		}
	}
	public static void question02() {
		
		System.out.println("--------���� 2");
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� �Է��ϼ��� : ");
		int x = in.nextInt();
		
		switch (x) {
		case 1 : 
			System.out.println("���� ���߽��ϴ�.");
			break;
			
		case 2 : 			
		case 3 : 
			System.out.println("���߽��ϴ�.");
			break;
			
		case 4 :
		case 5 :
		case 6 :
			System.out.println("�����Դϴ�.");
			break;
			
		default : 
			System.out.println("�����.");
			break;
		}
	}
	
	public static void question03() {
		
		System.out.println("--------���� 3");
		Scanner in = new Scanner(System.in);
		
		int x = 0; // ����ڰ� �Է��� ������ �����ϴ� ����
		int y = 0; // ¦������ ���� �����ϴ� ����
		
		do {
			System.out.println("���� �Է� : ");
			x = in.nextInt();
			
			if (x % 2 == 0) {
				y = y + x;
			}
		} while(x > 0);
		
		System.out.println("�Էµ� ���� ���� �� ¦���� ���� : " + y);
			
		}
	
	public static void question04() {
		
		String x = "";
		for (int i=0; i < 5; i++) { 
			x = x + "*";
			System.out.println(x);	
		}
	}
}
