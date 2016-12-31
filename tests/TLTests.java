package tests;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import utility.Pair;
import utility.SetRepUtility;

import beaver.Parser.Exception;
import AST.*;

/**
 * JUnit (3) tests for the RD analysis (TLentry and TLexit attributes). 
 * For the tests using the file examples/rd1.wh, 
 * see rd1.wh-prettyprint for what the labels are.
 */
public class TLTests extends PHPTestCase {

	public void testTLentry1() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		RequireS stmt1 = (RequireS)((CompoundS)p.getS()).getSList(0);
		Set<Map.Entry> tlen1 = stmt1.TLentry();
		assertEquals(14, tlen1.size());
		assertTrue(tlen1.contains(new Pair<String, Label>("$result", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$password", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$andcondition", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$selectquery", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$updatequery", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$numrows", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$conn", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$username", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$updateresult", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$loginfailquery", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$updatestmt", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$wherecondition", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$selectstmt", new NumLabel("?"))));
		assertTrue(tlen1.contains(new Pair<String, Label>("$loginresult", new NumLabel("?"))));
	}
	
	public void testTLentry2() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<Map.Entry> tlen2 = stmt2.TLentry();
		assertEquals(14, tlen2.size());
		assertTrue(tlen2.contains(new Pair<String, Label>("$result", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$password", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$andcondition", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$selectquery", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$updatequery", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$numrows", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$conn", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$username", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$updateresult", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$loginfailquery", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$updatestmt", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$wherecondition", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$selectstmt", new NumLabel("?"))));
		assertTrue(tlen2.contains(new Pair<String, Label>("$loginresult", new NumLabel("?"))));
	}
	
	public void testkillTL2() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<Map.Entry> k2 = stmt2.killTL();
		assertEquals(18, k2.size());
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("?"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("1"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("2"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("3"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("4"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("5"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("6"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("7"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("8"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("9"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("10"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("11"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("12"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("13"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("14"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("15"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("16"))));
		assertTrue(k2.contains(new Pair<String, Label>("$username", new NumLabel("17"))));
	}
	
	public void testgenTL1() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<Map.Entry> g2 = stmt2.genRD();
		assertEquals(1, g2.size());
		assertTrue(g2.contains(new Pair<String,Label>("$username", new NumLabel("2"))));
	}
	
	public void testTLexit2() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<Map.Entry> tlex2 = stmt2.TLexit();
		assertEquals(14, tlex2.size());
		assertTrue(tlex2.contains(new Pair<String, Label>("$result", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$password", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$andcondition", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$selectquery", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$updatequery", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$numrows", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$conn", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$username", new NumLabel("2"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$updateresult", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$loginfailquery", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$updatestmt", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$wherecondition", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$selectstmt", new NumLabel("?"))));
		assertTrue(tlex2.contains(new Pair<String, Label>("$loginresult", new NumLabel("?"))));
	}
	
	public void testTLentry7() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt7 = (AssignS)((CompoundS)p.getS()).getSList(6);
		Set<Map.Entry> tlen7 = stmt7.TLentry();
		assertEquals(14, tlen7.size());
		assertTrue(tlen7.contains(new Pair<String, Label>("$result", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$password", new NumLabel("3"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$andcondition", new NumLabel("5"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$selectquery", new NumLabel("6"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$updatequery", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$numrows", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$conn", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$username", new NumLabel("2"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$updateresult", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$loginfailquery", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$updatestmt", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$wherecondition", new NumLabel("?"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$selectstmt", new NumLabel("4"))));
		assertTrue(tlen7.contains(new Pair<String, Label>("$loginresult", new NumLabel("?"))));
	}
	
	public void testkillTL7() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt7 = (AssignS)((CompoundS)p.getS()).getSList(6);
		Set<Map.Entry> k7 = stmt7.killTL();
		assertEquals(18, k7.size());
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("?"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("1"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("2"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("3"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("4"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("5"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("6"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("7"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("8"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("9"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("10"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("11"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("12"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("13"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("14"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("15"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("16"))));
		assertTrue(k7.contains(new Pair<String, Label>("$result", new NumLabel("17"))));
	}
	
	public void testgenTL7() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt7 = (AssignS)((CompoundS)p.getS()).getSList(6);
		Set<Map.Entry> g7 = stmt7.genTL();
		assertEquals(1, g7.size());
		assertTrue(g7.contains(new Pair<String,Label>("$result", new NumLabel("7"))));
	}
	
	public void testTLexit7() throws IOException, Exception {
		Program p = parseFromFile("examples/ae10.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt7 = (AssignS)((CompoundS)p.getS()).getSList(6);
		Set<Map.Entry> tlex7 = stmt7.TLexit();
		assertEquals(14, tlex7.size());
		assertTrue(tlex7.contains(new Pair<String, Label>("$result", new NumLabel("7"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$password", new NumLabel("3"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$andcondition", new NumLabel("5"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$selectquery", new NumLabel("6"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$updatequery", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$numrows", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$conn", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$username", new NumLabel("2"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$updateresult", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$loginfailquery", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$updatestmt", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$wherecondition", new NumLabel("?"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$selectstmt", new NumLabel("4"))));
		assertTrue(tlex7.contains(new Pair<String, Label>("$loginresult", new NumLabel("?"))));
	}

	public TLTests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(TLTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(TLTests.class);
		} else {
			junit.swingui.TestRunner.run(TLTests.class);
		}
	}
}
