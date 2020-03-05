package chap04;

public class CircleDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle6 myCircle = new Circle6(10.0, "내꺼");
		Circle6 yourCircle = new Circle6(5.0, "니꺼");

		System.out.println("변수의 원본");
		
		myCircle.print();
		
		myCircle.localValueUp();
		myCircle.staticValueUp();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		myCircle.localValueUp();
		myCircle.staticValueUp();
		
		System.out.println("카운트 후의 값");
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
	String name; // 멤버변수1
	double radius; // 멤버변수2
	int numCircles = 0; // 멤버변수3
	static int numOfCircles = 0; // 멤버변수4 / static을 사용하여 공유되는 멤버변수
	
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
//		numOfCircles++; // static을 사용하여 공유되어 있는 멤버 변수의 값을 증가
//		numCircles++; // 멤버 변수의 값을 증가
//	}
	
	public void print() {
		System.out.println(name + "의 numOfCircles : " + Circle6.numOfCircles);
		System.out.println(name + "의 numCircles : " + this.numCircles);
	}
}
