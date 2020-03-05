package chap03;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---- For Demo 1 ----");
		
		for(int i = 1; i < 5; i++) { // for문 사용시 카운트 변수를 선언하면 이 카운트 변수는 해당 for문 내에서만 사용이 가능
			System.out.println(i);
		}
		System.out.println("---- For Demo 2 ----");
		
		for (int row = 2; row < 10; row++ ) {
			for (int column = 1; column < 10; column++) {
				System.out.printf("%4d",row * column);
			}
			System.out.println();
		}
		
		System.out.println("---- For Demo 3 ----");
		
		// 카운트 변수로 사용한 변수 i 는 해당 for문에서만 사용되고 메모리에서 삭제 됨
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		// System.out.println(i);
		// 새로운 for 문에서는 다시 int
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		
	}

}
