package chap07;

public abstract class Unit {
	int hp;
	String name;
	
	public Unit(String name, int hp) {
		this.hp = hp;
		this.name = name;
	}
	
	void attack() {
		System.out.println(name + "��� �����մϴ�.");
	}
	
	void stop() {
		System.out.println(name + "�� �̵��� ����ϴ�.");
	}
	
	// �������̵��ؼ� ����ϼ���
	abstract void move();
//	void move() {
//		System.out.println(name + "�� ������ ��ҷ� �̵��մϴ�.");
//	}
}
