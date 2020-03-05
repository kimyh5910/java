package chap04;

// ���� Ŭ����, ���� Ŭ������ PhoneDemo�� �����ϱ� ���ؼ� �ʿ��� Ŭ����
class Phone {
	String model; // �𵨸��� ������ ��� ����
	int value; // ������ ������ ��� ����
	
	// void�� ����, ����ٴ� �ǹ��̸�, ���⼭�� ��ȯ���� ������ ����
	void print() {
		System.out.println(value + "�� ��¥�� " + model + " ����Ʈ��");
	}
}

// ���� Ŭ����
// Ŭ������ �� �������� ������ Ŭ�������� ���������ڸ� public���� ���
// Ŭ������ ���赵�̱� ������ ���� �� �ʿ��� () �κ��� ����
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone(); // Ŭ���� Phone�� new Ű���带 ���ؼ� �ν��Ͻ�ȭ��
		myPhone.model = "������ XS"; // model �̶�� ��� ������ ������ ����
		myPhone.value = 100; // value ��� ��� ������ ������ ����
		myPhone.print(); // print() ��� �޼��带 ������ ����
		// �ν��Ͻ�ȭ�� ��ü�� ����� �����Ϸ��� '��ü��.���' ������ ����ؾ���
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
		

	}
}