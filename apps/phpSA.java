package apps;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import utility.Pair;
import utility.SetRepUtility;
import AST.*;

/** Application to print the label for the Possible Injection Attack and  
 * path through which the Variable received the tainted values. */

public class phpSA extends AbstractphpCompiler {
	
	Object TV;              //TV holds the tainted variable in the mysqli_query expression 
	
	public void process(String fname, Program p) {
		CompoundS stmt = ((CompoundS)p.getS());
		SAPrint(stmt);
	}
	
	/*SAPrint procedure identify the label at which SQL Injection Attack may occur*/
	public void SAPrint(CompoundS tempStmt){
		CompoundS stmt = tempStmt;
		int len = stmt.getNumSList();
		for (int i=0;i<len;i++){
			S stmt1 = stmt.getSList(i);
			if (stmt1 instanceof WhileS){
				SAPrint((CompoundS)((WhileS)stmt1).getS());
			}
			else{
				if (stmt1 instanceof IfS){
					SAPrint((CompoundS)((IfS)stmt1).getS1());
					SAPrint((CompoundS)((IfS)stmt1).getS2());
				}
				else{
					if (stmt1 instanceof AssignS){
						taintActual(stmt1);
					}
				}
				//EchoS and RequireS does not cause tainting.
			}
		}
	}
	
	public void taintActual(S stmt1){
		Expr e = ((AssignS) stmt1).getExpr();
		if (e instanceof SqlExpr){
			Set<String> fvset = SetRepUtility.emptySet(); //store Free Variables of Expression
		    fvset.addAll(e.FV());
		    Set<Map.Entry> tlset = SetRepUtility.emptySet(); // getting Tainted Variables Location at the Entry of Block
		    tlset.addAll(((AssignS) stmt1).TLentry());
		    
		    Set<Map.Entry> tvset = SetRepUtility.emptySet(); // getting Tainted Variables at the Entry of Block
		    tvset.addAll(((AssignS) stmt1).TVentry());
		    Iterator n = tvset.iterator(); 
		    
		    while(n.hasNext()) {
		         Map.Entry me = (Map.Entry)n.next();
		         if (fvset.contains(me.getKey())){
		        	 TV=me.getKey();
		        	 System.out.println("\nWarning !!! Possible SQL Injection Attack");
		        	 System.out.println("At Label : "+ ((AssignS)stmt1).labels() +", with Tainted Variable : "+me.getKey());
		        	 System.out.print("\nInjection Variable tracking path : ");
		        	 taintorigin(tvset, tlset, me.getKey());
		        	 System.out.println("\n");
		        	 break;  //since a variable might be tainted by multiple taint origins
		         }
		    }	
		}
		
	}
	
	/*Procedure to recursively print the injection path (Variable, Label)*/
	public void taintorigin(Set<Map.Entry> tvset, Set<Map.Entry> tlset, Object taint){
		Iterator n = tvset.iterator();
	    while(n.hasNext()) {	 
	         Map.Entry me = (Map.Entry)n.next();
	         if (taint.equals(me.getKey())){
	        	 if (taint.equals(TV)){
	 	      		System.out.print("\n    "+TV+" <--");
	 	      		Iterator l = tlset.iterator();
		     	    while(l.hasNext()) {
		     	    	Map.Entry le = (Map.Entry)l.next();
		     	    	if (le.getKey().equals(me.getKey())){
		     	    		System.out.print("["+le.getValue()+"]");
		     	    	}	     	    	 
		     	     }	
	 	      	 } 
	        	 System.out.print("-- " + me.getValue());
	        	         	 
	        	 Iterator l = tlset.iterator();
	     	     while(l.hasNext()) {
	     	    	Map.Entry le = (Map.Entry)l.next();
	     	    	if (le.getKey().equals(me.getValue())){
	     	    		System.out.print(" <--["+le.getValue()+"]");
	     	    	}	     	    	 
	     	     }	
	     	    taintorigin(tvset, tlset, me.getValue());
	         }
	    }
	}

	
	/** SQL Injection Attack Analysis for the program given in the file name argument. */
	public static void main(String args[]) {
		phpSA up = new phpSA();
		up.run("phpSA", args);
	}
}
