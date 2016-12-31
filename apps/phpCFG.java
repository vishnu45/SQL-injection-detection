package apps;
import java.util.Iterator;
import java.util.Set;

import AST.*;

/** Application to run the Control Flow Graph. */
public class phpCFG extends AbstractphpCompiler {
	/** Print the Inflows and Outflows for each label of the given program*/
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		printflows(stmt);
	}
	
	public void printflows(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				System.out.println("\nLabel : ["+ (((WhileS)stmt1).getLabeledExpr()).getLabelAST()+"]");
				Set<Label> ins = ((WhileS) stmt1).getLabeledExpr().inFlows();
				System.out.print("\t inflows  : [");
				Iterator iter = ins.iterator();
				while (iter.hasNext()) {
				    System.out.print(iter.next());
				    if (iter.hasNext()){
				    	System.out.print(", ");
				    }
				}
				System.out.println("]");
				System.out.println("\t outflows : "+stmt1.outFlows());
				printflows((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					System.out.println("\nLabel : ["+ (((IfS)stmt1).getLabeledExpr()).getLabelAST()+"]");
					System.out.println("\t inflows  : "+stmt1.inFlows());
					Set<Label> ins = ((IfS) stmt1).getLabeledExpr().outFlows();
					System.out.print("\t outflows : [");
					Iterator iter = ins.iterator();
					while (iter.hasNext()) {
					    System.out.print(iter.next());
					    if (iter.hasNext()){
					    	System.out.print(", ");
					    }
					}
					System.out.println("]");
					printflows((CompoundS)((IfS)stmt1).getS1());
					printflows((CompoundS)((IfS)stmt1).getS2());		
				}
				else{
					System.out.println("\nLabel : "+ stmt1.labels());
					System.out.println("\t inflows  : "+stmt1.inFlows());
					System.out.println("\t outflows : "+stmt1.outFlows());
				}
			}
		}
	}

	/** Get the Control Flow Graph of  the program given in the file name argument. */
	public static void main(String args[]) {
		phpCFG up = new phpCFG();
		up.run("phpCFG", args);
	}
}
