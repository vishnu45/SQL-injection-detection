package apps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import AST.*;

/** Application to run the Taint Location Analysis */
public class phpTL extends AbstractphpCompiler {
	/** Print the TL Analysis for the given program*/
	
	public static int cnt=0;  //cnt is used to print 4 entries on a line
	
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		TLPrint(stmt);
	}
	
	/**TLPrint procedure prints the TLEntry and TLExit for each label of the given program */
	public void TLPrint(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				System.out.println("\nLabel : ["+ (((WhileS)stmt1).getLabeledExpr()).getLabelAST()+"]");
				System.out.print("\t TLEntry : {");
				PrintEntryExit(((WhileS) stmt1).getLabeledExpr().TLentry());
				System.out.println("}");
				System.out.print("\t TLExit  : {");
				PrintEntryExit(((WhileS) stmt1).getLabeledExpr().TLexit());
				System.out.println("}");
				TLPrint((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					System.out.println("\nLabel : ["+ (((IfS)stmt1).getLabeledExpr()).getLabelAST()+"]");
					System.out.print("\t TLEntry : {");
					PrintEntryExit(((IfS) stmt1).getLabeledExpr().TLentry());
					System.out.println("}");
					System.out.print("\t TLExit  : {");
					PrintEntryExit(((IfS) stmt1).getLabeledExpr().TLexit());
					System.out.println("}");
					TLPrint((CompoundS)((IfS)stmt1).getS1());
					TLPrint((CompoundS)((IfS)stmt1).getS2());
				}
				else{
					if (stmt1 instanceof AssignS){
						System.out.println("\nLabel : "+ ((AssignS)stmt1).labels());
						System.out.print("\t TLEntry : {");
						PrintEntryExit(((AssignS)stmt1).TLentry());
						System.out.println("}");
						System.out.print("\t TLExit  : {");
						PrintEntryExit(((AssignS)stmt1).TLexit());
						System.out.println("}");
					}
					else{
						if (stmt1 instanceof EchoS){
							System.out.println("\nLabel : "+ ((EchoS)stmt1).labels());
							System.out.print("\t TLEntry : {");
							PrintEntryExit(((EchoS)stmt1).TLentry());
							System.out.println("}");
							System.out.print("\t TLExit  : {");
							PrintEntryExit(((EchoS)stmt1).TLexit());
							System.out.println("}");
						}
						else {
							System.out.println("\nLabel : "+ ((RequireS)stmt1).labels());
							System.out.print("\t TLEntry : {");
							PrintEntryExit(((RequireS)stmt1).TLentry());
							System.out.println("}");
							System.out.print("\t TLExit  : {");
							PrintEntryExit(((RequireS)stmt1).TLexit());
							System.out.println("}");
						}
					}	
				}
			}
		}
	}
	
	/*Procedure to print 5 entries on a line for Entry and Exit*/
	public static void  PrintEntryExit(Set<Map.Entry> EntryExit){
		cnt = 0;
		Iterator n = EntryExit.iterator();	
	    while(n.hasNext()) {
	         Map.Entry me = (Map.Entry)n.next();
	         System.out.print("("+me.getKey()+","+me.getValue()+")");
	         if (n.hasNext()){
			    	System.out.print(", ");
			    }
	         cnt = cnt+1;
	         if ((cnt%4 ==0) && (n.hasNext())){
	        	 System.out.print("\n\t            ");
	         }         
	    }		
	}

	
	/** Get the Taint Location Analysis of the program given in the file name argument. */
	public static void main(String args[]) {
		phpTL up = new phpTL();
		up.run("phpTL", args);
	}
}
