package chap06;

public class AnimalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڽ� Ŭ������ �θ� Ŭ�����κ��� ����� �޾��� ���, �ڽ�Ŭ������ ��ü ���� �� �θ� Ŭ������ �����ڸ� ���� �����Ѵ�.
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");

	}

}

// �θ� Ŭ����
class Animal2 {
	public Animal2(String s) {
		System.out.println("���� : " + s);
	}
}

// �ڽ� Ŭ����
class Mammal extends Animal2 {
	public Mammal() {
	// �θ� Ŭ������ �����ڸ� ȣ���ϴ� super()��� 
	// �θ� Ŭ������ Animal2���� �Ű������� ���� �⺻ �����ڰ� ����
//		super(); // ���� �߻�  
		
		// �θ� Ŭ������ Animal2�� �Ű������� 1���� �����ڸ� ȣ��
		super("������"); // ���� ����
		System.out.println("������ : ������");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
}