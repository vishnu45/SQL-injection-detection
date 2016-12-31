package utility;

/** A utility class that can squeeze out excess white space in strings, 
 * making them easier to compare. */
public class Squeezer {
	/** Result is a string that is just like the argument, 
	 * but with all successive white space characters converted to a single blank character. */
	public static String squeeze(String s) {
		s = s.replaceAll("[ \t\n\r\f]+", " ");
		return s.replaceAll("[ \t\n\r\f\000]+\\z", "");
	}
	
	/** Result is the same as the argument string, but with all \r chars removed. */
	public static String unixnls(String s) {
		return s.replaceAll("[\r]+", "");
	}
}