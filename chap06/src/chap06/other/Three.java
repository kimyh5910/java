package chap06.other;

import chap06.One; // �ܺ� ��Ű������ �ε��Ͽ� ���

public class Three {
	void print() {
		// �ܺ� ��Ű������ Ŭ������ ��üȭ�Ͽ� ���
		One o = new One();
		
//		System.out.println(o.secret); // private
//		System.out.println(o.roommate); // default // �ܺ� ��Ű������ ��� x
//		System.out.println(o.child); // protected // �ܺ� ��Ű������ ��� x
		System.out.println(o.anybody); // public �ܺο��� ���� ����
	}

}
