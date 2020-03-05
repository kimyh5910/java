package chap01;

import java.util.Scanner;

public class Chap02Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p80 문제 2 ~ 9 번 풀기
		
		System.out.println("---- 문제 2 ----");
		int a;
		int result1 = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : "); 
		a = in.nextInt(); // int 타입 정수 입력
		
		result1 = a * a;
		System.out.println("a" + "의 제곱은 " + result1);
		
		
		System.out.println("---- 문제 3 ----");	
		double r = 10; 
		double h = 10;
		final double p = 3.14;
		double result2 = 0.0;
		
		System.out.println("원기둥의 밑면 반지름은? " + r);
		System.out.println("원기둥의 높이는? " + h);
		
		result2 = r* r * h * p;
		
		System.out.println("원기둥의 부피는 " + result2);
		
		System.out.println("---- 문제 4 ----");
		System.out.println("초 단위 정수를 입력하세요 : ");
		int t = in.nextInt();
		int hour = (t / 60) / 60; 
		int min = (t / 60) % 60;
		int sec = t % 60;
		
		System.out.println(hour + "시간" + min + "분" + sec + "초");
				
		System.out.println("---- 문제 5 ----");
		
		// 문자 k를 입력하면 ascii 코드에 의해서 k는 10진수 107이 됨
		// 아스키코드에서 영문 소문자는 10진수 97 ~ 122까지이고, 영문 대문자는 65 ~ 90까지임
		// 소문자를 대문자로 변환하려면 97 - 65 = 32 이고 소문자 k가 107이고, 대문자 K는 75이므로 둘의 차는 32이다
		// 결국 32의 값을 변경해주면 소문자에서 대문자로, 대문자에서 소문자로 변환이 가능하다
		System.out.print("영문 소문자를 한글자 입력해주세요");
		String str = in.next();
		char c = str.charAt(0);
		
		System.out.printf("%c", c - (32));
		
		System.out.println("---- 문제 6 ----");
		
//		(화씨온도 - 32) / 1.8 = 섭씨온도 
		System.out.println("화씨 온도를 입력해주세요");
		double f = in.nextDouble();
		double ftoc = (f - 32) / 1.8 ;
		System.out.println("화씨 " + f + "를 섭씨로 변환하면 " + ftoc + "입니다.");
		
		
		System.out.println("---- 문제 7 ----");
		
		System.out.print("정수를 입력해주세요");
		boolean and;
		boolean or;
		
		int num = in.nextInt();
		
		and = (num % 4 == 0) && (num % 5 == 0);
		or = (num % 4 == 0) || (num % 5 == 0);
		
		System.out.println(num + "은 두 수로 모두 나누어 진다 : " + and);
		System.out.println(or + "은 두 수 중 하나로 나누어 진다 : " + or);
		
		System.out.println("---- 문제 8 ----");
		
		System.out.println("0 ~ 999까지의 정수를 하나만 입력하세요 : ");
		int num999= in.nextInt(); // 입력받은 원본 값
		int d = num999; // 각 자리를 더하기 위해서 계산할 값
		int sum = 0; // 각 자리의 값을 더한 데이터를 저장하기 위한 변수
		
		sum = d % 10; // 999를 나눈 나머지는 9가 됨, 변수 sum에 저장
		d = d / 10; // 999를 10으로 나누면 99.9가 되고 int 타입이므로 99가 됨
		sum = sum + (d % 10); // 99를 나눈 나머지는 9가 됨, 변수 sum에 저장된 값과 합함
		
		d = d / 10;
		
		sum = sum + d;
		
		System.out.println(d + "의 각 자리의 합은" + sum + "입니다.");
		
		
		
		System.out.println("---- 문제 9 ----");
		
		System.out.println("전공 학점을 입력하세요 : ");
		int aa = in.nextInt();
		System.out.println("교양 학점을 입력하세요 : ");
		int bb = in.nextInt();
		System.out.println("일반 학점을 입력하세요 : ");
		int cc = in.nextInt();
		
		boolean result = (aa + bb + cc >= 140) &&
			(
				(aa >= 70) &&
				((bb >= 30 && cc >= 30) || (bb + cc >= 80))
			);
		
		System.out.println(result);
		

	}

}
