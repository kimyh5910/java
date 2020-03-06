package chap06.other;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator(10,3);
		cal.sum();
		cal.sub();
		cal.multi();
		cal.div();
		
		System.out.println("------------------");
		
		Calculator2 cal2 = new Calculator2(10,3);
		cal2.sum();
		cal2.sub();
		cal2.multi();
		cal2.div();

	}


}





// 문제 1) Calculator 클래스를 생성하고, 멤버 변수 int타입 num1, num2 선언, 멤버 메서드 sum, sub, multi, div 선언
// 각 메서드를 사용하여 입력된 2개의 숫자를 연산하는 프로그램을 작성하세요
// 생성자를 통해서 숫자 2개를 입력받음
// 2개의 멤버 변수를 변경할 수 있는 getter, setter 생성

// 문제2) 문제 1의 Calculator 클래스를 수정한 형태의 클래스 Calculator2를 최종 생성하세요
// 클래스 Numbers는 멤버변수 num1, num2,를 가지고 있음
// 클래스 Cal1는  멤버 메서드 sum을 가지고 있음 / 클래스 Number을 상속받음
// 클래스 Cal2는  멤버 메서드 sub을 가지고 있음 / 클래스 Cal1을 상속받음
// 클래스 Cal3는  멤버 메서드 multi을 가지고 있음 / 클래스 Cal2을 상속받음
// 클래스 Calculator2는  멤버 메서드 div을 가지고 있음 / 클래스 Cal3을 상속받음
// 문제 1번처럼 실행하기