package javaReview;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���� : ������ ���α׷� ���赵, ��� ������ ��� �޼��带 ������ �ִ� ���� Ÿ��, Ư�� ����� �����ϱ� ���ؼ� �ʿ��� ������ Ư�� ����� �����ϴ� �޼��带 �ϳ��� �̸����� ��� ��ٵ� ��
		
		// Ŭ������ new Ű���带 �̿��� �ν��Ͻ�ȭ�Ͽ� ��ü�� ������
		Cal cal = new Cal();
		int sum = cal.sum(10, 20); // Cal Ŭ������ sum �Լ��� ����, ��ȯ���� sum�� ����
		System.out.println(sum); // ����� ���� ���
		
		// Television Ŭ������ �ν��Ͻ�ȭ�Ͽ� ��ü�� ����
		Television tv1 = new Television("702ȣ");
		// Television Ŭ������ ��ü�� ������� ������ Television Ŭ������ ��� ������ ��� �޼��带 ����� �� ����
		
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.powerOff();
		
		Television tv2 = new Television("604ȣ");
		tv2.powerOn();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.channelUp();
		tv2.powerOff();
		
		Phone ph1 = new Phone("��1");
		ph1.turnOn();
		ph1.dialing();
		ph1.callStart();
		ph1.callStop();
		
		
		
		Phone ph2 = new Phone("��2");
	
	}

	// �Ʒ��� ���� �ʿ��� �޼��带 ���� ����ϴ� ���� ������ �������� ���
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int multi(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	
}

class Cal {
		public  int sum(int a, int b) {
			return a + b;
		}
		
		public  int sub(int a, int b) {
			return a - b;
		}
		
		public  int multi(int a, int b) {
			return a * b;
		}
		
		public  int div(int a, int b) {
			return a / b;
		}
	}