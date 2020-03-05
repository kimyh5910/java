package chap04;

class Printer {
	int numOfPapers = 0;
	
	void print(int amount) {
		numOfPapers = numOfPapers - amount;
		System.out.println(amount + "장 프린트 했습니다.");
		System.out.println(numOfPapers + "장 남았습니다.");
	}
}

class Printer2 {
	private int numOfPapers = 0; // 캡슐화로 숨김
	
	public Printer2(int paper) { // 매개변수 1객인 생성자
		numOfPapers = paper;
	}
	
	public String getNumOfPapers() {
		String result = "";
		
		if (numOfPapers > 0) {
			result = "현재" + numOfPapers + "장 남아있습니다.";
		}
		else {
			result = "용지가 없습니다.";
		}
		return result;
	}
	
	void print(int amount) {
		if(numOfPapers > 0) {
			if (numOfPapers > amount) {
				numOfPapers = numOfPapers - amount;
				System.out.println(amount + "장 출력했습니다. 현재" + numOfPapers + "장 남아 있습니다.");
			}
			else {
				int missPapers = amount - numOfPapers;
				System.out.println("모두 출력하려면 용지가 " + missPapers + "장 부족합니다." + numOfPapers + "장만 출력합니다.");
				numOfPapers = 0;
			}
		}
		else {
			System.out.println("용지가 없습니다.");
		}
	}
}



public class ChapEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer(); // Printer클래스로 객체 생성
		p1.numOfPapers = 100;
		p1.print(70);
		
		System.out.println("-------------");
		
		Printer2 p2 = new Printer2(10);
		p2.print(2);
		p2.print(20);
		p2.print(10);
		System.out.println(p2.getNumOfPapers());
	}
}
