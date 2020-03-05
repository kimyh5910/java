package chap01;

import java.util.Scanner;

public class ArithmeticDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산자
		// 자바스크립트의 연산자와 동일함
		// 산술 연산자 : +, -, *, /, % 수학에서의 4칙 연산을 위한 연산자, *, /, % 가 +, -보다 우선순위가 높음
		// 증감 연산자 : ++, --, 단항 연산자로 해당 항의 값을 1 증가시키거나 1 감소 시킴, 우선순위가 빠름
		// 대입 연산자 : =, +=, -=, *=, /=, %=, 연산 우선순위가 가장 느림 
		// 비교 연산자 : >, >=, <, <=, ==, !=, instanceof, 데이터의 값을 비교하는 연산자, instanceof 는 클래스를 복제체인 객체를 해당 클래스와 비교하기 위한 연산자
		
		String str = new String();
		StringBuilder sb = new StringBuilder();
		
		if(str instanceof String) {
			System.out.println("str은 String의 객체입니다.");
		}
		else {
			System.out.println("str은 String의 객체가 아닙니다.");
		}
		if (sb instanceof StringBuilder) {
			System.out.println("sb은 StringBuilder 의 객체입니다.");
		}
		else {
			System.out.println("sb은 StringBuilder 의 객체가 아닙니다.");
		}
		
		// 비트 연산자 : &, |, ~, ^, 비트 연산을 위한 연산자
		// 논리 연산자 : &&, ||, ~, 논리 연산을 위한 연산자, 주로 if 문에서 조건을 2개 이상 사용하고자 할 경우 사용함
		
		System.out.println("---- 산술 연산 예제 ----");
		int remainer = 25 * 2;
		System.out.println("25 / 2의 나머지는 " + remainer + "입니다.");
		
		System.out.println("---- 비교 / 논리 연산 예제 ----");
		int x = 0;
		int y = 1;
		
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		
		x = 0;
		y = 1;
		
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);
		
		System.out.println("---- 비트 / 시프트 연산자 ----");
		
		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte) ~ 0b0011);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);
		
		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);
		
		System.out.println("---- 대입 연산자 ----");
		
		int value = 1;
		value += 1;
		System.out.println("값 = " + value);
		value -= 1;
		System.out.println("값 = " + value);
		value <<= 3;
		System.out.println("값 = " + value);
		value %= 3;
		System.out.println("값 = " + value);
		
		System.out.println("---- 부호 / 증감 연산자 ----");
		
		// 증감 연산자
		// 단항연산자 : 피연산자가 1개인 연산자를 뜻함
		// ++, -- : 단항 연산자로 데이터의 값을 1 증가 혹은 1 감소 시킴
		// 한 라인에서 단항연산자가 단독으로 사용될 경우는 피 연산자의 앞에 있거나 뒤에 있거나 상관없음
		// 해당 연산자가 피 연산자의 앞에 있을 경우 연산식을 실행하기 전에 데이터를 증가/감소 시킴
		// 해당 연산자가 피 연산자의 뒤에 있을 경우 연산식을 실행한 후 데이터를 증가/감소 시킴

		int data = 10;
		
		System.out.println("변수 data 의 값 : " + data);
		data++;
		System.out.println("증감 연산자 사용 후 변수 data의 값 : " + data);
		++data;
		System.out.println("증감 연산자 사용 후 변수 data의 값 : " + data);
		
		int data2 = 10;
		System.out.println("원본 data2 의 값 : " + data2);
		
		System.out.println("전위 증감 연산자로 값 증가 후 data2의 값 " + ++data2);
		System.out.println("후위 증감 연산자로 값 증가 후 data2의 값 " + data2++);
		
		System.out.println("현재 data2의 값 : " + data2);
		
		System.out.println("후위 증감 연산자로 값 감소 후 data2의 값 : " + data2--);
		System.out.println("전위 증감 연산자로 값 감소 후 data2의 값 : " + --data2);
		
		System.out.println("현재 data2의 값 : " + data2);
		
		System.out.println("---- 조건(3항) 연산자 ----");
		
		int a = 1;
		int b;
		
		b = (a == 1) ? 10 : 20;
		System.out.println(b);
		
		// 3항 연산자보다 if ~ else 문을 사용하는 것이 더 편함
		if(a == 1) {
			b = 10;
		}
		else {
			b = 20;
		}
		
		System.out.println(b);
		
		b = (a > 1) ? a++ : a + 20;
		System.out.println(a);
		System.out.println(b);
	}
}

