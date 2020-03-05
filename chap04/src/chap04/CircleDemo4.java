package chap04;

class Circle4 {
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle4(double r) {
		radius = r; 
	}
}
public class CircleDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle4 myCircle = new Circle4(10.0);
		myCircle.setRadius(10.0);;
//		myCircle.show(myCircle.radius, myCircle.findArea());
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}

}
