package chap11;

import java.util.ArrayList; // List�� �Ϲ������� ����ϴ� ����
import java.util.Arrays;
import java.util.List; // List �ڷ����� ����ϱ� ���ؼ� �߰�

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names1 = {"�罿", "ȣ����", "�ٴ�ǥ��", "��"}; // ���ڿ� �迭 ���� �� ������
		
		List<String> list = Arrays.asList(names1); // �迭 List Ÿ������ ��ȯ�Ͽ� ����
		list.set(1, "�޹���"); // set()�� ����Ͽ� ������ ����
		
		for (String s : list) {
			System.out.println(s + "\t");
		}
		
		System.out.println();
		
		// ����Ʈ�� ������ �ִ� ������ ����
		list.sort((x,y) -> x.length() - y.length());
		
		// ����Ʈ�� �迭 �������� �����Ͽ� �迭�� ����
		// ����Ʈ�� ũ�Ⱑ �������̱� ������ �迭�� ��ȯ �� ���ο� �迭�� �����Ͽ� �����ؾ� ��
		String[] names2 = list.toArray(new String[list.size()]); 
		
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i] + "\t");
			
		}
		
		System.out.println("--------���� ��-----------");
		
		List<String> list1 = new ArrayList<String>(); // �� ArrayList ����
		System.out.println(list1.size());
		
		list1.add("ȫ�浿");
		list1.add("���");
		list1.add("�̼���");
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.remove(0); // list1�� ������ �� 0�� index�� �����͸� ����
		
		System.out.println("--------���� ��-----------");
		
		for (String s : list1) {
			System.out.println(s);
		}
		
		list1.set(0, "����"); // list1�� ������ �� 0�� index�� �����͸� ����
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.size());
	}

}
