package chap03;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---- For Demo 1 ----");
		
		for(int i = 1; i < 5; i++) { // for�� ���� ī��Ʈ ������ �����ϸ� �� ī��Ʈ ������ �ش� for�� �������� ����� ����
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
		
		// ī��Ʈ ������ ����� ���� i �� �ش� for�������� ���ǰ� �޸𸮿��� ���� ��
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		// System.out.println(i);
		// ���ο� for �������� �ٽ� int
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
		
	}

}
