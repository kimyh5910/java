package chap03;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바 스크립트의 break, continue문과 거의 동일한 기능을 가지고 있음
		System.out.println("---- break Demo1----");
		int i = 1;
		int j = 5;
		
		while (true) {
			System.out.println(i++); // 후위 증감연산자를 사용하여 i 의 값을 화면에 출력 후 증가
			
			if(i >= j) { // while문 탈출을 위해서 if문을 이용하여 조건확인
				break;
			}
		}
		
		System.out.println("---- break Demo2----");
		
		int row = 2;
		
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column);
				column++;
				if (column >= 5 ) {
					break;
				}
			}
			System.out.println();
			row++;
		}
		
		System.out.println("---- \n레이블을 사용한 break 문----");
		
		row = 2;
		
		out: while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			
				if (column >= 5 ) {
					break out;
				}
			}
			System.out.println();
			row++;
		}
		System.out.println();
		System.out.println("---- continue Demo1----");
		// continue : 반복문 실행 중 continue문을 만나면 해당 루프의 실행을 중지하고 반복 조건을 확인하여 다음 루프로 이동함
		
		for(int x = 0; x < 10; x++) {
			if(x % 2 == 0)
				continue;
			
			System.out.print(x);
		}
	}
}
