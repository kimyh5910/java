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





// ���� 1) Calculator Ŭ������ �����ϰ�, ��� ���� intŸ�� num1, num2 ����, ��� �޼��� sum, sub, multi, div ����
// �� �޼��带 ����Ͽ� �Էµ� 2���� ���ڸ� �����ϴ� ���α׷��� �ۼ��ϼ���
// �����ڸ� ���ؼ� ���� 2���� �Է¹���
// 2���� ��� ������ ������ �� �ִ� getter, setter ����

// ����2) ���� 1�� Calculator Ŭ������ ������ ������ Ŭ���� Calculator2�� ���� �����ϼ���
// Ŭ���� Numbers�� ������� num1, num2,�� ������ ����
// Ŭ���� Cal1��  ��� �޼��� sum�� ������ ���� / Ŭ���� Number�� ��ӹ���
// Ŭ���� Cal2��  ��� �޼��� sub�� ������ ���� / Ŭ���� Cal1�� ��ӹ���
// Ŭ���� Cal3��  ��� �޼��� multi�� ������ ���� / Ŭ���� Cal2�� ��ӹ���
// Ŭ���� Calculator2��  ��� �޼��� div�� ������ ���� / Ŭ���� Cal3�� ��ӹ���
// ���� 1��ó�� �����ϱ�