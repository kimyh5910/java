package chap01;

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바에서 단순히 콘솔에 출력하기
		// println() : 화면에 내용을 출력 후 라인 변경
		// print() : 화면에 내용을 출력(라인 변경 없음)
		// printf() : 화면에 내용을 출력 시 지정한 표맷에 맞춰서 출력

		System.out.println("화면에 내용을 출력 후 라인 변경");
		System.out.print("화면에 내용 출력 후");
		System.out.print("라인 변경은 없음");

		System.out.println(); // 단순 출력 라인 변경

		// printf() 사용법
		// System.out.printf("포맷 명시", 데이터1, 데이터2, ...);
		System.out.printf("화면에 %s 출력 후 %s", "내용을", "라인 변경"); // C 언어에서 온 방식
		System.out.println("화면에 " + "내용을 " + "출력 후 " + "라인 변경"); // 자바 방식

		// printf() 에서 포맷 사용 시 필요한 특수 기호
		// %d : 10 진수 숫자
		// %o : 8진수 숫자
		// %x : 16진수 숫자
		// %c : 문자 1자
		// %5d : 10진수 숫자 5자리
		// %-5d : 10진수 숫자 5자리, 왼쪽 정렬
		// %05d : 10진수 숫자 5자리, 빈자리는 0으로 채움
		// %s : 문자열 출력
		// %5s : 문자열 5자리 출력, 빈자리는 공백
		// %-5s : 문자열 5자리 출력, 빈자리는 공백, 왼쪽 정렬
		// %f : 실수 출력
		// %e : 실수를 지수 형식으로 출력
		// %4.1f : 4자리 실수, 소수점 이하는 1자리
		// %04.1f : 4자리 실수, 소수점 이하는 1자리, 빈자리는 0으로 채움
		// %-4.1f : 4자리 실수, 소수점 이하는 1자리, 왼쪽 정렬
	}

}
