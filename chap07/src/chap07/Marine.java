package chap07;

public abstract class Marine extends Unit {
	public Marine(String name, int hp) {
		super(name,hp);
	}

	// ������ �̵��� ���ؼ� ����ϴ� �޼��� �Դϴ�.
	abstract void move();
//	public void run() {
//		
//	}
}
