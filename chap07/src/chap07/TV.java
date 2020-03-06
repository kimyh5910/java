package chap07;

// 인터페이스 Controllable를 상속받아서 구현한 클래스 TV, Computer
// implements : 인터페이스를 상속받는 키워드
// extends : 클래스를 상속받는 키워드
public class TV implements Controllable {
	// 인터페이스를 상속받아 구현한 메서드
	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끈다");
	}
}


class Computer implements Controllable {
	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 켠다");
	}
	
	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 끈다");
	}

}