package chap06.other;

import chap06.One;

public class One2 extends One {
	void print() {
//		System.out.println(secret); // private
//		System.out.println(roommate); // ���� �����ڰ� default �� ���� ��Ű�������� �ܺ� ���� o / �ܺ� ��Ű������ ���� x
		System.out.println(child); // ���� �����ڰ� protected�� ���� ��Ű�� ������ �ܺ� ���� ���� / �ܺ� ��Ű���� ����� ��� ���� o
		System.out.println(anybody);
	}
	
}
