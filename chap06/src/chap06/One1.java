package chap06;

// 부모 클래스 One 에서 상속 받음
public class One1 extends One {
	void print() {
//		System.out.println(secret); // 접근 제한자가 private으로 상속이 안됨
		System.out.println(roommate); // 접근 제한자가 default 로 상속 가능/ 상속자가 접근 가능
		System.out.println(child); // 접근 제한자가 protected로 상속 가능/ 상속자가 접근 가능
		System.out.println(anybody); // 접근 제한자가 public으로 상속 가능 / 외부 접근 가능
	}
	
	// 부모 클래스의 멤버 메서드를 오버라이딩하려 하지만 접근 제한자가 변경되어 오류 발생
//	void show() {
//
//}
}
