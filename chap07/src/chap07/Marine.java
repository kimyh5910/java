package chap07;

public abstract class Marine extends Unit {
	public Marine(String name, int hp) {
		super(name,hp);
	}

	// 마린이 이동을 위해서 사용하는 메서드 입니다.
	abstract void move();
//	public void run() {
//		
//	}
}
