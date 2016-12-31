package apps;
import java.util.Iterator;
import java.util.Set;

import AST.*;

/** Application to run the Free Variables */
public class phpFV extends AbstractphpCompiler {
	/**Print the Free Variable of the given program */
	public void process(String fname, Program p) {
		Set<String> ret  = p.getS().FV();
		Iterator iter = ret.iterator();
		while (iter.hasNext()) {
		    System.out.print(iter.next()+" ");
		}	
	}
	
	/** Get Free Variables of the program given in the file name argument. */
	public static void main(String args[]) {
		phpFV up = new phpFV();
		up.run("phpFV", args);
	}
}
