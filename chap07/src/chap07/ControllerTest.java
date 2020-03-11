package chap07;

public class ControllerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller[] c = { new TV5(false), new Radio5(true) };
		
		for (Controller con : c) {
			con.show();
		}
	}
}
