package chap03;

import java.util.Scanner;

public class chap03Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력한 정수보다 1씩 작은 숫자를 계속 곱해주는 것
		System.out.println("---- 문제 1 ----");
		
		Scanner in = new Scanner(System.in);
		int result;
		int n,m; // 2번 문제를 위해서 변수 1개 더 사용
		System.out.println("정수 입력");
		n = in.nextInt();
		m = n; // 2번 문제를 위해서 n의 값을 m에 저장
		
		result = 1;
		while (n > 0) {
			result = result * n ;
			n--;			
		}

		System.out.println(result);
		
		System.out.println("---- 문제 2 ----");
		
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



