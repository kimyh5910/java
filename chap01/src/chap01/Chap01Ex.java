package chap01;

import java.util.Scanner;

public class Chap01Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바는 변수 선언 시 동일한 코드 블럭 내에서 동일한 이름의 변수를 선언할 수 없음
		
		// 책 75 페이지의 도전 과제 해보기
		// 문제 1
		System.out.println("---- 문제1 ----");
		double w;
		double h;
		double area;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		
		area = w * h;
		System.out.println("직사각형의 넓이는" + area + "입니다.");
		
		
		// 문제 2
		// 자바는 기본 자료형 선언 시 선언과 동시에 값을 추가하지 않으면 자동으로 초기값을 사용함
		// 자바스크립트는 var를 이용하여 지료형 자동 추론 방식을 사용하기 때문에 해당 변수에 특정 자료형을 사용하려면 초기값을 따로 입력해야 했으나, 자바는 변수 선언 			시 자료형을 입력하기 때문에 따로 초기값을 입력하지 않아도 상관없음
		// 관례적으로 변수 선언 시 초기값을 입력하는 것이 좋음
		System.out.println("---- 문제2 ----");
		int a;
		System.out.print("정수를 입력하세요 : ");
		a = in.nextInt();
		a = a%2;
			if (a == 0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}

		System.out.println("---- 문제3 ----");
		
		System.out.println("     *");
		System.out.println("    ***");
		System.out.println("   *****");
		System.out.println("  *******");
		System.out.println(" *********");
		System.out.println(" **********");
	}

}
