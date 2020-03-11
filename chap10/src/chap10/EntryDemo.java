package chap10;

public class EntryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entry<String, Integer> e1 = new Entry<String, Integer>("김선달",20);
		Entry<String, String> e2 = new Entry<String, String>("기타","등등");
		
		// Entry<int,String> e3 = new Entry<int,String>(30,"아무개");
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e1.getKey() + " " + e2.getValue());
	}

}
