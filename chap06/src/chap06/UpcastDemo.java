package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Student s = new Student();
		
		p.name = "홍길동";
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("--------------------------");
		
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2; // 오류 발생 / 부모 클래스는 자식 클래스로 변환이 불가능함
		
		
		
		System.out.println("--------------------------");
		
		s.name = "임꺽정";
		s.number = 1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoami();
		s.work();
		
		System.out.println("--------------------------");
		
// 		Person 클래스의 객체 변수에 Student 클래스의 객체를 대입하여 Person 클래스 타입으로 자동 타입 변환 됨 
//		Student 클래스가 Person 클래스를 상속받고 있기 때문에 타입 변환이 가능함
		p = s;
//		p.number = 1; // Person 클래스가 가지고 있는 멤버만 사용이 가능함
//		p.work(); // Person 클래스가 가지고 있는 멤버만 사용이 가능함
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("--------------------------");
		
		// 객체의 강제 타입 변환은 자식 클래스 타입으로 생성된 객체를 부모 클래스 타입으로 변경했다가 다시 자식 클래스 타입으로 강제 타입 변환하는 것이 가능함
		// 대신 강제 타입 변환을 해줘야함
		Student s1;
		s1 = (Student)p;
		System.out.println(s.name);
		System.out.println(s.number); // 부모 타입이었을 경우 사용 못했던 부분을 다시 사용 가능
		s.whoami();
		s.work(); // 부모 타입이었을 경우 사용 못했던 부분을 다시 사용 가능
		
	}

}
