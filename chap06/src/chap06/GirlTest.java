package chap06;

public class GirlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Girl[] girls = {
				new Girl("������"),
				new GoodGirl("����"),
				new BestGirl("Ȳ����"),
		};
		
		for (Girl g : girls) {
			g.show();
		}
//		Girl g1 = new Girl(); // Ŭ���� Girl�� ��ü�� ����
//		Girl g2 = new GoodGirl(); // �θ� Ŭ���� Girl�� ��ü�� ����ϰ� �ڽ� Ŭ���� GoodGirl�� ��ü�� ���� // �θ� Ŭ���� Ÿ������ ����Ǳ� ������ Girl Ŭ������ ���� ����� ��� ����
//		GoodGirl gg = new BestGirl(); // �θ� Ŭ���� GoodGirl�� ��ü�� ������ �����ϰ�, �����ڸ� �ڽ�Ŭ���� BestGirl�� �����ڸ� ����Ͽ� ��ü�� ���� / �θ� Ŭ���� Ÿ���� GoodGirl�� ����� ����� ������
//		
//		g2. show(); // Girl Ŭ������ show() �޼��尡 �����Ƿ� Girl Ŭ���� Ÿ�� g2�� show()�޼��带 ����� �� ����
//		gg.show(); // BestGirl Ŭ�������� show() �޼��带 ��ӹ޾� �������̵��Ͽ� ��� / BestGirl Ŭ������ ��� �޼��� show()�� �����
//	}
//
}
}

