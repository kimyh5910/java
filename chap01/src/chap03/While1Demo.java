package chap03;

public class While1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---- while demo 1 ----");
		
		int i = 1;
		
		while (i < 5) {
			System.out.println(i);
			i++; // �ϳ��� ���ο� ȥ�� ���� �ô� ������ ������ ���̰� ����, �ٸ� ����� �Բ� ��� �� ����, ������ ���̰� �߻�
			
		System.out.println("---- while demo 2 ----");
		
		int row = 2;
		
		while (row < 10) {
			int column = 1;
			while (column < 10) {
				System.out.printf("%4d", row * column); // %-4d : ��������, 4�ڸ�, 10����, %04d : 4�ڸ�, ���ڸ�0���� 10����
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
			i++; // do ~ while�� ������ 1���� ������ �ϹǷ� i�� ���� ��������
		} while (i < 5);
		
		System.out.println("do ~ while �� ���� �� : " + i);
		
		i = 10;
		while (i < 5) {
			i++; // while�� ���ǿ� ���� ������ �� 1���� �������� �����Ƿ� i�� ���� ������ ����
			
		}
		System.out.println("while �� ���� �� : " + i);
	}
}
