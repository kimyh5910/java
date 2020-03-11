package chap07;

// 추상 클래스 Controller를 상속받음
// 추상 메서드 getName()을 구현해야 함
public class TV5 extends Controller{
	String name = "TV"; // 클래스 TV5 고유의 멤버 변수 name이 존재함
	
	
	public TV5(boolean power) {
//		super(); // 부모 클래스의 생성자를 호출하는 부분 / 부모클래스에 생성자가 없을 경우 컴파일러가 자동으로 생성하여 실행함
		// 자식 클래스에서 부모 클래스의 기본 생성자를 호출하지 않으면 컴파일러가 자동으로 생성하여 호출
		this.power = power;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
