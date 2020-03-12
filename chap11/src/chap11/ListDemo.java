package chap11;

import java.util.ArrayList; // List를 일반적으로 사용하는 형태
import java.util.Arrays;
import java.util.List; // List 자료형을 사용하기 위해서 추가

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names1 = {"사슴", "호랑이", "바다표범", "곰"}; // 문자열 배열 선언 및 데이터
		
		List<String> list = Arrays.asList(names1); // 배열 List 타입으로 변환하여 저장
		list.set(1, "앵무새"); // set()을 사용하여 데이터 변경
		
		for (String s : list) {
			System.out.println(s + "\t");
		}
		
		System.out.println();
		
		// 리스트가 가지고 있는 데이터 정렬
		list.sort((x,y) -> x.length() - y.length());
		
		// 리스트를 배열 형식으로 변경하여 배열에 저장
		// 리스트의 크기가 유동적이기 때문에 배열로 변환 시 새로운 배열을 생성하여 저장해야 함
		String[] names2 = list.toArray(new String[list.size()]); 
		
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i] + "\t");
			
		}
		
		System.out.println("--------삭제 후-----------");
		
		List<String> list1 = new ArrayList<String>(); // 빈 ArrayList 선언
		System.out.println(list1.size());
		
		list1.add("홍길동");
		list1.add("김삿갓");
		list1.add("이순신");
		System.out.println(list1.size());
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list1.remove(0); // list1의 데이터 중 0번 index의 데이터를 삭제
		
		System.out.println("--------수정 후-----------");
		
		for (String s : list1) {
			System.out.println(s);
		}
		
		list1.set(0, "수지"); // list1의 데이터 중 0번 index의 데이터를 수정
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.size());
	}

}
