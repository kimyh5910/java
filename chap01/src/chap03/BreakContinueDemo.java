package chap03;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ڹ� ��ũ��Ʈ�� break, continue���� ���� ������ ����� ������ ����
		System.out.println("---- break Demo1----");
		int i = 1;
		int j = 5;
		
		while (true) {
			System.out.println(i++); // ���� ���������ڸ� ����Ͽ� i �� ���� ȭ�鿡 ��� �� ����
			
			if(i >= j) { // while�� Ż���� ���ؼ� if���� �̿��Ͽ� ����Ȯ��
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
		
		System.out.println("---- \n���̺��� ����� break ��----");
		
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
		// continue : �ݺ��� ���� �� continue���� ������ �ش� ������ ������ �����ϰ� �ݺ� ������ Ȯ���Ͽ� ���� ������ �̵���
		
		for(int x = 0; x < 10; x++) {
			if(x % 2 == 0)
				continue;
			
			System.out.print(x);
		}
	}
}
