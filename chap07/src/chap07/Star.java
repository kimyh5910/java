package chap07;

public class Star {
	public static void main(String[] args) {
		
		Marine m = new Marine("����", 100);
//		m.move();
		m.run();
		m.stop();
		m.attack();
		
		Tank t = new Tank("������ũ", 300);
//		t.move();
		t.drive();
		t.stop();
		t.attack();
		
		// Wraith Ŭ������ �߻� Ŭ������ Unit�� ��ӹ޾����� �߻� �޼����� move()�� �������� �ʾұ� ������ �߻� Ŭ������ ����Ǿ� ��ü�� ������ �� ����
//		Wraith w = new Wraith("���̾�", 200);
//		w.move();
//		w.fly();
//		w.stop();
//		w.attack();
	}
}
