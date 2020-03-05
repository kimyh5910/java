package chap06;

public class Girl {
//	String name;
//	private String name; // 접근제한자 private으로 외부 접근 제한
	protected String name; // 접근제한자 protected 외부 접근 제한 / 
	
	// GoodGirl 클래스가 Girl 클래스를 상속받아서 사용하는데 GoodGirl클래스는 기본 생성자를 자동으로 생성하여 사용하므로 기본 생성자에 super()가 자동 실행된다.
	// 여기서 부모 클래스인 Girl은 기본 생성자가 없어 오류가 발생하게 되므로 내용이 비어 있는 기본 생성자를 생성하면 에러가 발생하지 않는다.
	public Girl() {
		
	}
	
	public Girl(String name) {
		this.name = name;
	}
	
	// 상속되는 메서드 / 오버라이딩 가능
	void show() {
		System.out.println(this.name + "는 자바 초보자");
	}
}
