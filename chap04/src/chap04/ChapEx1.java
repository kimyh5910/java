package chap04;

class Printer {
	int numOfPapers = 0;
	
	void print(int amount) {
		numOfPapers = numOfPapers - amount;
		System.out.println(amount + "�� ����Ʈ �߽��ϴ�.");
		System.out.println(numOfPapers + "�� ���ҽ��ϴ�.");
	}
}

class Printer2 {
	private int numOfPapers = 0; // ĸ��ȭ�� ����
	
	public Printer2(int paper) { // �Ű����� 1���� ������
		numOfPapers = paper;
	}
	
	public String getNumOfPapers() {
		String result = "";
		
		if (numOfPapers > 0) {
			result = "����" + numOfPapers + "�� �����ֽ��ϴ�.";
		}
		else {
			result = "������ �����ϴ�.";
		}
		return result;
	}
	
	void print(int amount) {
		if(numOfPapers > 0) {
			if (numOfPapers > amount) {
				numOfPapers = numOfPapers - amount;
				System.out.println(amount + "�� ����߽��ϴ�. ����" + numOfPapers + "�� ���� �ֽ��ϴ�.");
			}
			else {
				int missPapers = amount - numOfPapers;
				System.out.println("��� ����Ϸ��� ������ " + missPapers + "�� �����մϴ�." + numOfPapers + "�常 ����մϴ�.");
				numOfPapers = 0;
			}
		}
		else {
			System.out.println("������ �����ϴ�.");
		}
	}
}



public class ChapEx1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = new Printer(); // PrinterŬ������ ��ü ����
		p1.numOfPapers = 100;
		p1.print(70);
		
		System.out.println("-------------");
		
		Printer2 p2 = new Printer2(10);
		p2.print(2);
		p2.print(20);
		p2.print(10);
		System.out.println(p2.getNumOfPapers());
	}
}
