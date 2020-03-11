package chap10;

// 제네릭 클래스로 선언, 2개의 데이터를 받겠다고 선언
public class Entry<K,V> {
	private K key; // 멤버 변수 2개 선언
	private V value;
	
	// 매개 변수를 2개 받아오는 생성자 선언
	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
}

