package chap06;

public class Two {
	void print() {
		One o = new One(); // ������ ��Ű�� ������ One Ŭ������ ��ü�� �ν��Ͻ� ȭ
		
//		System.out.println(o.secret); // ���� �����ڰ� private���� �ܺ� ���� X
		System.out.println(o.roommate); // ���� �����ڰ� degault�� �ܺ� ���� O / �ܺ� ��Ű�� ���� X  
		System.out.println(o.child); // ���� �����ڰ� protected�� �ܺ� ���� O / �ܺ� ��Ű�� ���� X / �ܺ� ��Ű������ ����� ��� ���� o
		System.out.println(o.anybody);
	}
}
