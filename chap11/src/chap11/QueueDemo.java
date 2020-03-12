package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Queue는 인터페이스이며 이를 LinkedList가 상속받아 구현
		// 
		Queue<String> q = new LinkedList<String>();

		
		System.out.println(q.poll());
		q.offer("사과"); // 데이터 추가
		System.out.println("바나나를 추가했나요?" + q.offer("바나나")); // 데이터 추가
		
		try {
			q.add("체리"); // 예외처리가 필요함
		}
		catch (IllegalStateException e) {
			
		}
		System.out.println("헤드 엿보기 : " + q.peek()); // 가장 마지막 요소의 내용만 확인
		
		String head = null;
		
		try {
			head = q.remove(); // 예외 처리가 필요함
			System.out.println(head + "제거하기");
			System.out.println("새로운 헤드 : " + q.element());
		}
		catch (NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "제거하기");
		System.out.println("새로운 헤드 : " + q.peek());
		
		
		System.out.println("체리를 포함하고 있나요?" + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요?" + q.contains("사과"));
	}

}
