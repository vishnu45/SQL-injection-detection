package tests;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import utility.Squeezer;

import AST.*;

/**
 * JUnit (3) tests for unparse and prettyPrint attributes. 
 * The expected results are in the .php -prettyprint files. 
 * These files were made by running phpPrettyPrinter on the
 * corresponding .php file and then hand checking the results.
 */
public class UnparseTests extends PHPTestCase {

	public UnparseTests(String s) {
		super(s);
	}
	
	/** The number of syntax test files in testsrc. */
	private static final int NUMTESTS = 3;

	public void testUnparse() {
		for (int i = 1; i <= NUMTESTS; i++) {
			compareUnparse("examples/ae" + i + ".php", 
					"examples/ae" + i + ".php-prettyprint");
		}
	}

	public void testPrettyPrint() {
		for (int i = 1; i <= NUMTESTS; i++) {
			comparePrettyPrint("examples/ae" + i + ".php", 
					"examples/ae" + i + ".php-prettyprint");
		}
	}

	/** Read the given file name into the returned string. */
	public String file2String(String fileName) throws IOException {
		File f = new File(fileName);
		long flen = f.length();
		byte[] bytes = new byte[(int) flen];
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(f));
		bis.read(bytes);
		bis.close();
		return new String(bytes);
	}

	/** Compare the unparse of the sourceFile with the contents of the expectedFile. */
	protected void compareUnparse(String sourceFile, String expectedFile) {
		try {
			Program p = parseFromFile(sourceFile);
			String unparsedp = Squeezer.squeeze(p.unparse());
			String expectedString = Squeezer.squeeze(file2String(expectedFile));
			if (!unparsedp.equals(expectedString)) {
				fail("differences between " + sourceFile + "(" + unparsedp
						+ ") and " + expectedFile + "(" + expectedString + ")");
			}
		} catch (Throwable t) {
			fail(t.getMessage());
			throw new Error("This should not happen");
		}
	}
	
	/** Compare the prettyPrint of the sourceFile with the contents of the expectedFile. */
	protected void comparePrettyPrint(String sourceFile, String expectedFile) {
		try {
			Program p = parseFromFile(sourceFile);
			String prettyp = Squeezer.unixnls(p.prettyPrint());
			String expectedString = Squeezer.unixnls(file2String(expectedFile));
			if (!prettyp.equals(expectedString)) {
				fail("differences between " + sourceFile + "(" + prettyp
						+ ") and " + expectedFile + "(" + expectedString + ")");
			}
		} catch (Throwable t) {
			fail(t.getMessage());
			throw new Error("This should not happen");
		}
	}


	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(tests.UnparseTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(UnparseTests.class);
		} else {
			junit.swingui.TestRunner.run(UnparseTests.class);
		}
	}

}
