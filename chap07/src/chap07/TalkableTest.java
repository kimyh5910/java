package chap07;

public abstract class TalkableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speak(new Korean());
		speak(new American());
	}
	
	// �ΰ��� Ŭ������ ����� �θ� Ŭ���� Ȥ�� �θ� �������̽�
	static void speak(Talkable t) {
		t.talk();
	}

}
