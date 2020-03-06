package chap06.other;

public class ForeignStudent extends Student {
	protected String nationality;
	
	public ForeignStudent(String name, int age, int number, String nationality) {
		super(name, age, number);
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationailty(String nationality) {
		this.nationality = nationality;
	}
	
	public String show() {
		return "�ܱ��л�[�̸� : " + name + ", ���� : " + age + ", �й� : " + number + ", ���� : " + nationality + "]";
	}
}
