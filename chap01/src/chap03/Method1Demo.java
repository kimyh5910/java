package chap03;

public class Method1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 함수 : 특정한 동작(연산), 혼자서 선언되고 사용됨
		// 메서드 : 클래스에 포함된 함수, 함수와 동일한 것, 클래스의 멤버로써 선언되고 사용됨
		// 변수 : 데이터의 저장
		// 클래스 : 함수와 변수를 가지고 있는 설계도
		
		
		int sum = 0;
		
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("함(1~10) : " + sum);
		
		sum = 0;
		
		for(int i = 10; i <= 100; i++) {
			sum += i;
		}
		System.out.println("함(10~100) : " + sum);
		
		sum = 0;
		
		for(int i = 100; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("함(100~1000) : " + sum);
		
		sum = 0;
	}

}
