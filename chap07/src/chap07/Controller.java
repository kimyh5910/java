package chap07;

public abstract class Controller {
	boolean power; // boolean Å¸ÀÔÀº true È¤Àº falseÀÇ °ªÀ» °¡Áü
	
	void show() {
		if (power == true) {
			System.out.println(getName() + "ÄÑÁü");
		}
		else {
			System.out.println(getName() + "²¨Áü");
		}
	}
	
	abstract String getName();
}
