package chap11;

import java.util.Map;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		
		// Map�� �������̽� Ÿ��
		// Map�� ��ӹ޾� �����ϴ� Ŭ���� HashMap
		Map<String, String> dic = new HashMap<String, String>();
			dic.put("head", "�밡����");
			dic.put("teacher", "��");
			dic.put("cat", "������");
			dic.put("aunt", "������");
			dic.put("needle", "����");
			dic.put("child", "���");
			
			// for ~ each ���� ���ؼ� ��� ������ ���
			for (String key : dic.keySet())
				System.out.printf("%s=%s ", key,dic.get(key));
	}

}
