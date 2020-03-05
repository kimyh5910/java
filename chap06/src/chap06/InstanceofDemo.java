package chap06;

public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(); // �ڽ� Ŭ���� Ÿ������ ��ü ����
		Person p = new Person(); // �θ� Ŭ���� Ÿ������ ��ü ����
		
		System.out.println(s instanceof Person); // ��ü s�� �θ� Ŭ���� Person�� ���ϱ� ������ Person�� ��ü��� �� �� ���� // �ڵ� Ÿ�� ��ȯ ����
		System.out.println(s instanceof Student); // ��ü s�� Student Ŭ������ ��ü
		System.out.println(p instanceof Student); // ��ü p�� �ڽ� Ŭ������ Student�� ��ü�� �� �� ����
//		System.out.println(s instanceof String); // ��ü s�� String Ŭ������ ������ Ŭ������ ������� ��ü�� �ƴϱ� ������ ���� �߻�
		
		downcast(s);
	}
	
	// �Ű������� ���� ��üs�� �ڵ� Ÿ�� ��ȯ��
	static void downcast(Person p) {
		if (p instanceof Student) {
			Student s = (Student)p; // ���� Ÿ�� ��ȯ
			System.out.println("OK, ���� Ÿ�� ��ȯ");
		}
	}

}
