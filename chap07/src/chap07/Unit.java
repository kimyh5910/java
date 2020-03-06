package chap07;

public abstract class Unit {
	int hp;
	String name;
	
	public Unit(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	void attack() {
		System.out.println(name + "대상 공격합니다.");
	}
	
	void stop() {
		System.out.println(name + "이 이동을 멈춥니다.");
	}
	
	// 오버라이딩해서 사용하세요
	abstract void move();
//	void move() {
//		System.out.println(name + "이 지정한 장소로 이동합니다.");
//	}
}
