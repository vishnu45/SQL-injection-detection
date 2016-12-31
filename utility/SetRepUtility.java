package utility;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/** This class knows about the representation chosen for sets. */
public class SetRepUtility {

		/** Return a new singleton set. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set singleton(Object o) { 
			HashSet h = new HashSet();
			h.add(o);
			return h; 
		}
		
		/** Return a new empty set */
		@SuppressWarnings("rawtypes")
		public static Set emptySet() { return new HashSet(); }
		
		/** Form the set of Map.Entry pairs that is the cross product of the given key with the set of values. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> crossWith(Object key, Set vals) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = vals.iterator();
		    while (i.hasNext()) {
			   ret.add(new Pair(key, i.next()));
			}
		    return ret;
		}
		
		/** Form the set of Map.Entry pairs that is the cross product of keys with the given value. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> crossWith(Set keys, Object val) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = keys.iterator();
		    while (i.hasNext()) {
			   ret.add(new Pair(i.next(), val));
			}
		    return ret;
		}
		
		/** Form the set of Map.Entry pairs that is the cross product of keys and vals. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> cross(Set keys, Set vals) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = keys.iterator();
		    while (i.hasNext()) {
			   ret.addAll(SetRepUtility.crossWith(i.next(), vals));
			}
		    return ret;
		}

		public interface Fun<L,T> {
			T run(L x);
		}
		
		/** Map a computation over a set to produce another set. 
		 * @param <L> the element type of args
		 * @param <T> the type of the result
		 * @param f the function to apply
		 * @param args the set of arguments to which f is applied. */
		public static <T, L> Set<T> map(Fun<L,T> f, Set<L> args) {
			Set<T> ret = new HashSet<T>();
			for (L e : args) {
				ret.add(f.run(e));
			}
			return ret;
		}
		
		/** Intersect all sets in a set of sets. */
		public static <T> Set<T> intersect(Set<Set<T>> sets) {
			Set<T> ret = new HashSet<T>();
			boolean started = false;
			for (Set<T> s : sets) {
				if (!started) {
					ret.addAll(s);
					started = true;
				} else {
					ret.retainAll(s);
				}
			}
			return ret;
		}
}
