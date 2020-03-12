package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class chap11test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 20));
	
	
	for (Person p : set) {
		System.out.println(p.name + " : " + p.age);
	}
	
	// 반복자 스트림으로 사용하여 set 객체의 모든 내용을 출력
	Iterator<Person> iterator = set.iterator();
	while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
	}
	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj instanceof Person) {
			Person p = (Person) obj;
			
			if(name.equals(p.name) && age == p.age ) {
				result = true;
			}
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "Person[" + name + ", " + age + "]";
	}
}
