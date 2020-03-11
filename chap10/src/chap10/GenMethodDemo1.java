package chap10;

public class GenMethodDemo1 {
	
	// ���� Ŭ���� ���
	// �Ϲ� Ŭ�������� ���׸� �޼��� ��� ���
	static class Utils {
		public static <T> void showArray(T[] a ) {
			for (T t : a) {
				System.out.printf("%s", t);
			}
			System.out.println();
		}
		public static <T> T getLast(T[] a) {
			return a[a.length -1];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5}; // �⺻ int Ÿ���� ���� Ŭ������ Integer Ŭ���� Ÿ������ �迭�� ���� �� ������ �߰�
		Character[] ca = {'H', 'E', 'L', 'L', 'O'}; // �⺻ char Ÿ���� ���� Ŭ������ Character Ŭ���� Ÿ������ �迭 ���� �� ������ �߰�
		
		Utils.showArray(ia);
		Utils.<Character>showArray(ca);
		
		System.out.println(Utils.getLast(ia));
	}

}
