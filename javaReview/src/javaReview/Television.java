package javaReview;

public class Television {
	// 상태값을 저장하기 위한 클래스 멤버 변수
	// 멤버 변수는 변수이기 때문에 선언과 동시에 값을 할당할 수 있음
	// 클래스에서 메서드의 실행은 불가능함
	// 실행은 반드시 메서드 내에서 실행해야 함
	// 클래스는 혼자서 실행이 불가능하기 때문에 반드시 인스턴스화하여 객체로 생성 후 실행해야 함
	String name = "";
	boolean power; 
	int channel;
	int volume; 
	private int maxChannel = 100;
	private int minVolume = 0;
	private int maxVolume = 30;
	
	// powerOn(); // 클래스는 혼자서 동작이 불가능
	
	// Television 클래스의 생성자
	// 생성자는 기본적으로 해당 클래스의 멤버 변수를 초기화하는데 사용함
	public Television(String name) {
		this.name = name; // 매개변수로 받은 값을 클래스 멤버 변수 name에 저장
	}
	
	public void powerOn() {
		System.out.println(name + "전원이 켜졌습니다.");
	}
	
	public void powerOff() {
		System.out.println(name + "전원이 켜졌습니다.");
	}
	
	public void channelUp() {
		channel++;
		
		if(channel > maxChannel) {
			channel = 0;
		}
		System.out.println(name + "채널이" + channel + "으로 변경되었습니다.");
	}
	
	public void channelDown() {
		channel--;
		
		if(channel < 0) {
			channel = maxChannel;
		}
		System.out.println(name + "채널이" + channel + "으로 변경되었습니다.");
	}
	
	public void volumeUp() {
		volume++;
		
		if(volume > maxVolume) {
			volume = maxVolume;
		}
		System.out.println(name + "볼륨" + volume + "으로 변경되었습니다.");
	}
	
	public void volumeDown() {
		volume--;
		
		if(volume < minVolume) {
			volume = minVolume;
		}
		System.out.println(name + "볼륨" + volume + "으로 변경되었습니다.");
	}
}
