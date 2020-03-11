package chap07;
// 추상 클래스 Abstract를 상속 받음
public abstract class Abstract {
	int i;
	
	public Abstract(int i) {
		this.i = i;
	}
	
	abstract void show();
}
