package chap06;

public class Two {
	void print() {
		One o = new One(); // 동일한 패키지 내에서 One 클래스를 객체로 인스턴스 화
		
//		System.out.println(o.secret); // 접근 제한자가 private으로 외부 접근 X
		System.out.println(o.roommate); // 접근 제한자가 degault로 외부 접근 O / 외부 패키지 접근 X  
		System.out.println(o.child); // 접근 제한자가 protected로 외부 접근 O / 외부 패키지 접근 X / 외부 패키지에서 상속할 경우 접근 o
		System.out.println(o.anybody);
	}
}
