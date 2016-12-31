package tests;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import utility.Pair;
import utility.SetRepUtility;

import beaver.Parser.Exception;
import AST.*;

/**
 * JUnit (3) tests for the RD analysis (RDentry and RDexit attributes). 
 * For the tests using the file examples/rd1.wh, 
 * see rd1.wh-prettyprint for what the labels are.
 */
public class RDTests extends PHPTestCase {

	public void testRDentry1() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Set<Map.Entry> rde1 = stmt1.RDentry();
		assertEquals(2, rde1.size());
		assertTrue(rde1.contains(new Pair<String, Label>("$x", new NumLabel("?"))));
		assertTrue(rde1.contains(new Pair<String, Label>("$y", new NumLabel("?"))));
	}
	
	public void testkillRD1() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Set<Map.Entry> k1 = stmt1.killRD();
		assertEquals(6, k1.size());
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("?"))));
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("1"))));
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("2"))));
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("3"))));
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("4"))));
		assertTrue(k1.contains(new Pair<String,Label>("$x", new NumLabel("5"))));
	}
	
	public void testgenRD1() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Set<Map.Entry> g1 = stmt1.genRD();
		assertEquals(1, g1.size());
		assertTrue(g1.contains(new Pair<String,Label>("$x", new NumLabel("1"))));
	}

	public void testkillgenRD11() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt1 = (AssignS)((CompoundS)p.getS()).getSList(0);
		Set<Map.Entry> ret1 = SetRepUtility.emptySet();
		ret1.addAll(stmt1.RDentry());
		Set<Map.Entry> k1 = stmt1.killRD();
		ret1.removeAll(k1);
		Set<Map.Entry> g1 = stmt1.genRD();
		ret1.addAll(g1);
		
		Set<Map.Entry> ret2 = SetRepUtility.emptySet();
		ret2.addAll(stmt1.RDentry());
		ret2.removeAll(stmt1.killRD());
		ret2.addAll(stmt1.genRD());
		assertEquals(ret1, ret2);
		assertEquals(2, ret1.size());
		assertTrue(ret1.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(ret1.contains(new Pair<String, Label>("$y", new NumLabel("?"))));
	}
		
	public void testRD12() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		AssignS stmt2 = (AssignS)((CompoundS)p.getS()).getSList(1);
		Set<Map.Entry> rdent2 = stmt2.RDentry();
		assertEquals(2, rdent2.size());
		assertTrue(rdent2.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdent2.contains(new Pair<String, Label>("$y", new NumLabel("?"))));
		Set<Map.Entry> rdex2 = stmt2.RDexit();
		assertEquals(2, rdex2.size());
		assertTrue(rdex2.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdex2.contains(new Pair<String, Label>("$y", new NumLabel("2"))));
	}

	public void testRD23() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		IfS iif = (IfS)((CompoundS)p.getS()).getSList(2);
		EchoS stmt3 = (EchoS)((CompoundS)iif.getS1()).getSList(0);
		Set<Map.Entry> rdent3 = stmt3.RDentry();
		assertEquals(2, rdent3.size());
		assertTrue(rdent3.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdent3.contains(new Pair<String, Label>("$y", new NumLabel("2"))));
		Set<Map.Entry> rdex3 = stmt3.RDexit();
		assertEquals(2, rdex3.size());
		assertTrue(rdex3.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdex3.contains(new Pair<String, Label>("$y", new NumLabel("2"))));
	}

	public void testRD24() throws IOException, Exception {
		Program p = parseFromFile("examples/ae2.php");
		assertTrue(p.getS() instanceof CompoundS);
		IfS iif = (IfS)((CompoundS)p.getS()).getSList(2);
		EchoS stmt4 = (EchoS)((CompoundS)iif.getS2()).getSList(0);
		Set<Map.Entry> rdent4 = stmt4.RDentry();
		assertEquals(2, rdent4.size());
		assertTrue(rdent4.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdent4.contains(new Pair<String, Label>("$y", new NumLabel("2"))));
		Set<Map.Entry> rdex4 = stmt4.RDexit();
		assertEquals(2, rdex4.size());
		assertTrue(rdex4.contains(new Pair<String, Label>("$x", new NumLabel("1"))));
		assertTrue(rdex4.contains(new Pair<String, Label>("$y", new NumLabel("2"))));
	}

	public RDTests(String s) {
		super(s);
	}
	
	public static junit.framework.Test suite() {
		return new junit.framework.TestSuite(RDTests.class);
	}

	public static void main(String args[]) {
		if (args.length == 1 && args[0].equals("-text")) {
			junit.textui.TestRunner.run(RDTests.class);
		} else {
			junit.swingui.TestRunner.run(RDTests.class);
		}
	}
}
