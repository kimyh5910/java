package chap11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] frutis = {"사과", "바나나", "포도", "수박"};
		// List와 비슷한 형태의 자료구조, index가 없음, 중복 데이터를 허가하지 않음
		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();
		
		// 배열 fruits가 가지고 있는 모든 요소를 Set 타입의 객체 h1에 모두 저장
		for (String s : frutis)
			h1.add(s);
		
		System.out.println("1단계 : " + h1);
		h1.add("바나나"); // Set 타입의 객체 h1에 문자열 '바나나' 추가 // Set 타입은 중복 데이터를 허용하지 않음
		h1.remove("포도"); // h1이 가지고 있는 문자열 중에서 '포도'삭제
		h1.add(null); // h1에 null을 추가 // 콜렉션에서 add() 메서드는 데이터를 추가하는 명령어 // 가장 뒤에 추가하는 형식
		
		System.out.println("2단계 : " + h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("수박"));
		
		List<String> list = Arrays.asList(frutis); // 배열을 List 타입으로 변환
		h2.addAll(list);
		System.out.println("3단계 : " + h2);
		h2.clear();
		System.out.println(h2.isEmpty());
	}

}
