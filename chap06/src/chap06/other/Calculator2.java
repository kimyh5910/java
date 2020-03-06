package chap06.other;

public class Calculator2 extends Cal3 {
	public Calculator2(int num1, int num2) {
		super(num1, num2);
	}
	
	public void div() {
		System.out.println(num1 / num2);
	}
}
