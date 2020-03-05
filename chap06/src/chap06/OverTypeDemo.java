package chap06;

public class OverTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Car();
//		System.out.println(v.name); // �θ� Ŭ���� Ÿ���� ��� ���� ����
//		v.whoami(); // �������̵��� whoami()�� ���� ��
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
	String name = "Ż ��";
	
	// ��ӵǾ� �������̵��� �޼���
	void whoami() {
		System.out.println("���� Ż ���̴�.");
	}
	
	// static�� ����Ͽ� ����� ���� ���� // Ŭ������ ����μ� �����Ǿ� ���� // �������̵� �Ұ�
	static void move() {
		System.out.println("�̵��ϴ�.");
	}
}

class Car extends Vehicle {
	String name = "�ڵ���";
	
	// �ش� Ŭ������ �������̵���
	void whoami() {
		System.out.println("���� �ڵ����̴�.");
	}

	// static�� ����Ͽ� ����� ���� ���� // Ŭ������ ����μ� �����Ǿ� ���� // �θ� Ŭ������ ��� �޼��带 �������̵��ϴ� ���� �Ұ���
	static void move() {
		System.out.println("�޸���.");
	}
}

