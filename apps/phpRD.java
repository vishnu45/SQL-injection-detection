package apps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import AST.*;

/** Application to run the Reaching Definition Analysis */
public class phpRD extends AbstractphpCompiler {
	/** Print the RDEntry and RDExit for each label of the given program*/
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		RDPrint(stmt);
	}
		
	public void RDPrint(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				System.out.println("\nLabel : ["+ (((WhileS)stmt1).getLabeledExpr()).getLabelAST()+"]");
				Set<Map.Entry> insEntry = ((WhileS) stmt1).getLabeledExpr().RDentry();
				System.out.print("\t RDEntry : [");
				Iterator iter = insEntry.iterator();
				while (iter.hasNext()) {
				    System.out.print(iter.next());
				    if (iter.hasNext()){
				    	System.out.print(", ");
				    }
				}
				System.out.println("]");
				Set<Map.Entry> insExit = ((WhileS) stmt1).getLabeledExpr().RDexit();
				System.out.print("\t RDExit  : [");
				iter = insExit.iterator();
				while (iter.hasNext()) {
				    System.out.print(iter.next());
				    if (iter.hasNext()){
				    	System.out.print(", ");
				    }
				}
				System.out.println("]");
				RDPrint((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					System.out.println("\nLabel : ["+ (((IfS)stmt1).getLabeledExpr()).getLabelAST()+"]");
					Set<Map.Entry> insEntry = ((IfS) stmt1).getLabeledExpr().RDentry();
					System.out.print("\t RDEntry : [");
					Iterator iter = insEntry.iterator();
					while (iter.hasNext()) {
					    System.out.print(iter.next());
					    if (iter.hasNext()){
					    	System.out.print(", ");
					    }
					}
					System.out.println("]");
					Set<Map.Entry> insExit = ((IfS) stmt1).getLabeledExpr().RDexit();
					System.out.print("\t RDExit  : [");
					iter = insExit.iterator();
					while (iter.hasNext()) {
					    System.out.print(iter.next());
					    if (iter.hasNext()){
					    	System.out.print(", ");
					    }
					}
					System.out.println("]");
					RDPrint((CompoundS)((IfS)stmt1).getS1());
					RDPrint((CompoundS)((IfS)stmt1).getS2());
				}
				else{
					if (stmt1 instanceof AssignS){
						System.out.println("\nLabel : "+ ((AssignS)stmt1).labels());
						System.out.println("\t RDEntry : "+ ((AssignS)stmt1).RDentry());
						System.out.println("\t RDExit  : "+ ((AssignS)stmt1).RDexit());
					}
					else{
						if (stmt1 instanceof EchoS){
							System.out.println("\nLabel : "+ ((EchoS)stmt1).labels());
							System.out.println("\t RDEntry : "+ ((EchoS)stmt1).RDentry());
							System.out.println("\t RDExit  : "+ ((EchoS)stmt1).RDexit());
						}
						else {
							System.out.println("\nLabel : "+ ((RequireS)stmt1).labels());
							System.out.println("\t RDEntry : "+ ((RequireS)stmt1).RDentry());
							System.out.println("\t RDExit  : "+ ((RequireS)stmt1).RDexit());
						}
					}	
				}
			}
		}
	}

	
	/** Get the Reaching Definition Analysis of the program given in the file name argument. */
	public static void main(String args[]) {
		phpRD up = new phpRD();
		up.run("phpRD", args);
	}
}
