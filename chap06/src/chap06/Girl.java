package chap06;

public class Girl {
//	String name;
//	private String name; // ���������� private���� �ܺ� ���� ����
	protected String name; // ���������� protected �ܺ� ���� ���� / 
	
	// GoodGirl Ŭ������ Girl Ŭ������ ��ӹ޾Ƽ� ����ϴµ� GoodGirlŬ������ �⺻ �����ڸ� �ڵ����� �����Ͽ� ����ϹǷ� �⺻ �����ڿ� super()�� �ڵ� ����ȴ�.
	// ���⼭ �θ� Ŭ������ Girl�� �⺻ �����ڰ� ���� ������ �߻��ϰ� �ǹǷ� ������ ��� �ִ� �⺻ �����ڸ� �����ϸ� ������ �߻����� �ʴ´�.
	public Girl() {
		
	}
	
	public Girl(String name) {
		this.name = name;
	}
	
	// ��ӵǴ� �޼��� / �������̵� ����
	void show() {
		System.out.println(this.name + "�� �ڹ� �ʺ���");
	}
}
