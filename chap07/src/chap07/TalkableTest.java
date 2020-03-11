package chap07;

public abstract class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
	}
	
	// 두개의 클래스의 모두의 부모 클래스 혹은 부모 인터페이스
	static void speak(Talkable t) {
		t.talk();
	}

}
