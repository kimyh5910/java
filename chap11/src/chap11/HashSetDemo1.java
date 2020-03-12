package chap11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] frutis = {"���", "�ٳ���", "����", "����"};
		// List�� ����� ������ �ڷᱸ��, index�� ����, �ߺ� �����͸� �㰡���� ����
		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();
		
		// �迭 fruits�� ������ �ִ� ��� ��Ҹ� Set Ÿ���� ��ü h1�� ��� ����
		for (String s : frutis)
			h1.add(s);
		
		System.out.println("1�ܰ� : " + h1);
		h1.add("�ٳ���"); // Set Ÿ���� ��ü h1�� ���ڿ� '�ٳ���' �߰� // Set Ÿ���� �ߺ� �����͸� ������� ����
		h1.remove("����"); // h1�� ������ �ִ� ���ڿ� �߿��� '����'����
		h1.add(null); // h1�� null�� �߰� // �ݷ��ǿ��� add() �޼���� �����͸� �߰��ϴ� ��ɾ� // ���� �ڿ� �߰��ϴ� ����
		
		System.out.println("2�ܰ� : " + h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("����"));
		
		List<String> list = Arrays.asList(frutis); // �迭�� List Ÿ������ ��ȯ
		h2.addAll(list);
		System.out.println("3�ܰ� : " + h2);
		h2.clear();
		System.out.println(h2.isEmpty());
	}

}
