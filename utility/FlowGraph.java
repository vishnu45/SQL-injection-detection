package utility;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/** A Map from labels to labels that can be used as a flow graph. 
 * @param <V>
 * @param <K>*/
public class FlowGraph<K, V> extends AbstractMap<K, V> implements Map<K, V> {
	
	/** The representation of this flowgraph. */
	private Map<K, V> map = new HashMap<K, V>();
	
	/** Initialize this object to be an empty flowgraph. */
	public FlowGraph() {
	}
	
	public FlowGraph(K k, V v) {
		map.put(k, v);
	}
	
	public Set<Map.Entry<K,V>> entrySet(){
		return map.entrySet();
	}
	
	@Override
	public V get(Object key) { return map.get(key); }
	
	/** Returns the converse of this map as a relation. */
	public Map<V,Set<K>> converse() { 
		Map<V, Set<K>>rev = new HashMap<V,Set<K>>();
		for (Map.Entry<K,V> kv : map.entrySet()) {
			V val = kv.getValue();
			if (rev.containsKey(val)) {
				Set<K> s = (Set<K>) rev.get(val);
				s.add(kv.getKey());
				rev.put(val,s);
			} else {
			   Set<K> s = new HashSet<K>();
			   s.add(kv.getKey());
			   rev.put(kv.getValue(), s);
			}
		}
		return rev;
	}
	
	/** Returns the set of keys that map to the given value. */
	public Set<K> whatMapsTo(V v) {
		Map<V,Set<K>> rev = converse();
		return rev.get(v);
	}
	
	public static <T> FlowGraph<T, T> crossWith(/*@ non_null @*/ Set<T> s, T e) {
		FlowGraph<T, T> ret = new FlowGraph<T, T>();
		Iterator<T> i = s.iterator();
	    while (i.hasNext()) {
		   ret.put(i.next(), e);
		}
	    return ret;
	}

}
