package chap06;

public class PolymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new SportsCar();
		
//		for (Vehicle v : vehicles) {
//			v.whoami(); // �޼��� �������̵��� ���Ͽ� �ϳ��� �޼���� �������� �޼��带 ������ ȿ���� ����
//		}
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].whoami(); // ���� ������ whoami()��� �޼��带 ���������� ������� �ٸ��� ��µ�
		}

	}

}

class SportsCar extends Car {
	void whoami() {
		System.out.println("���� ������ �ڵ����̴�.");
	}
}