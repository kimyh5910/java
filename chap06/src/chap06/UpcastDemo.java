package chap06;

public class UpcastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Student s = new Student();
		
		p.name = "ȫ�浿";
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("--------------------------");
		
//		Student s2;
//		Person p2 = new Person();
//		s2 = p2; // ���� �߻� / �θ� Ŭ������ �ڽ� Ŭ������ ��ȯ�� �Ұ�����
		
		
		
		System.out.println("--------------------------");
		
		s.name = "�Ӳ���";
		s.number = 1;
		System.out.println(s.name);
		System.out.println(s.number);
		s.whoami();
		s.work();
		
		System.out.println("--------------------------");
		
// 		Person Ŭ������ ��ü ������ Student Ŭ������ ��ü�� �����Ͽ� Person Ŭ���� Ÿ������ �ڵ� Ÿ�� ��ȯ �� 
//		Student Ŭ������ Person Ŭ������ ��ӹް� �ֱ� ������ Ÿ�� ��ȯ�� ������
		p = s;
//		p.number = 1; // Person Ŭ������ ������ �ִ� ����� ����� ������
//		p.work(); // Person Ŭ������ ������ �ִ� ����� ����� ������
		System.out.println(p.name);
		p.whoami();
		
		System.out.println("--------------------------");
		
		// ��ü�� ���� Ÿ�� ��ȯ�� �ڽ� Ŭ���� Ÿ������ ������ ��ü�� �θ� Ŭ���� Ÿ������ �����ߴٰ� �ٽ� �ڽ� Ŭ���� Ÿ������ ���� Ÿ�� ��ȯ�ϴ� ���� ������
		// ��� ���� Ÿ�� ��ȯ�� �������
		Student s1;
		s1 = (Student)p;
		System.out.println(s.name);
		System.out.println(s.number); // �θ� Ÿ���̾��� ��� ��� ���ߴ� �κ��� �ٽ� ��� ����
		s.whoami();
		s.work(); // �θ� Ÿ���̾��� ��� ��� ���ߴ� �κ��� �ٽ� ��� ����
		
	}

}
