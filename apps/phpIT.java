package apps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import AST.*;

/** Application to run the Initial Taint Analysis. */
public class phpIT extends AbstractphpCompiler {
	/** Print the Taint Analysis outputs for the given program*/
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		ITPrint(stmt);
	}
	
	/**ITPrint procedure prints the ITEntry and ITExit at each label for the given program*/
	public void ITPrint(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				System.out.println("\nLabel : ["+ (((WhileS)stmt1).getLabeledExpr()).getLabelAST()+"]");
				Set<Map.Entry> insEntry = ((WhileS) stmt1).getLabeledExpr().ITentry();
				System.out.print("\t ITEntry : [");
				Iterator iter = insEntry.iterator();
				while (iter.hasNext()) {
				    System.out.print(iter.next());
				    if (iter.hasNext()){
				    	System.out.print(", ");
				    }
				}
				System.out.println("]");
				Set<Map.Entry> insExit = ((WhileS) stmt1).getLabeledExpr().ITexit();
				System.out.print("\t ITExit  : [");
				iter = insExit.iterator();
				while (iter.hasNext()) {
				    System.out.print(iter.next());
				    if (iter.hasNext()){
				    	System.out.print(", ");
				    }
				}
				System.out.println("]");
				ITPrint((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					System.out.println("\nLabel : ["+ (((IfS)stmt1).getLabeledExpr()).getLabelAST()+"]");
					Set<Map.Entry> insEntry = ((IfS) stmt1).getLabeledExpr().ITentry();
					System.out.print("\t ITEntry : [");
					Iterator iter = insEntry.iterator();
					while (iter.hasNext()) {
					    System.out.print(iter.next());
					    if (iter.hasNext()){
					    	System.out.print(", ");
					    }
					}
					System.out.println("]");
					Set<Map.Entry> insExit = ((IfS) stmt1).getLabeledExpr().ITexit();
					System.out.print("\t ITExit  : [");
					iter = insExit.iterator();
					while (iter.hasNext()) {
					    System.out.print(iter.next());
					    if (iter.hasNext()){
					    	System.out.print(", ");
					    }
					}
					System.out.println("]");
					ITPrint((CompoundS)((IfS)stmt1).getS1());
					ITPrint((CompoundS)((IfS)stmt1).getS2());
				}
				else{
					if (stmt1 instanceof AssignS){
						System.out.println("\nLabel : "+ ((AssignS)stmt1).labels());
						System.out.println("\t ITEntry : "+ ((AssignS)stmt1).ITentry());
						System.out.println("\t ITExit  : "+ ((AssignS)stmt1).ITexit());
					}
					else{
						if (stmt1 instanceof EchoS){
							System.out.println("\nLabel : "+ ((EchoS)stmt1).labels());
							System.out.println("\t ITEntry : "+ ((EchoS)stmt1).ITentry());
							System.out.println("\t ITExit  : "+ ((EchoS)stmt1).ITexit());
						}
						else {
							System.out.println("\nLabel : "+ ((RequireS)stmt1).labels());
							System.out.println("\t ITEntry : "+ ((RequireS)stmt1).ITentry());
							System.out.println("\t ITExit  : "+ ((RequireS)stmt1).ITexit());
						}
					}	
				}
			}
		}
	}

	
	/** IT Analysis for the program given in the file name argument. */
	public static void main(String args[]) {
		phpIT up = new phpIT();
		up.run("phpIT", args);
	}
}
