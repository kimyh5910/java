package chap06;

public class PolymorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new SportsCar();
		
//		for (Vehicle v : vehicles) {
//			v.whoami(); // 메서드 오버라이딩을 통하여 하나의 메서드로 여러개의 메서드를 실행한 효과를 가짐
//		}
		
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].whoami(); // 실제 싱행은 whoami()라는 메서드를 실행하지만 결과물은 다르게 출력됨
		}

	}

}

class SportsCar extends Car {
	void whoami() {
		System.out.println("나는 스포츠 자동차이다.");
	}
}