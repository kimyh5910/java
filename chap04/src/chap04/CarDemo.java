package chap04;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.name = "말리부";
		car.color = "회색";
		car.type = "세단";
		car.price = "3000";
		car.output();
	}
}

class Car {
	String name; // 변수 4개 선언
	String price;
	String color;
	String type;
	
	// 메서드 1개 선언
	void output() {
		System.out.println(name + " 색상은 " + color + "이고, " + type + "이며, " + "가격은 " + price+ "원이다");
	}
}
