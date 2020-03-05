package chap03;

public class While1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- while demo 1 ----");
		
		int i = 1;
		
		while (i < 5) {
			System.out.println(i);
			i++; // 하나의 라인에 혼자 실행 시는 후위나 전위나 차이가 없음, 다른 연산과 함께 사용 시 전위, 후위의 차이가 발생
			
		System.out.println("---- while demo 2 ----");
		
		int row = 2;
		
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column); // %-4d : 왼쪽정렬, 4자리, 10진수, %04d : 4자리, 빈자리0으로 10진수
				column++;
			}
			System.out.println();
			row++;
			}
		
		System.out.println("---- Do ~ while demo1 ----");
		
		int x = 1;
		do {
			System.out.println(x);
			x++;
        }	while(x < 5);
		}
		
		System.out.println("---- Do ~ while demo2 ----");
		
		i = 10;
		
		do {
			i++; // do ~ while은 무조건 1번은 실행을 하므로 i의 값이 증가했음
		} while (i < 5);
		
		System.out.println("do ~ while 문 실행 후 : " + i);
		
		i = 10;
		while (i < 5) {
			i++; // while은 조건에 맞지 않으면 단 1번도 실행하지 않으므로 i의 값이 변경이 없음
			
		}
		System.out.println("while 문 실행 후 : " + i);
	}
}
