package chap03;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제어문
		// 자바프로그램에서 조건에 따라 프로그램의 흐름을 변경할 수 있음
		// 자바스크립트의 제어문과 동일함
		// if, if ~ else, else if 문, switch ~ case 문
		
		// 단순 if문
		// 조건의 결과가 true일 경우 추가로 코드를 실행
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		// 단순 if문을 사용하여 해당 조건에 만족할 경우만 코드 블럭을 실행함
		if (number % 2 == 0) { // 짝수일때만 아래의 코드를 실행
			System.out.println("짝수!");
		}
		
		if (number % 2 == 1) { // 홀수일때만 아래의 코드를 실행
			System.out.println("홀수!");
		}
		System.out.println("종료");
		
		// if ~ else 문
		// 조건에 따라 true일때 실행할 코드와 false일때 실행할 코드가 달라지는 조건문
		// 무조건 둘 중의 하나를 실행해야 함
		
		System.out.print("숫자를 입력하세요 : ");
		int number2 = in.nextInt();
		
		if(number2 % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		System.out.println("종료");

		// 삼항 연산자 사용 시
		System.out.println((number2 % 2 == 0) ? "짝수" : "홀수");
		
		System.out.println("---- else if 문 ----");
		// else if 문
		// 하나의 if에서 여러개의 조건을 비교할 경우 사용
		// 마지막 else 문은 필요가 없을 경우 삭제해도 됨
		
		String grade = "";
		System.out.print("점수를 입력하세요 : ");
		
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
		System.out.println("당신의 학점은" + grade);
		
		System.out.println("---- 중첩 if 문 ----");
		
		// if 문 내부에 if 문을 사용하는 방식
		// if 문, if ~ else 문, else if 문 내부에 또 다른 if문 사용하는 방식
		
		String grade2 = "";
		System.out.print("점수를 입력하세요 : ");
		
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
		System.out.println("당신의 등급은" + grade2);
		
		// 중첩 if문을 사용하여 점수의 등급을 표시하는 프로그램을 작성하세요
		// if 절의 코드 블럭에 if문을 중첩으로 계속 입력하여 A ~ F까지 출력하는 프로그램을 작성하세요
		
		String grade3 = "";
		System.out.print("점수를 입력하세요 : ");
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
		System.out.println("당신의 등급은" + grade3);
		
		System.out.println("---- switch ~ case 문 ----");
		
		// 자바스크립트의 switch ~ case 문과 동일함
		// switch 의 조건문의 결과값을 case에서 찾아서 실행하는 형태
		// case에 결과값이 없을 경우 default를 실행함
		// default는 반드시 필요한 것은 아님
		
		// break : 프로그램 실행 시 break를 만날 경우 해당 조건문 혹은 반복문을 즉시 종료함
		// switch ~ case 문에서 break 문을 입력하지 않으면 break 문을 만날때까지 계속 실행 됨
		
		System.out.print("등수를 입력하세요");
		int rank = in.nextInt();
		
		switch (rank) {
		case 1 :
			System.out.println("일등입니다.");
			break;
			
		case 2 :
			System.out.println("이등입니다.");
			break;
			
		case 3 :
			System.out.println("삼등입니다.");
			break;
			
		default:
			System.out.println("등수 외입니다.");
			break;
		}
		int number3 = 3;
		
		// break 문이 없으므로 case3을 선택 후 case 2, case 1을 모두 실행함
		// switch ~ case 문의 코드 블럭이 종료될 때까지 내려가면서 한줄씩 실행함
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
