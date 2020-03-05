package chap04;

public class LocalVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; // 지역변수, 값을 0으로 초기화
		double b; // 지역변수, 값을 초기화하지 않음
		
//		System.out.print(b); // 변수를 초기화 하지 않아서 사용 불가능
//		System.out.print(a + c); // 변수 c를 선언하지 않고 사용함

		int c = 0;
		
//		public double d = 0.0; // 지역 변수는 public을 사용할 수 없음, final만 사용 가능
		
		for(int e = 0; e < 10; e++) {
			
//			int a = 1; // 동일한 변수명을 사용할 수 없음
			System.out.print(e);
		}
	}

}
