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
		return "외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + number + ", 국적 : " + nationality + "]";
	}
}
