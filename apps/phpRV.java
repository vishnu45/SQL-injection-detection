package apps;
import java.util.Iterator;
import java.util.Set;

import AST.*;

/** Application to run the Read Variables. */
public class phpRV extends AbstractphpCompiler {
	/** Print the Read Variables of the given Program */
	public void process(String fname, Program p) {
		Set<String> ret  = p.getS().RV();
		Iterator iter = ret.iterator();
		while (iter.hasNext()) {
		    System.out.print(iter.next()+" ");
		}	
	}
	
	/** Get the Read Variables of  the program given in the file name argument. */
	public static void main(String args[]) {
		phpRV up = new phpRV();
		up.run("phpRV", args);
	}
}
