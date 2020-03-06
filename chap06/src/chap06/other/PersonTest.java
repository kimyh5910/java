package chap06.other;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[3];
		Person p = new Person("홍길동", 22);
		Student s = new Student("임꺽정", 22, 100);
		ForeignStudent f = new ForeignStudent("이순신", 30,200,"한국");
		
		persons[0] = p;
		persons[1] = s;
		persons[2] = f;
			
		for(Person ps : persons) {
			String t = ps.show();
			System.out.println(t);
		}
	}

}
