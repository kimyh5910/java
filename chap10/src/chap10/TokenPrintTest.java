package chap10;

import java.util.StringTokenizer;

public class TokenPrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "of the people, by the people, for the people";
		String token;
		
		StringTokenizer st = new StringTokenizer(s,",");
		
		// while(true) ��� �� ���� ������ ������
		// ���� �߻��� ���� : st�� ������ �ִ� ���ڴ� �� 9���ε� while���� ���� ������ ����ǰ� �־ ��� ���ڿ��� ����ϰ� �� �� ���̻� ����� ���� ���µ��� st.nextToken()�� ����Ǿ� ������ �߻���
		while(true) { 
			try {
				token = st.nextToken(); // ���� ���ڿ��� ���
				System.out.println(token);
			}
			catch(Exception e) {
				break;
			}
			System.out.println(token);
		}
	}

}
