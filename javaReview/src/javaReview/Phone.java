package javaReview;

public class Phone {
	String Phone = "";
	public Phone(String Phone) {
		this.Phone = Phone;
	}
	
	// ��ȭ ��ȭ ���� ����
	// ���� �ѱ�, ��ȭ�ɱ�, ��ȭ ����, ��ȭ ����, ��ȭ�ޱ�, ��ȭ ����, ��ȭ ����, ���� ����
	
	
	String turnOn; // �ѱ�
	String turnOff; // ����
	
	String hangUp; // ����
	String callStart; // ����
	String callStop; // ����
	
	
	public void dialing() {
		System.out.println("��ȭ �ɱ�");
	}
	
	public void hangUp() {
		System.out.println("��ȭ ����");
	}
	
	public void turnOn() {
		System.out.println("���� �ѱ�");
	}
	
	public void turnOff() {
		System.out.println("���� ����");
	}
	
	public void callStart() {
		System.out.println("��ȭ ����");
	}
	
	public void callStop() {
		System.out.println("��ȭ ����");
	}
	
}

