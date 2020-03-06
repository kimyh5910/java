package chap07;

// �������̽� Controllable�� ��ӹ޾Ƽ� ������ Ŭ���� TV, Computer
// implements : �������̽��� ��ӹ޴� Ű����
// extends : Ŭ������ ��ӹ޴� Ű����
public class TV implements Controllable {
	// �������̽��� ��ӹ޾� ������ �޼���
	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ����");
	}
}


class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("��ǻ�͸� �Ҵ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("��ǻ�͸� ����");
	}

}