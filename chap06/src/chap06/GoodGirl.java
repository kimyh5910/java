package chap06;

public class GoodGirl extends Girl {
 public GoodGirl(String name) {
	super(name);
	this.name = name;
}
	
	// GoodGirl Ŭ������ ��� �����ڵ� ����
	// �����Ϸ��� �ڵ����� �⺻�����ڸ� �����Ͽ� �����
	// GoodGirl Ŭ������ Girl Ŭ������ ��� �޾����Ƿ� �⺻ �����ڿ� super()�� �ԷµǾ� ����
	// super()�� �θ� Ŭ������ Girl Ŭ������ �⺻ �����ڸ� ȣ���ϰ� ��
//	public GoodGirl() {
//		super();
//	}
	
	void show() {
		System.out.println(this.name + "�� �ڹٸ� �߾�");
	}
}
