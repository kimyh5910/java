package chap06;

//import java.util.*; // java.util 패키지에 있는 모든 클래스를 다 로드함
import java.util.Scanner; // java.util.Scanner 클래스만 로드해서 사용
import com.pack.test.*; // com.pack.test 패키지의 모든 클래스를 로드함

public class importDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		java.util.Scanner in = new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		// java.lang 패키지는 기본 패키지로써 자동 로딩 되어 있어서 생략이 가능함
		java.lang.System.out.print("이름을 입력해주세요 : ");
		String name = in.next();
		System.out.print(name);
		
		System.out.println("------------------");

		// 자신의 패키지에 있는 Calculator 클래스로 객체를 생성
		Calculator cal1 = new Calculator();
		cal1.output();
		
		// 다른 패키지의 Calculator 클래스를 불러와서 객체를 생성
		// 다른 패키지의 클래스 이름이 동일할 경우 패키지 명까지 다 입력
		com.pack.test.Calculator cal2 = new com.pack.test.Calculator();
		cal2.output();
	}

}
