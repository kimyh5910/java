package chap10;

import java.util.StringTokenizer;

public class TokenPrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "of the people, by the people, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s,",");
		
		// while(true) 사용 시 무한 루프로 동작함
		// 예외 발생의 원인 : st가 가지고 있는 문자는 총 9개인데 while문이 무한 루프로 실행되고 있어서 모든 문자열을 출력하고 난 후 더이상 출력할 것이 없는데요 st.nextToken()이 실행되어 오류가 발생함
		while(true) { 
			try {
				token = st.nextToken(); // 다음 문자열을 출력
				System.out.println(token);
			}
			catch(Exception e) {
				break;
			}
			System.out.println(token);
		}
	}

}
