package chap10;

public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String, Integer> e1 = new Entry<String, Integer>("�輱��",20);
		Entry<String, String> e2 = new Entry<String, String>("��Ÿ","���");
		
		// Entry<int,String> e3 = new Entry<int,String>(30,"�ƹ���");
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e1.getKey() + " " + e2.getValue());
	}

}
