package chap06.other;

public class Student extends Person {
	protected int number;
	
	public Student(String name, int age, int number) {
		super(name, age); // 상속받은 부모 클래스의 생성자를 실행
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(int number) {
		this.number = number;
	}
	public String show() {
		return "학생[이름 :" +  name + ", 나이 : " + age + " 학번 : " + number + "]";
	}
}
