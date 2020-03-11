package chap07;

// 2개의 인터페이스를 하나의 통합된 인터페이스를 작성하세요. = 하나의 인터페이스에 2개의 기존 인터페이스를 상속받아 사용하세요
// 인터페이스에서 인터페이스를 상속받을 경우 extends 키워드 사용, 다중 상속 가능
public interface Delicious extends Edible, Sweetable {

}
