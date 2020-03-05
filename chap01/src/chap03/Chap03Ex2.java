package chap03;

import java.util.Scanner;

public class Chap03Ex2 {

	// 클래스의 멤버 변수로 선언
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question01();
		question02();
		question03();
		question04();
	}
	public static void question01() {
		
		System.out.println("--------문제 1");
		System.out.print("나이를 입력해 주세요 : ");
		int age = in.nextInt();
		
		if (age > 18) {
			System.out.println("성년");
		}
		else {
			System.out.println("미성년");
		}
	}
	public static void question02() {
		
		System.out.println("--------문제 2");
		Scanner in = new Scanner(System.in);
		
		System.out.print("등수를 입력하세요 : ");
		int x = in.nextInt();
		
		switch (x) {
		case 1 : 
			System.out.println("아주 잘했습니다.");
			break;
			
		case 2 : 			
		case 3 : 
			System.out.println("잘했습니다.");
			break;
			
		case 4 :
		case 5 :
		case 6 :
			System.out.println("보통입니다.");
			break;
			
		default : 
			System.out.println("노력해.");
			break;
		}
	}
	
	public static void question03() {
		
		System.out.println("--------문제 3");
		Scanner in = new Scanner(System.in);
		
		int x = 0; // 사용자가 입력한 정수를 저장하는 변수
		int y = 0; // 짝수들의 합을 저장하는 변수
		
		do {
			System.out.println("정수 입력 : ");
			x = in.nextInt();
			
			if (x % 2 == 0) {
				y = y + x;
			}
		} while(x > 0);
		
		System.out.println("입력된 양의 정수 중 짝수의 합은 : " + y);
			
		}
	
	public static void question04() {
		
		String x = "";
		for (int i=0; i < 5; i++) { 
			x = x + "*";
			System.out.println(x);	
		}
	}
}
