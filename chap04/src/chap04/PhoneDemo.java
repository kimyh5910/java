package chap04;

// 서브 클래스, 메인 클래스인 PhoneDemo를 실행하기 위해서 필요한 클래스
class Phone {
	String model; // 모델명을 저장할 멤버 변수
	int value; // 가격을 저장할 멤버 변수
	
	// void는 없다, 비었다는 의미이며, 여기서는 반환값이 없음을 뜻함
	void print() {
		System.out.println(value + "만 원짜리 " + model + " 스마트폰");
	}
}

// 메인 클래스
// 클래스의 중 메인으로 동작할 클래스에만 접근제한자를 public으로 사용
// 클래스는 설계도이기 때문에 실행 시 필요한 () 부분이 없음
public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone(); // 클래스 Phone을 new 키워드를 통해서 인스턴스화함
		myPhone.model = "아이폰 XS"; // model 이라는 멤버 변수를 가지고 있음
		myPhone.value = 100; // value 라는 멤버 변수를 가지고 있음
		myPhone.print(); // print() 멤버 메서드를 가지고 있음
		// 인스턴스화한 객체의 멤버에 접근하려면 '객체명.멤버' 형식을 사용해야함
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
		

	}
}