package chap06;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(); // 자식 클래스 타입으로 객체 생성
		Person p = new Person(); // 부모 클래스 타입으로 객체 생성
		
		System.out.println(s instanceof Person); // 객체 s는 부모 클래스 Person에 속하기 때문에 Person의 객체라고 할 수 있음 // 자동 타입 변환 지원
		System.out.println(s instanceof Student); // 객체 s는 Student 클래스의 객체
		System.out.println(p instanceof Student); // 객체 p는 자식 클래스인 Student의 객체가 될 수 없음
//		System.out.println(s instanceof String); // 객체 s는 String 클래스와 연관된 클래스로 만들어진 객체가 아니기 때문에 오류 발생
		
		downcast(s);
	}
	
	// 매개변수로 받은 객체s가 자동 타입 변환됨
	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student)p; // 강제 타입 변환
			System.out.println("OK, 하향 타입 변환");
		}
	}

}
