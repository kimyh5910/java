package chap06.other;

import chap06.One; // 외부 패키지에서 로드하여 사용

public class Three {
	void print() {
		// 외부 패키지에서 클래스를 객체화하여 사용
		One o = new One();
		
//		System.out.println(o.secret); // private
//		System.out.println(o.roommate); // default // 외부 패키지에서 사용 x
//		System.out.println(o.child); // protected // 외부 패키지에서 사용 x
		System.out.println(o.anybody); // public 외부에서 접근 가능
	}

}
