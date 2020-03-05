package chap03;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���
		// �ڹ����α׷����� ���ǿ� ���� ���α׷��� �帧�� ������ �� ����
		// �ڹٽ�ũ��Ʈ�� ����� ������
		// if, if ~ else, else if ��, switch ~ case ��
		
		// �ܼ� if��
		// ������ ����� true�� ��� �߰��� �ڵ带 ����
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();
		
		// �ܼ� if���� ����Ͽ� �ش� ���ǿ� ������ ��츸 �ڵ� ���� ������
		if (number % 2 == 0) { // ¦���϶��� �Ʒ��� �ڵ带 ����
			System.out.println("¦��!");
		}
		
		if (number % 2 == 1) { // Ȧ���϶��� �Ʒ��� �ڵ带 ����
			System.out.println("Ȧ��!");
		}
		System.out.println("����");
		
		// if ~ else ��
		// ���ǿ� ���� true�϶� ������ �ڵ�� false�϶� ������ �ڵ尡 �޶����� ���ǹ�
		// ������ �� ���� �ϳ��� �����ؾ� ��
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int number2 = in.nextInt();
		
		if(number2 % 2 == 0) {
			System.out.println("¦��");
		}
		else {
			System.out.println("Ȧ��");
		}
		System.out.println("����");

		// ���� ������ ��� ��
		System.out.println((number2 % 2 == 0) ? "¦��" : "Ȧ��");
		
		System.out.println("---- else if �� ----");
		// else if ��
		// �ϳ��� if���� �������� ������ ���� ��� ���
		// ������ else ���� �ʿ䰡 ���� ��� �����ص� ��
		
		String grade = "";
		System.out.print("������ �Է��ϼ��� : ");
		
		int score = in.nextInt();
		
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 70) {
			grade = "C";
		}
		else if (score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println("����� ������" + grade);
		
		System.out.println("---- ��ø if �� ----");
		
		// if �� ���ο� if ���� ����ϴ� ���
		// if ��, if ~ else ��, else if �� ���ο� �� �ٸ� if�� ����ϴ� ���
		
		String grade2 = "";
		System.out.print("������ �Է��ϼ��� : ");
		
		int score2 = in.nextInt();
		
		if (score2 >= 90) {
			grade2 = "A";
		}
		else {
			if (score2 >= 80) {
				grade2 = "B";
			}
			else {
				if (score2 >= 70) {
					grade2 = "C";
				}
				else {
					if(score2 >= 60) {
						grade2 = "D";
					}
					else {
						grade2 = "F";
					}
				}
			}
		}
		System.out.println("����� �����" + grade2);
		
		// ��ø if���� ����Ͽ� ������ ����� ǥ���ϴ� ���α׷��� �ۼ��ϼ���
		// if ���� �ڵ� ���� if���� ��ø���� ��� �Է��Ͽ� A ~ F���� ����ϴ� ���α׷��� �ۼ��ϼ���
		
		String grade3 = "";
		System.out.print("������ �Է��ϼ��� : ");
		int score3 = in.nextInt();
		
		if(score3 >= 60) {
			grade3 = "D";
			if(score3 >=70 ) {
				grade3 = "C";
				if(score3 >=80 ) {
					grade3 = "B";
					if(score3 >=90 ) {
						grade3 = "A";
						}
					}
				}
			}
			else {
			grade3 = "F";
		}
		System.out.println("����� �����" + grade3);
		
		System.out.println("---- switch ~ case �� ----");
		
		// �ڹٽ�ũ��Ʈ�� switch ~ case ���� ������
		// switch �� ���ǹ��� ������� case���� ã�Ƽ� �����ϴ� ����
		// case�� ������� ���� ��� default�� ������
		// default�� �ݵ�� �ʿ��� ���� �ƴ�
		
		// break : ���α׷� ���� �� break�� ���� ��� �ش� ���ǹ� Ȥ�� �ݺ����� ��� ������
		// switch ~ case ������ break ���� �Է����� ������ break ���� ���������� ��� ���� ��
		
		System.out.print("����� �Է��ϼ���");
		int rank = in.nextInt();
		
		switch (rank) {
		case 1 :
			System.out.println("�ϵ��Դϴ�.");
			break;
			
		case 2 :
			System.out.println("�̵��Դϴ�.");
			break;
			
		case 3 :
			System.out.println("����Դϴ�.");
			break;
			
		default:
			System.out.println("��� ���Դϴ�.");
			break;
		}
		int number3 = 3;
		
		// break ���� �����Ƿ� case3�� ���� �� case 2, case 1�� ��� ������
		// switch ~ case ���� �ڵ� ���� ����� ������ �������鼭 ���پ� ������
		switch(number3) {
		case 4:
			System.out.println("*");
			
		case 3:
			System.out.println("*");
			
		case 2:
			System.out.println("*");
			
		case 1:
			System.out.println("*");
		}
	}
}
