package chap11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1 = new Stack<String>();
		
		System.out.println("������ ũ�� : " + s1.size());
		
		s1.push("���");
		s1.push("�ٳ���");
		s1.push("������");
		
		System.out.println("������ ũ�� : " + s1.size());
		
		System.out.println("peek() �� Ȯ�� : " + s1.peek()); // ���� �ڷᱸ������ ���� ������ ��ġ�� �����͸� Ȯ��
		
		System.out.println("������ ũ�� : " + s1.size());
		
		System.out.println(s1.pop()); // ���� �ڷᱸ������ ���� ������ ��ġ�� �����͸� ������
		System.out.println("������ ũ�� : " + s1.size());
		System.out.println(s1.pop());
		System.out.println("������ ũ�� : " + s1.size());
		System.out.println(s1.pop());
		System.out.println("������ ũ�� : " + s1.size());
		
		System.out.println();
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		// ���õ� add() ��� ���� / �ݷ��� �������̽��� ��ӹ޾Ƽ� ���
		s2.add(10);
		s2.add(20);
		s2.add(1, 100);
		
		for (int value : s2)
			System.out.print(value + " ");
		System.out.println();
		
		while (!s2.empty())
			System.out.print(s2.pop() + " ");
	}

}
