package chap11;

import java.util.Map;
import java.util.Scanner;
import java.util.Hashtable;

public class chap11test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Hashtable<String,Integer>();
		map.put("�迭��", 80);
		map.put("�ְ��", 90);
		map.put("����", 95);
		map.put("���ڹ�", 88);
		
		Scanner in = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String id = in.nextLine();
		
		// Map �������̽����� containsKey()�� �ش� Map ��ü�� ������ key�� �ִ��� �˻�
		if (map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {
			System.out.println("����ڰ� �˻����� �ʽ��ϴ�.");
		}
	}

}
