package javaReview;

public class Television {
	// ���°��� �����ϱ� ���� Ŭ���� ��� ����
	// ��� ������ �����̱� ������ ����� ���ÿ� ���� �Ҵ��� �� ����
	// Ŭ�������� �޼����� ������ �Ұ�����
	// ������ �ݵ�� �޼��� ������ �����ؾ� ��
	// Ŭ������ ȥ�ڼ� ������ �Ұ����ϱ� ������ �ݵ�� �ν��Ͻ�ȭ�Ͽ� ��ü�� ���� �� �����ؾ� ��
	String name = "";
	boolean power; 
	int channel;
	int volume; 
	private int maxChannel = 100;
	private int minVolume = 0;
	private int maxVolume = 30;
	
	// powerOn(); // Ŭ������ ȥ�ڼ� ������ �Ұ���
	
	// Television Ŭ������ ������
	// �����ڴ� �⺻������ �ش� Ŭ������ ��� ������ �ʱ�ȭ�ϴµ� �����
	public Television(String name) {
		this.name = name; // �Ű������� ���� ���� Ŭ���� ��� ���� name�� ����
	}
	
	public void powerOn() {
		System.out.println(name + "������ �������ϴ�.");
	}
	
	public void powerOff() {
		System.out.println(name + "������ �������ϴ�.");
	}
	
	public void channelUp() {
		channel++;
		
		if(channel > maxChannel) {
			channel = 0;
		}
		System.out.println(name + "ä����" + channel + "���� ����Ǿ����ϴ�.");
	}
	
	public void channelDown() {
		channel--;
		
		if(channel < 0) {
			channel = maxChannel;
		}
		System.out.println(name + "ä����" + channel + "���� ����Ǿ����ϴ�.");
	}
	
	public void volumeUp() {
		volume++;
		
		if(volume > maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name + "����" + volume + "���� ����Ǿ����ϴ�.");
	}
	
	public void volumeDown() {
		volume--;
		
		if(volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name + "����" + volume + "���� ����Ǿ����ϴ�.");
	}
}
