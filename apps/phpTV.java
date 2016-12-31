package apps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import AST.*;

/** Application to run the Taint Variable Analysis. */
public class phpTV extends AbstractphpCompiler {
	/** Print the TV Analysis for the given program*/
	
	public static int cnt=0;  //cnt is used to print 4 entries on a line
	
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		TVPrint(stmt);
	}
	
	/**TVPrint procedure prints the TVEntry and TVExit at each label for the Program*/
	public void TVPrint(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				System.out.println("\nLabel : ["+ (((WhileS)stmt1).getLabeledExpr()).getLabelAST()+"]");
				System.out.print("\t TVEntry : {");
				PrintEntryExit(((WhileS) stmt1).getLabeledExpr().TVentry());
				System.out.println("}");
				System.out.print("\t TVExit  : {");
				PrintEntryExit(((WhileS) stmt1).getLabeledExpr().TVexit());
				System.out.println("}");
				TVPrint((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					System.out.println("\nLabel : ["+ (((IfS)stmt1).getLabeledExpr()).getLabelAST()+"]");
					System.out.print("\t TVEntry : {");
					PrintEntryExit(((IfS) stmt1).getLabeledExpr().TVentry());
					System.out.println("}");
					System.out.print("\t TVExit  : {");
					PrintEntryExit(((IfS) stmt1).getLabeledExpr().TVexit());
					System.out.println("}");
					TVPrint((CompoundS)((IfS)stmt1).getS1());
					TVPrint((CompoundS)((IfS)stmt1).getS2());
				}
				else{
					if (stmt1 instanceof AssignS){
						System.out.println("\nLabel : "+ ((AssignS)stmt1).labels());
						System.out.print("\t TVEntry : {");
						PrintEntryExit(((AssignS)stmt1).TVentry());
						System.out.println("}");
						System.out.print("\t TVExit  : {");
						PrintEntryExit(((AssignS)stmt1).TVexit());
						System.out.println("}");
					}
					else{
						if (stmt1 instanceof EchoS){
							System.out.println("\nLabel : "+ ((EchoS)stmt1).labels());
							System.out.print("\t TVEntry : {");
							PrintEntryExit(((EchoS)stmt1).TVentry());
							System.out.println("}");
							System.out.print("\t TVExit  : {");
							PrintEntryExit(((EchoS)stmt1).TVexit());
							System.out.println("}");
						}
						else {
							System.out.println("\nLabel : "+ ((RequireS)stmt1).labels());
							System.out.print("\t TVEntry : {");
							PrintEntryExit(((RequireS)stmt1).TVentry());
							System.out.println("}");
							System.out.print("\t TVExit  : {");
							PrintEntryExit(((RequireS)stmt1).TVexit());
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

	
	/** TV Analysis for the program given in the file name argument. */
	public static void main(String args[]) {
		phpTV up = new phpTV();
		up.run("phpTV", args);
	}
}
