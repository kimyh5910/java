package chap06.other;

public class Student extends Person {
	protected int number;
	
	public Student(String name, int age, int number) {
		super(name, age); // ��ӹ��� �θ� Ŭ������ �����ڸ� ����
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setName(int number) {
		this.number = number;
	}
	public String show() {
		return "�л�[�̸� :" +  name + ", ���� : " + age + " �й� : " + number + "]";
	}
}
