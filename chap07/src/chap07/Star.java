package chap07;

public class Star {
	public static void main(String[] args) {
		
		Marine m = new Marine("마린", 100);
//		m.move();
		m.run();
		m.stop();
		m.attack();
		
		Tank t = new Tank("시즈탱크", 300);
//		t.move();
		t.drive();
		t.stop();
		t.attack();
		
		// Wraith 클래스는 추상 클래스인 Unit를 상속받았으나 추상 메서드인 move()를 구현하지 않았기 때문에 추상 클래스로 변경되어 객체를 생성할 수 없음
//		Wraith w = new Wraith("레이쓰", 200);
//		w.move();
//		w.fly();
//		w.stop();
//		w.attack();
	}
}
