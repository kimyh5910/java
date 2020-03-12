package chap11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s1 = new Stack<String>();
		
		System.out.println("스택의 크기 : " + s1.size());
		
		s1.push("사과");
		s1.push("바나나");
		s1.push("복숭아");
		
		System.out.println("스택의 크기 : " + s1.size());
		
		System.out.println("peek() 로 확인 : " + s1.peek()); // 스택 자료구조에서 가장 마지막 위치의 데이터를 확인
		
		System.out.println("스택의 크기 : " + s1.size());
		
		System.out.println(s1.pop()); // 스택 자료구조에서 가장 마지막 위치의 데이터를 꺼내옴
		System.out.println("스택의 크기 : " + s1.size());
		System.out.println(s1.pop());
		System.out.println("스택의 크기 : " + s1.size());
		System.out.println(s1.pop());
		System.out.println("스택의 크기 : " + s1.size());
		
		System.out.println();
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		// 스택도 add() 사용 가능 / 콜렉션 인터페이스를 상속받아서 사용
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
