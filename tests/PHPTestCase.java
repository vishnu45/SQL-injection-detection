package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import beaver.Parser.Exception;

import AST.*;
import junit.framework.TestCase;

public abstract class PHPTestCase extends TestCase {

	public PHPTestCase(String s) {
		super(s);
	}

	/** Parse a string, returning the AST for the program. */
	protected static Program parse(String s) {
		try {
			phpParser parser = new phpParser();
			Reader reader = new StringReader(s);
			phpScanner scanner = new phpScanner(new BufferedReader(reader));
			Program p = (Program) parser.parse(scanner);
			reader.close();
			return p;
		} catch (Throwable t) {
			fail(t.getMessage());
			throw new Error("This should not happen");
		}
	}

	/** Parse a file, returning the AST for the program. */
	protected Program parseFromFile(String sourceFile) throws IOException, Exception {
		phpParser parser = new phpParser();
		Reader reader = new FileReader(sourceFile);
		phpScanner scanner = new phpScanner(new BufferedReader(reader));
		Program p = (Program) parser.parse(scanner);
		reader.close();
		return p;
	}
}
