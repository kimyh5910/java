package chap06.other;

public class Cal1 extends Numbers {
	protected int sum;
	
	public Cal1(int num1, int num2) {
		super(num1,num2);
	}
	
	public void sum() {
		System.out.println(num1+num2);
	}
}
