package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Queue�� �������̽��̸� �̸� LinkedList�� ��ӹ޾� ����
		// 
		Queue<String> q = new LinkedList<String>();

		
		System.out.println(q.poll());
		q.offer("���"); // ������ �߰�
		System.out.println("�ٳ����� �߰��߳���?" + q.offer("�ٳ���")); // ������ �߰�
		
		try {
			q.add("ü��"); // ����ó���� �ʿ���
		}
		catch (IllegalStateException e) {
			
		}
		System.out.println("��� ������ : " + q.peek()); // ���� ������ ����� ���븸 Ȯ��
		
		String head = null;
		
		try {
			head = q.remove(); // ���� ó���� �ʿ���
			System.out.println(head + "�����ϱ�");
			System.out.println("���ο� ��� : " + q.element());
		}
		catch (NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "�����ϱ�");
		System.out.println("���ο� ��� : " + q.peek());
		
		
		System.out.println("ü���� �����ϰ� �ֳ���?" + q.contains("ü��"));
		System.out.println("����� �����ϰ� �ֳ���?" + q.contains("���"));
	}

}
