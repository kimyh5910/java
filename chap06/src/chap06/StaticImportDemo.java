package chap06;

//static �޼����� sort()�� ����ϱ� ���ؼ� ���� import ���
import static java.util.Arrays.sort;

import java.util.Arrays;
// �Ϲ� import�� �̿��Ͽ� Calendar Ŭ���� ���
import java.util.Calendar;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3, 5, 1, 7};
		
//		Arrays.sort(data); // �⺻ ��� ���
		sort(data); // static �޼����� sort()�� ���� import�� �ε��Ͽ� ���
		
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();

	}

}
