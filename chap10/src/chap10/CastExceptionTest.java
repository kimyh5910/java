package chap10;

class Shape {
	
}

class Rectangle extends Shape {
	
}

class Circle extends Rectangle {
	
}
public class CastExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		}
		catch(ClassCastException e) {
			System.out.println("Ÿ�� ��ȯ �� ������ �߻��߽��ϴ�.");
		}
		
	}
	
	static void casting(Shape s) throws ClassCastException {
			Circle c = (Circle)s;
		
	}

}
