package chap06;

public class AnimalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자식 클래스가 부모 클래스로부터 상속을 받았을 경우, 자식클래스로 객체 생성 시 부모 클래스의 생성자를 먼저 실행한다.
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");

	}

}

// 부모 클래스
class Animal2 {
	public Animal2(String s) {
		System.out.println("동물 : " + s);
	}
}

// 자식 클래스
class Mammal extends Animal2 {
	public Mammal() {
	// 부모 클래스의 생성자를 호출하는 super()사용 
	// 부모 클래스인 Animal2에는 매개변수가 없는 기본 생성자가 없음
//		super(); // 오류 발생  
		
		// 부모 클래스인 Animal2의 매개변수가 1개인 생성자를 호출
		super("원숭이"); // 정상 실행
		System.out.println("포유류 : 원숭이");
	}
	
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}