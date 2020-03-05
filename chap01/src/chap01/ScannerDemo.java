package chap01;

// import : 이미 만들어져 있는 자바의 내장 클래스나 다른 사람이 만들어 놓은 클래스를 현재의 파일로 로딩해서 사용하는 것 
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 클래스의 객체를 생성하여 사용
		// new : 클래스의 복제체인 객체를 생성하는 명령어
		
		Scanner in = new Scanner(System.in); // Scanner 클래스를 객체화하여 in을 생성함
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int x = in.nextInt(); // 키보드의 숫자 입력을 받는 메서드 / int타입 변수 x에 저장
		System.out.print("두번째 숫자를 입력하세요 : ");
		int y = in.nextInt(); // 키보드의 숫자 입력을 받는 메서드 / int타입 변수 y에 저장
		
		System.out.println(x + "*" + y + "은" + x * y + "입니다.");
//		System.out.printf("%d * %d은 %d입니다. \n",  x, y, x * y);
		
		// Scanner 클래스가 제공하는 데이터 입력 메서드
		// next() : 문자열을 입력받음, 문자 혹은 문자열의 공백을 기준으로 한 단어, 한 문자씩 입력 받음
		// nextByte() : byte 타입의 데이터를 입력받음
		// nextShort() : short 타입의 데이터를 입력받음
		// nextInt() : int 타입의 데이터를 입력받음
		// nextLong() : long 타입의 데이터를 입력받음
		// nextFloat() : float 타입의 데이터를 입력받음
		// nextDouble() : double 타입의 데이터를 입력받음
		// nextLine() : 문자열을 입력받음, 문자 혹은 문자열을 한 라인 전체로 입력 받음
		
		System.out.print("이름을 입력하세요 : ");
		String name = in.next();
		System.out.println("입력된 이름은 : " + name + "입니다.");
	}

}
