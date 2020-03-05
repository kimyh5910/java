package chap06.other;

import chap06.One;

public class One2 extends One {
	void print() {
//		System.out.println(secret); // private
//		System.out.println(roommate); // 접근 제한자가 default 로 동일 패키지내에서 외부 접근 o / 외부 패키지에서 접근 x
		System.out.println(child); // 접근 제한자가 protected로 동일 패키지 내에서 외부 접근 가능 / 외부 패키지를 상속할 경우 접근 o
		System.out.println(anybody);
	}
	
}
