package chap10;

// 제네릭 클래스 생성
// Number 클래스를 제네릭이 상속받아서 숫자형만 사용 가능 하도록 제한
public class Pair<T extends Number> {
	private T num1; // 어떠한 숫자 타입이든 모두 대입이 가능한 제네릭 타입 멤버 변수
	private T num2;
	
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public T first() {
		return num1;
	}
	
	public T second() {
		return num2;
	}
}
