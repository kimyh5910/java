package chap11;

import java.util.ArrayList;
import java.util.List;

public class chap11test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("���ű�");
		list.add("����");
		list.add("�ٶ���");
		list.add("��");
		
		for (String s : list) {
			if(s.length() == 2) {
				System.out.println(s);
			}
		}
	}

}
