package chap06;

//static 메서드인 sort()를 사용하기 위해서 정적 import 사용
import static java.util.Arrays.sort;

import java.util.Arrays;
// 일반 import를 이용하여 Calendar 클래스 사용
import java.util.Calendar;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3, 5, 1, 7};
		
//		Arrays.sort(data); // 기본 사용 방법
		sort(data); // static 메서드인 sort()를 정적 import로 로드하여 사용
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();

	}

}
