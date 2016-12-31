package utility;

import java.util.AbstractMap.SimpleEntry;

/** Pairs of Keys and Values that print as "(k,v)".
 * @author Gary T. Leavens
 */
public class Pair<K,V> extends SimpleEntry<K, V> {

	public Pair(K key, V val) {
		super(key, val);
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "(" + getKey().toString() + "," 
			       + getValue().toString() + ")";
	}
}
