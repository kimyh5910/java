package chap07;

// �߻� Ŭ���� Controller�� ��ӹ���
// �߻� �޼��� getName()�� �����ؾ� ��
public class TV5 extends Controller{
	String name = "TV"; // Ŭ���� TV5 ������ ��� ���� name�� ������
	
	
	public TV5(boolean power) {
//		super(); // �θ� Ŭ������ �����ڸ� ȣ���ϴ� �κ� / �θ�Ŭ������ �����ڰ� ���� ��� �����Ϸ��� �ڵ����� �����Ͽ� ������
		// �ڽ� Ŭ�������� �θ� Ŭ������ �⺻ �����ڸ� ȣ������ ������ �����Ϸ��� �ڵ����� �����Ͽ� ȣ��
		this.power = power;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
