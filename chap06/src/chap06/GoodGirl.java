package chap06;

public class GoodGirl extends Girl {
 public GoodGirl(String name) {
	super(name);
	this.name = name;
}
	
	// GoodGirl 클래스는 어떠한 생성자도 없음
	// 컴파일러는 자동으로 기본생성자를 생성하여 사용함
	// GoodGirl 클래스는 Girl 클래스를 상속 받았으므로 기본 생성자에 super()가 입력되어 있음
	// super()는 부모 클래스인 Girl 클래스의 기본 생성자를 호출하게 됨
//	public GoodGirl() {
//		super();
//	}
	
	void show() {
		System.out.println(this.name + "는 자바를 잘암");
	}
}
