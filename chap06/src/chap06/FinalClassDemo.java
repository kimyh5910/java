package chap06;

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best b = new Best();
	}

}

class Good {
	
}

class Better extends Good {
	
}

final class Best extends Better {
	
}

// Best 클래스는 final 키워드를 사용하여 상속을 할 수 없도록 막았기 때문에 오류 발생
//class NumberOne extends Best {
//	
//}