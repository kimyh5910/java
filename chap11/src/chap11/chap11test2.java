package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class chap11test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("�迭��", 20));
		set.add(new Person("�ְ��", 56));
		set.add(new Person("����", 16));
		set.add(new Person("���ڹ�", 20));
	
	
	for (Person p : set) {
		System.out.println(p.name + " : " + p.age);
	}
	
	// �ݺ��� ��Ʈ������ ����Ͽ� set ��ü�� ��� ������ ���
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
