package chap06.other;

public class Person  {
	protected String name;
	protected int age;
	
		
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String show() {
		return "���[�̸� : " + name + ", ���� : " + age + "]";
//		System.out.println("���[�̸� : " + name + ", ���� : " + age + "]");
	}
}
