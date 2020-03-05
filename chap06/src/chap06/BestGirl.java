package chap06;

public class BestGirl extends GoodGirl {
	public BestGirl(String name) {
		super(name);
		this.name = name;
	}
	void show() {
		System.out.println(this.name + "는 자바를 개잘암");
	}
}
