package chap07;

public abstract class Controller {
	boolean power; // boolean Ÿ���� true Ȥ�� false�� ���� ����
	
	void show() {
		if (power == true) {
			System.out.println(getName() + "����");
		}
		else {
			System.out.println(getName() + "����");
		}
	}
	
	abstract String getName();
}
