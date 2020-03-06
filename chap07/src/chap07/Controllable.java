package chap07;

// 인터페이스 선언
// 인터페이스는 기본적으로 추상 메서드만 가지고 있음
// 인터페이스는 다중 상속을 지원함
// 상속받을 추상 메서드를 반드시 사용하도록 강제함
public interface Controllable {
	// 추상 메서드
	// 추상 메서드는 직접 사용 불가 / 상속을 통해서 구현 해야함 
	void turnOn(); // 추상 메서드
	void turnOff();
}
