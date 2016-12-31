package utility;

public class PPUtility {
	
	/** The number of spaces per nesting level. */
	public static final int spacesPerIndent = 4;
	
	/** Return an appropriate number of spaces for the given nesting level. */
	public static String spacesForIndent(int level) {
		StringBuffer s = new StringBuffer();
		for (int i = level; i > 0; i--) {
			for (int j = 1; j <= spacesPerIndent; j++) { s.append(' '); }
		}
		return s.toString();
	}
}
