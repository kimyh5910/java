package chap07;
// 추상 클래스 Abstract를 상속 받음
public class Concrete extends Abstract {
	int j;
	
	public Concrete(int j, int i) {
		super(i); // 부모 클래스의 생성자를 실행하는 부분 / 부모 클래스에 사용자가 생성한 생성자가 있을 경우 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 부분이 필요함
		this.j = j;
	}
	
	// 상속받은 추상 클래스의 모든 추상 메서드를 구현해야함
	@Override
	void show() {
		System.out.println("i = " + i + ", j = " +j);
	}
}
