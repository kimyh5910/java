package chap01;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입 변환 : 서로 다른 데이터 타입을 연산하기 위해서 동일한 데이터 타입으로 데이터 타입을 변환하는 것
		// byte -> int 형으로 변환
		// float -> double 형으로 변환
		// int -> double 형으로 변환

		// 자동 타입 변환 : 서로 다른 데이터 타입을 연산 시 더 큰 데이터 타입으로 자동으로 변환하여 연산을 진행하는 것
		double d1 = 5 * 3.14; // int 타입 5와 double 타입 3.14를 연산하면 자동 타입 변환이 발생하여 5.0 * 3.14 로 연산됨
		double d2 = 1; // int 타입 1을 double형 변수 d2에 저장 시 자동 타입 변환이 발생되어 1.0이 d2에 저장됨

		// 강제 타입 변환 : 서로 다른 데이터 타입을 연산 시 특정한 데이터 타입으로 사용자가 직접 데이터 타입 변환을 실행 하는 것
		// 사용법
		// (변환할 데이터 타입)데이터값;
//		float f = (float)3.14; // float형 변수 f에 double형 데이커 값 3.14를 저장할 수 없으므로(float)를 사용하여 강제적으로 데이터값을 float형으로 변환시켜 저장
//		byte b = (byte)300; // byte 형 변수 b에 int형 데이터값 300을 저장할 수 없으므로 (byte)를 사용하여 강제적으로 데이터 값을 byte형으로 변환시켜 저장함
//		byte x = (byte)3.14; // byte 형 변수 x에 double형 데이터값 3.14를 저장할 수 없으므로 (byte)를 사용하여 강제적으로 데이터 값을 byte으로 변환하여 저장함
//		double d = (double)3.14f; // double 형 변수 d에 float형 데이터값을 double형으로 변환하여 저장함

		byte by = 100;
		System.out.println("byte 타입 변수 by 의 값 : " + by);
		int inta = by; // 자동 타입 변환
		System.out.println("int 타입 변수 inta 의 값 : " + inta);

		inta = 130;
		System.out.println("int 타입 변수 inta 의 값 : " + inta);
		by = (byte) 130; // 강제 타입 변환
		System.out.println("byte 타입 변수 by 의 값 : " + by);

		System.out.println("--------------------------------");

		int intb = 100;
		System.out.println("int 타입 변수 inta 의 값 : " + intb);
		double dbb = intb; // 자동 타입 변환
		System.out.println("double 타입 변수 dbb 의 값 : " + dbb);
		intb = (int) dbb; // 오류 발생, 강제 타입 변환이 필요함
		System.out.println("int 타입 변수 inta 의 값 : " + intb);
		intb = (int) 3.14; // 강제 타입 변환, 소수점 자리의 데이터가 삭제 됨
		System.out.println("int 타입 변수 inta 의 값 : " + intb);

		System.out.println("--------------------------------");

		int i;
		double d;
		byte b;

		i = 7 / 4; // 정수 끼리의 연산이므로 소수점 자리는 표시하지 않음, 소수점 이하는 저장하지 않음
		System.out.println(i);
		d = 7 / 4; // 정수끼리의 연산이므로 결과가 1임, double 타입의 변수에 저장되어 자동 타입 변환이 실행 됨
		System.out.println(d);
		d = 7 / (double) 4; // int타입과 double 타입의 연산으로 int 타입이 자동 타입 젼환이 실행되어 double타입의 값 7.0 / double 타입의 값
							// 4.0이 되어 결과값이 1.75가 출력
		System.out.println(d);

		i = 300; // int 타입 변수 i에 값 300 저장
		// 300은 byte 타입의 최소값 -128과 최대값 127 사이에 있지 않으므로 byte형으로 형 변환 불가
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다");
		} else {
			b = (byte) i;
		}
	}
}
