package chap11;

import java.util.Map;
import java.util.Scanner;
import java.util.Hashtable;

public class chap11test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Hashtable<String,Integer>();
		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String id = in.nextLine();
		
		// Map 인터페이스에서 containsKey()는 해당 Map 객체에 지정한 key가 있는지 검색
		if (map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("사용자가 검색되지 않습니다.");
		}
	}

}
