package chap06;

//import java.util.*; // java.util ��Ű���� �ִ� ��� Ŭ������ �� �ε���
import java.util.Scanner; // java.util.Scanner Ŭ������ �ε��ؼ� ���
import com.pack.test.*; // com.pack.test ��Ű���� ��� Ŭ������ �ε���

public class importDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		java.util.Scanner in = new java.util.Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		// java.lang ��Ű���� �⺻ ��Ű���ν� �ڵ� �ε� �Ǿ� �־ ������ ������
		java.lang.System.out.print("�̸��� �Է����ּ��� : ");
		String name = in.next();
		System.out.print(name);
		
		System.out.println("------------------");

		// �ڽ��� ��Ű���� �ִ� Calculator Ŭ������ ��ü�� ����
		Calculator cal1 = new Calculator();
		cal1.output();
		
		// �ٸ� ��Ű���� Calculator Ŭ������ �ҷ��ͼ� ��ü�� ����
		// �ٸ� ��Ű���� Ŭ���� �̸��� ������ ��� ��Ű�� ����� �� �Է�
		com.pack.test.Calculator cal2 = new com.pack.test.Calculator();
		cal2.output();
	}

}
