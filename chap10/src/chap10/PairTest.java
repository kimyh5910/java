package chap10;

public class PairTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer> p1 = new Pair<>(10,20);
		Pair<Double> p2 = new Pair<>(10.0, 20.0);
		
		System.out.println(p1.first());
		System.out.println(p2.second());
	}

}
