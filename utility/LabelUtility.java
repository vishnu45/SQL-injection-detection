package utility;

/** A utility class for generating unique labels. */
public class LabelUtility {
	/** The number of the next label to issue */
	private static int nextNum = 1;
	
	/** Return a string representing the next label. */
	public synchronized static String nextLabel() { 
		String ret = String.valueOf(nextNum);
		nextNum++; 
		return ret;
	}
	
	/** Re-initialize the counter so that labels start off at 1 again. */
	public synchronized static void reset() {
		nextNum = 1;
	}
}
