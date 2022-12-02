package sec04.exam02_generic_method;

public class Util {
	// 제네릭 메서드
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()) ;
		boolean valueCompare = p1.getValue().equals(p2.getValue());
	    return keyCompare && valueCompare; // true && true = true;
	    // && <-- false 하나만 있어도 false가 된다.
	    // || <-- true 하나만 있어도 true가 된다.
	}
}
// Pair<K,V> : 멀티 제너릭 타입