package chap04;

public class CircleDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle6 myCircle = new Circle6(10.0, "����");
		Circle6 yourCircle = new Circle6(5.0, "�ϲ�");

		System.out.println("������ ����");
		
		myCircle.print();
		
		myCircle.localValueUp();
		myCircle.staticValueUp();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		
		System.out.println("ī��Ʈ ���� ��");
		myCircle.print();
		
		System.out.println("-------------");
		yourCircle.print();
		
		
		
		
//		myCircle.print();
//		yourCircle.print();
//		
//		myCircle.count();
//		yourCircle.count();
//		
//		myCircle.print();
//		yourCircle.print();

	}

}

class Circle6 {
	String name; // �������1
	double radius; // �������2
	int numCircles = 0; // �������3
	static int numOfCircles = 0; // �������4 / static�� ����Ͽ� �����Ǵ� �������
	
	public Circle6(double radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public void localValueUp() {
		numCircles++;
	}
	
	public void staticValueUp() {
		numOfCircles++;
	}
	
//	public void count() {
//		numOfCircles++; // static�� ����Ͽ� �����Ǿ� �ִ� ��� ������ ���� ����
//		numCircles++; // ��� ������ ���� ����
//	}
	
	public void print() {
		System.out.println(name + "�� numOfCircles : " + Circle6.numOfCircles);
		System.out.println(name + "�� numCircles : " + this.numCircles);
	}
}
