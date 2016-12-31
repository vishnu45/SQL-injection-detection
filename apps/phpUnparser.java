package apps;
import AST.*;

/** Application to run the unparser. */
public class phpUnparser extends AbstractphpCompiler {
	/** Unparse the given program to System.out. */
	public void process(String fname, Program p) {
		System.out.println(p.unparse());
	}

	/** Unparse the program given in the file name argument. */
	public static void main(String args[]) {
		phpUnparser up = new phpUnparser();
		up.run("phpUnparser", args);
	}
}
