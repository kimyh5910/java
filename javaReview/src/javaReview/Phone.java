package javaReview;

public class Phone {
	String Phone = "";
	public Phone(String Phone) {
		this.Phone = Phone;
	}
	
	// 전화 통화 실행 순서
	// 전원 켜기, 전화걸기, 통화 시작, 통화 종료, 전화받기, 통화 시작, 통화 끊기, 전원 끄기
	
	
	String turnOn; // 켜기
	String turnOff; // 끄기
	
	String hangUp; // 끊기
	String callStart; // 시작
	String callStop; // 종료
	
	
	public void dialing() {
		System.out.println("전화 걸기");
	}
	
	public void hangUp() {
		System.out.println("전화 끊기");
	}
	
	public void turnOn() {
		System.out.println("전원 켜기");
	}
	
	public void turnOff() {
		System.out.println("전원 끄기");
	}
	
	public void callStart() {
		System.out.println("통화 시작");
	}
	
	public void callStop() {
		System.out.println("통화 종료");
	}
	
}

