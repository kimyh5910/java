package chap04;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.name = "������";
		car.color = "ȸ��";
		car.type = "����";
		car.price = "3000";
		car.output();
	}
}

class Car {
	String name; // ���� 4�� ����
	String price;
	String color;
	String type;
	
	// �޼��� 1�� ����
	void output() {
		System.out.println(name + " ������ " + color + "�̰�, " + type + "�̸�, " + "������ " + price+ "���̴�");
	}
}
