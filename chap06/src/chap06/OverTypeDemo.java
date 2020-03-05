package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Car();
//		System.out.println(v.name); // 부모 클래스 타입의 멤버 변수 실행
//		v.whoami(); // 오버라이딩된 whoami()가 실행 됨
//		v.move(); // static
		
		Vehicle v = new Vehicle();
		System.out.println(v.name);
		v.whoami();
		v.move();
		
		System.out.println("---------------");
		
		Car c = new Car();
		System.out.println(c.name);
		c.whoami();
		c.move();
		
		System.out.println("---------------");
		
		v = c;
		System.out.println(v.name);
		v.whoami();
		v.move();
	}

}

class Vehicle {
	String name = "탈 것";
	
	// 상속되어 오버라이딩될 메서드
	void whoami() {
		System.out.println("나는 탈 것이다.");
	}
	
	// static을 사용하여 상속이 되지 않음 // 클래스의 멤버로서 공유되어 사용됨 // 오버라이딩 불가
	static void move() {
		System.out.println("이동하다.");
	}
}

class Car extends Vehicle {
	String name = "자동차";
	
	// 해당 클래스가 오버라이딩됨
	void whoami() {
		System.out.println("나는 자동차이다.");
	}

	// static을 사용하여 상속이 되지 않음 // 클래스의 멤버로서 공유되어 사용됨 // 부모 클래스의 멤버 메서드를 오버라이딩하는 것이 불가능
	static void move() {
		System.out.println("달리다.");
	}
}

