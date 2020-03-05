package chap01;

public class charBoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char는 문자 1자를 표현하기 위한 데이터 타입
		// 문자를 표현하기 위한 기호 ' ' 을 사용함(" " 는 문자열을 표현하기 위해서 사용함)
		// 문자는 유니코드를 지원함( UTF-8 지원)
		char ga1 = '가'; // 문자 변수 ga1 에 한글 '가'저장
		char ga2 = '\uac00'; // 문자 변수 ga2 에 한글 '가'를 유니코드로 저장
		boolean cham = true; // 자바스크립트의 논리형과 동일함
		boolean geojit = false;

		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "가 아니면" + geojit + "입니다.");

		// 변수
		// 기본적으로 자바의 변수 선언 및 사용은 자바스크립트의 변수 선언 및 사용과 동일함
		// 다른점은 번수 선언 시 데이터 타입을 입력한다는 것이 다름

		// 상수
		// 변수와 같이 데이터를 저장하는 메모리 공간이지만 한번 선언 후 더 이상 데이터를 변경할 수 없는 변수

		// 프로그램 실행 중에 데이터를 변경할 수 없는 변수
		// 상수를 뜻하는 final 키워드를 사용함
		// 상수 선언과 동시에 값을 입력해야 함
		// 관례적으로 상수의 이름은 영문 대문자로 입력함

		// 사용법
		// final 데이터 타입 상수명 = 상수값;

		final double PI = 3.14; // 상수 선언, 값 3.14
		final double PI2; // 빈 상수 선언
		PI2 = 3.14; // 상수 값 최초 저장
		PI2 = 3.1428; // 상수의 값 변경 시도, 오류 발생
	}

}
