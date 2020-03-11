package chap10;

// ���׸� Ŭ������ ����, 2���� �����͸� �ްڴٰ� ����
public class Entry<K,V> {
	private K key; // ��� ���� 2�� ����
	private V value;
	
	// �Ű� ������ 2�� �޾ƿ��� ������ ����
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

