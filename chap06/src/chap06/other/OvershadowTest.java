package chap06.other;

public class OvershadowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}
