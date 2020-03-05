package chap06;

public class One {
	private int secret = 1; // 접근 제한자가 private으로 해당 클래스 내에서만 사용 / 외부 접근 X
	int roommate = 2; // 접근 제한자가 default로 외부 패키지에서 접근 안됨
	protected int child = 3; // 접근 제한자가 protected로 자식 클래스에서 접근 가능
	public int anybody = 4; // 접근 제한자가 public으로 모든 영역에서 접근 가능
	
	// 모든 영역에서 접근 가능
	public void show() {
		
	}
}
