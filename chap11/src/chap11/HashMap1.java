package chap11;

import java.util.Map;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		// Map를 인터페이스 타입
		// Map를 상속받아 구현하는 클래스 HashMap
		Map<String, String> dic = new HashMap<String, String>();
			dic.put("head", "대가빠리");
			dic.put("teacher", "쌤");
			dic.put("cat", "꼬네이");
			dic.put("aunt", "아지매");
			dic.put("needle", "국시");
			dic.put("child", "얼라");
			
			// for ~ each 문을 통해서 모든 데이터 출력
			for (String key : dic.keySet())
				System.out.printf("%s=%s ", key,dic.get(key));
	}

}
