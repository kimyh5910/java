package chap10;

import java.util.Arrays;

public class EnglishScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnglishScore[] ea = {new EnglishScore("���", 77), new EnglishScore("�念��", 88), new EnglishScore("ȫ�浿", 9)};
		
		System.out.println("���� �ְ� ���� : " + findBest(ea).toString());
	}
	
	public static EnglishScore findBest(EnglishScore[]a) {
		EnglishScore best = a[0]; // ������ �ʱ�ȭ
//		EnglishScore best = null;
		
		Arrays.sort(a);
		
		best = a[a.length -1];
		
		return best;
	}

}
