package chap03;

import java.util.Scanner;

public class chap03Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Է��� �������� 1�� ���� ���ڸ� ��� �����ִ� ��
		System.out.println("---- ���� 1 ----");
		
		Scanner in = new Scanner(System.in);
		int result;
		int n,m; // 2�� ������ ���ؼ� ���� 1�� �� ���
		System.out.println("���� �Է�");
		n = in.nextInt();
		m = n; // 2�� ������ ���ؼ� n�� ���� m�� ����
		
		result = 1;
		while (n > 0) {
			result = result * n ;
			n--;			
		}

		System.out.println(result);
		
		System.out.println("---- ���� 2 ----");
		
		result = factorial(m);
		System.out.println(result);
	}
	
	public static int factorial(int x) {
		int r = 1;
		
		while (x > 0) {
			r = r * x;
			x--;
		}
		
		return r;
		
	}
	
}



