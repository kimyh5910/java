package chap07;

// 추상 클래스 : 추상 메서드가 1개 이상 존재하는 클래스
// 추상클래스는 객체 생성이 안됨
// 반드시 상속받아 사용해야 함
abstract public class Shape {
	double pi = 3.14;
	
	// 추상 메서드 : 메서드의 원형만 만들어 놓은 메서드 / 실행 코드 부분이 없음
	// 해당 메서드를 오버라이딩하여 구현해서 사용해야 함
	abstract void draw();
	
	public double finArea() {
		return 0.0;
	}
}
