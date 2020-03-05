package javaReview;

public class review04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 : 일종의 프로그램 설계도, 멤버 변수와 멤버 메서드를 가지고 있는 참조 타입, 특정 기능을 수행하기 위해서 필요한 변수와 특정 기능을 수행하는 메서드를 하나의 이름으로 묶어서 모다둔 것
		
		// 클래스를 new 키워드를 이용해 인스턴스화하여 객체로 생성함
		Cal cal = new Cal();
		int sum = cal.sum(10, 20); // Cal 클래스의 sum 함수를 실행, 반환값을 sum에 저장
		System.out.println(sum); // 저장된 값을 출력
		
		// Television 클래스를 인스턴스화하여 객체로 생성
		Television tv1 = new Television("702호");
		// Television 클래스를 객체로 만들었기 때문에 Television 클래스의 멤버 변수와 멤버 메서드를 사용할 수 있음
		
		tv1.powerOn();
		tv1.channelUp();
		tv1.channelUp();
		tv1.volumeUp();
		tv1.volumeUp();
		tv1.powerOff();
		
		Television tv2 = new Television("604호");
		tv2.powerOn();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.volumeUp();
		tv2.channelUp();
		tv2.powerOff();
		
		Phone ph1 = new Phone("폰1");
		ph1.turnOn();
		ph1.dialing();
		ph1.callStart();
		ph1.callStop();
		
		
		
		Phone ph2 = new Phone("폰2");
	
	}

	// 아래와 같이 필요한 메서드를 만들어서 사용하는 것이 기존의 절차지향 방식
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int multi(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	
}

class Cal {
		public  int sum(int a, int b) {
			return a + b;
		}
		
		public  int sub(int a, int b) {
			return a - b;
		}
		
		public  int multi(int a, int b) {
			return a * b;
		}
		
		public  int div(int a, int b) {
			return a / b;
		}
	}