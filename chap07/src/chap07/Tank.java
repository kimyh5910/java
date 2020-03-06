package chap07;

public abstract class Tank extends Marine {
	public Tank(String name, int hp) {
		super(name,hp);
	}
	
	public abstract void drive() {
		System.out.println(name + "이 이동합니다.");
	}
}
