package chap06;

public class BestGirl extends GoodGirl {
	public BestGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name + "�� �ڹٸ� ���߾�");
	}
}
