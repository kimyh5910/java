package chap10;

public class GenMethodDemo2 {

	static class Utils {
		// <T extends Number> 는 Number 클래스를 상속받아서 Number 클래스의 특성을 가지고 있는 클래스 타입만 사용할 수 있도록 제한 됨
		public static <T extends Number> void showArray(T[] a) {
			for (T t : a) {
				System.out.printf("%s", t);
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ia = {1,2,3,4,5};
		Double[] da = {1.0,2.0,3.0,4.0,5.0};
		Character[] ca = {'H','E','L','L','O'};
		
		Utils.showArray(ia);
		Utils.showArray(da);
//		Utils.showArray(ca);
	}

}
