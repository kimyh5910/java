package chap06;

public class GirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Girl[] girls = {
				new Girl("갑순이"),
				new GoodGirl("콩쥐"),
				new BestGirl("황진이"),
		};
		
		for (Girl g : girls) {
			g.show();
		}
//		Girl g1 = new Girl(); // 클래스 Girl를 객체로 생성
//		Girl g2 = new GoodGirl(); // 부모 클래스 Girl을 객체로 사용하고 자식 클래스 GoodGirl의 객체를 생성 // 부모 클래스 타입으로 선언되기 때문에 Girl 클래스가 가진 멤버만 사용 가능
//		GoodGirl gg = new BestGirl(); // 부모 클래스 GoodGirl의 객체로 변수를 생성하고, 생성자를 자식클래스 BestGirl의 생성자를 사용하여 객체를 생성 / 부모 클래스 타입인 GoodGirl의 멤버만 사용이 가능함
//		
//		g2. show(); // Girl 클래스는 show() 메서드가 없으므로 Girl 클래스 타입 g2는 show()메서드를 사용할 수 없음
//		gg.show(); // BestGirl 클래스에서 show() 메서드를 상속받아 오버라이딩하여 사용 / BestGirl 클래스의 멤버 메서드 show()가 실행됨
//	}
//
}
}

