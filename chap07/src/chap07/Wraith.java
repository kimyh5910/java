package chap07;

// 추상 클래스를 상속받은 후 상속받은 추상 메서드를 구현하지 않으면 1개 이상의 추상 메서드를 가지고 있는 것이 되기 때문에 상속받은 자식 클래스도 역시 추상 클래스로 변경됨
// abstract 키워드를 추가하여 오류가 발생하지 않도록 해야 함
// 자식 클래스도 추상 클래스로 변경되었기 때문에 객체 생성이 불가능함
public abstract class Wraith extends Unit {
	public Wraith(String name, int hp) {
		super(name,hp);
	}

	abstract void move();
//	public void fly() {
//		System.out.println(name + "이 이동합니다.");
//	}
}
