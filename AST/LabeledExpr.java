/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.3 */
package AST;

import java.util.*;
import utility.SetRepUtility;
import utility.FlowGraph;
import java.util.Set;
import java.util.Map;
import utility.Pair;
import AST.*;
import utility.PPUtility;
/**
 * @ast node
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:23
 * @production LabeledExpr : {@link Expr} ::= <span class="component">LabelAST:{@link Label}</span> <span class="component">{@link Expr}</span>;

 */
public class LabeledExpr extends Expr implements Cloneable, Block {
  /**
   * @apilevel internal
   */
  public LabeledExpr clone() throws CloneNotSupportedException {
    LabeledExpr node = (LabeledExpr) super.clone();
    node.FV_visited = -1;
    node.killIT_visited = -1;
    node.genIT_visited = -1;
    node.prettyPrint_visited = -1;
    node.killRD_visited = -1;
    node.genRD_visited = -1;
    node.RV_visited = -1;
    node.killTL_visited = -1;
    node.genTL_visited = -1;
    node.killTV_visited = -1;
    node.genTV_visited = -1;
    node.unparse_visited = -1;
    node.ITentry_visited = -1;
    node.ITentry_computed = false;
    node.ITentry_initialized = false;
    node.ITentry_value = null;
    node.ITexit_visited = -1;
    node.ITexit_computed = false;
    node.ITexit_initialized = false;
    node.ITexit_value = null;
    node.RDentry_visited = -1;
    node.RDentry_computed = false;
    node.RDentry_initialized = false;
    node.RDentry_value = null;
    node.RDexit_visited = -1;
    node.RDexit_computed = false;
    node.RDexit_initialized = false;
    node.RDexit_value = null;
    node.TLentry_visited = -1;
    node.TLentry_computed = false;
    node.TLentry_initialized = false;
    node.TLentry_value = null;
    node.TLexit_visited = -1;
    node.TLexit_computed = false;
    node.TLexit_initialized = false;
    node.TLexit_value = null;
    node.TVentry_visited = -1;
    node.TVentry_computed = false;
    node.TVentry_initialized = false;
    node.TVentry_value = null;
    node.TVexit_visited = -1;
    node.TVexit_computed = false;
    node.TVexit_initialized = false;
    node.TVexit_value = null;
    node.inFlows_visited = -1;
    node.outFlows_visited = -1;
    node.progLabels_visited = -1;
    node.progReadVar_visited = -1;
    node.progInitLabel_visited = -1;
    node.progFV_visited = -1;
    node.progCFG_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public LabeledExpr copy() {
    try {
      LabeledExpr node = (LabeledExpr) clone();
      node.parent = null;
      if(children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  public LabeledExpr fullCopy() {
    LabeledExpr tree = (LabeledExpr) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.fullCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** Are these Blocks equal? 
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:70
   */
  public boolean equals(Object oth) {
  	    if (oth == null || !(oth instanceof Block)) { return false; }
 	    Block b = (Block) oth;
	    return toString().equals(b.toString());
        }
  /** Return the hash code for this Block. 
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:76
   */
  public int hashCode() {
	    return toString().hashCode();
	}
  /**
   */
  public LabeledExpr() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[2];
  }
  /**
   */
  public LabeledExpr(Label p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    FV_visited = -1;
    killIT_visited = -1;
    genIT_visited = -1;
    prettyPrint_visited = -1;
    killRD_visited = -1;
    genRD_visited = -1;
    RV_visited = -1;
    killTL_visited = -1;
    genTL_visited = -1;
    killTV_visited = -1;
    genTV_visited = -1;
    unparse_visited = -1;
    ITentry_visited = -1;
    ITentry_computed = false;
    ITentry_initialized = false;
    ITentry_value = null;
    ITexit_visited = -1;
    ITexit_computed = false;
    ITexit_initialized = false;
    ITexit_value = null;
    RDentry_visited = -1;
    RDentry_computed = false;
    RDentry_initialized = false;
    RDentry_value = null;
    RDexit_visited = -1;
    RDexit_computed = false;
    RDexit_initialized = false;
    RDexit_value = null;
    TLentry_visited = -1;
    TLentry_computed = false;
    TLentry_initialized = false;
    TLentry_value = null;
    TLexit_visited = -1;
    TLexit_computed = false;
    TLexit_initialized = false;
    TLexit_value = null;
    TVentry_visited = -1;
    TVentry_computed = false;
    TVentry_initialized = false;
    TVentry_value = null;
    TVexit_visited = -1;
    TVexit_computed = false;
    TVexit_initialized = false;
    TVexit_value = null;
    inFlows_visited = -1;
    outFlows_visited = -1;
    progLabels_visited = -1;
    progReadVar_visited = -1;
    progInitLabel_visited = -1;
    progFV_visited = -1;
    progCFG_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the LabelAST child.
   * @param node The new node to replace the LabelAST child.
   * @apilevel high-level
   */
  public void setLabelAST(Label node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LabelAST child.
   * @return The current node used as the LabelAST child.
   * @apilevel high-level
   */
  public Label getLabelAST() {
    return (Label) getChild(0);
  }
  /**
   * Retrieves the LabelAST child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LabelAST child.
   * @apilevel low-level
   */
  public Label getLabelASTNoTransform() {
    return (Label) getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   */
  public Expr getExpr() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   */
  public Expr getExprNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /**
   * @apilevel internal
   */
  protected int FV_visited = -1;
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\FreeVars.jrag:43
   */
  public Set<String> FV() {
    ASTNode$State state = state();
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    try {  return getExpr().FV();  }
    finally {
      FV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int killIT_visited = -1;
  /** The kill function for Initial Taint Analysis 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:12
   */
  public Set<Map.Entry> killIT() {
    ASTNode$State state = state();
    if (killIT_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killIT in class: org.jastadd.ast.AST.SynDecl");
    }
    killIT_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      killIT_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int genIT_visited = -1;
  /** The gen function for Inital Taint Analysis 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:23
   */
  public Set<Map.Entry> genIT() {
    ASTNode$State state = state();
    if (genIT_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genIT in class: org.jastadd.ast.AST.SynDecl");
    }
    genIT_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      genIT_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:14
   */
  public String prettyPrint() {
    ASTNode$State state = state();
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    try { 
                    return "[" + getExpr().prettyPrint() + "]^" + getLabelAST().prettyPrint();
            }
    finally {
      prettyPrint_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int killRD_visited = -1;
  /** The kill function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:8
   */
  public Set<Map.Entry> killRD() {
    ASTNode$State state = state();
    if (killRD_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killRD in class: org.jastadd.ast.AST.SynDecl");
    }
    killRD_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      killRD_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int genRD_visited = -1;
  /** The gen function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:19
   */
  public Set<Map.Entry> genRD() {
    ASTNode$State state = state();
    if (genRD_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genRD in class: org.jastadd.ast.AST.SynDecl");
    }
    genRD_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      genRD_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int RV_visited = -1;
  /**
   * @attribute syn
   * @aspect ReadVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ReadVars.jrag:40
   */
  public Set<String> RV() {
    ASTNode$State state = state();
    if (RV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: RV in class: org.jastadd.ast.AST.SynDecl");
    }
    RV_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      RV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int killTL_visited = -1;
  /** The kill function for Taint Location Analysis 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:8
   */
  public Set<Map.Entry> killTL() {
    ASTNode$State state = state();
    if (killTL_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killTL in class: org.jastadd.ast.AST.SynDecl");
    }
    killTL_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      killTL_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int genTL_visited = -1;
  /** The gen function for Taint Location Analysis 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:20
   */
  public Set<Map.Entry> genTL() {
    ASTNode$State state = state();
    if (genTL_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genTL in class: org.jastadd.ast.AST.SynDecl");
    }
    genTL_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      genTL_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int killTV_visited = -1;
  /** The kill function for Taint Variable analysis 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:14
   */
  public Set<Map.Entry> killTV() {
    ASTNode$State state = state();
    if (killTV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: killTV in class: org.jastadd.ast.AST.SynDecl");
    }
    killTV_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      killTV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int genTV_visited = -1;
  /** The gen function for Taint Variable analysis 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:26
   */
  public Set<Map.Entry> genTV() {
    ASTNode$State state = state();
    if (genTV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: genTV in class: org.jastadd.ast.AST.SynDecl");
    }
    genTV_visited = state().boundariesCrossed;
    try {  return SetRepUtility.emptySet();  }
    finally {
      genTV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:5
   */
  public String unparse() {
    ASTNode$State state = state();
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try { 
    		return "[" + getExpr().unparse() + "]^" + getLabelAST().unparse();
    	}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int ITentry_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean ITentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean ITentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> ITentry_value;
  /**
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:39
   */
  public Set<Map.Entry> ITentry() {
    if(ITentry_computed) {
      return ITentry_value;
    }
    ASTNode$State state = state();
    if (!ITentry_initialized) {
      ITentry_initialized = true;
      ITentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        ITentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_ITentry_value = ITentry_compute();
        if ((new_ITentry_value==null && ITentry_value!=null) || (new_ITentry_value!=null && !new_ITentry_value.equals(ITentry_value))) {
          state.CHANGE = true;
        }
        ITentry_value = new_ITentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        ITentry_computed = true;
        state.LAST_CYCLE = true;
        ITentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        ITentry_compute();
        state.RESET_CYCLE = false;
        ITentry_computed = false;
        ITentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      return ITentry_value;
    }
    if(ITentry_visited != state.CIRCLE_INDEX) {
      ITentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      ITentry_computed = true;
        Set<Map.Entry> new_ITentry_value = ITentry_compute();
        return new_ITentry_value;
      }
      if (state.RESET_CYCLE) {
        ITentry_computed = false;
        ITentry_initialized = false;
        ITentry_visited = -1;
        return ITentry_value;
      }
      Set<Map.Entry> new_ITentry_value = ITentry_compute();
      if ((new_ITentry_value==null && ITentry_value!=null) || (new_ITentry_value!=null && !new_ITentry_value.equals(ITentry_value))) {
        state.CHANGE = true;
      }
      ITentry_value = new_ITentry_value;
      return ITentry_value;
    }
    return ITentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> ITentry_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet();
  		if (!getLabelAST().equals(progInitLabel())) {
  			for (Label l : inFlows()) {
  				Block b = l.itsBlock();
  				ret.addAll(b.ITexit());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int ITexit_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean ITexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean ITexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> ITexit_value;
  /**
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:52
   */
  public Set<Map.Entry> ITexit() {
    if(ITexit_computed) {
      return ITexit_value;
    }
    ASTNode$State state = state();
    if (!ITexit_initialized) {
      ITexit_initialized = true;
      ITexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        ITexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_ITexit_value = ITexit_compute();
        if ((new_ITexit_value==null && ITexit_value!=null) || (new_ITexit_value!=null && !new_ITexit_value.equals(ITexit_value))) {
          state.CHANGE = true;
        }
        ITexit_value = new_ITexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        ITexit_computed = true;
        state.LAST_CYCLE = true;
        ITexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        ITexit_compute();
        state.RESET_CYCLE = false;
        ITexit_computed = false;
        ITexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      return ITexit_value;
    }
    if(ITexit_visited != state.CIRCLE_INDEX) {
      ITexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      ITexit_computed = true;
        Set<Map.Entry> new_ITexit_value = ITexit_compute();
        return new_ITexit_value;
      }
      if (state.RESET_CYCLE) {
        ITexit_computed = false;
        ITexit_initialized = false;
        ITexit_visited = -1;
        return ITexit_value;
      }
      Set<Map.Entry> new_ITexit_value = ITexit_compute();
      if ((new_ITexit_value==null && ITexit_value!=null) || (new_ITexit_value!=null && !new_ITexit_value.equals(ITexit_value))) {
        state.CHANGE = true;
      }
      ITexit_value = new_ITexit_value;
      return ITexit_value;
    }
    return ITexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> ITexit_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.ITentry());
  		ret.removeAll(this.killIT());
  		ret.addAll(this.genIT());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int RDentry_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean RDentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean RDentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> RDentry_value;
  /**
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:29
   */
  public Set<Map.Entry> RDentry() {
    if(RDentry_computed) {
      return RDentry_value;
    }
    ASTNode$State state = state();
    if (!RDentry_initialized) {
      RDentry_initialized = true;
      RDentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        RDentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_RDentry_value = RDentry_compute();
        if ((new_RDentry_value==null && RDentry_value!=null) || (new_RDentry_value!=null && !new_RDentry_value.equals(RDentry_value))) {
          state.CHANGE = true;
        }
        RDentry_value = new_RDentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        RDentry_computed = true;
        state.LAST_CYCLE = true;
        RDentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        RDentry_compute();
        state.RESET_CYCLE = false;
        RDentry_computed = false;
        RDentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      return RDentry_value;
    }
    if(RDentry_visited != state.CIRCLE_INDEX) {
      RDentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      RDentry_computed = true;
        Set<Map.Entry> new_RDentry_value = RDentry_compute();
        return new_RDentry_value;
      }
      if (state.RESET_CYCLE) {
        RDentry_computed = false;
        RDentry_initialized = false;
        RDentry_visited = -1;
        return RDentry_value;
      }
      Set<Map.Entry> new_RDentry_value = RDentry_compute();
      if ((new_RDentry_value==null && RDentry_value!=null) || (new_RDentry_value!=null && !new_RDentry_value.equals(RDentry_value))) {
        state.CHANGE = true;
      }
      RDentry_value = new_RDentry_value;
      return RDentry_value;
    }
    return RDentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> RDentry_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet();
  		if (getLabelAST().equals(progInitLabel())) {
  			ret.addAll(SetRepUtility.crossWith(progFV(), new NumLabel("?")));
  		} else {
  			for (Label l : inFlows()) {
  				Block b = l.itsBlock();
  				ret.addAll(b.RDexit());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int RDexit_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean RDexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean RDexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> RDexit_value;
  /**
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:44
   */
  public Set<Map.Entry> RDexit() {
    if(RDexit_computed) {
      return RDexit_value;
    }
    ASTNode$State state = state();
    if (!RDexit_initialized) {
      RDexit_initialized = true;
      RDexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        RDexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_RDexit_value = RDexit_compute();
        if ((new_RDexit_value==null && RDexit_value!=null) || (new_RDexit_value!=null && !new_RDexit_value.equals(RDexit_value))) {
          state.CHANGE = true;
        }
        RDexit_value = new_RDexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        RDexit_computed = true;
        state.LAST_CYCLE = true;
        RDexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        RDexit_compute();
        state.RESET_CYCLE = false;
        RDexit_computed = false;
        RDexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      return RDexit_value;
    }
    if(RDexit_visited != state.CIRCLE_INDEX) {
      RDexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      RDexit_computed = true;
        Set<Map.Entry> new_RDexit_value = RDexit_compute();
        return new_RDexit_value;
      }
      if (state.RESET_CYCLE) {
        RDexit_computed = false;
        RDexit_initialized = false;
        RDexit_visited = -1;
        return RDexit_value;
      }
      Set<Map.Entry> new_RDexit_value = RDexit_compute();
      if ((new_RDexit_value==null && RDexit_value!=null) || (new_RDexit_value!=null && !new_RDexit_value.equals(RDexit_value))) {
        state.CHANGE = true;
      }
      RDexit_value = new_RDexit_value;
      return RDexit_value;
    }
    return RDexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> RDexit_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.RDentry());
  		ret.removeAll(this.killRD());
  		ret.addAll(this.genRD());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int TLentry_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean TLentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean TLentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> TLentry_value;
  /**
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:52
   */
  public Set<Map.Entry> TLentry() {
    if(TLentry_computed) {
      return TLentry_value;
    }
    ASTNode$State state = state();
    if (!TLentry_initialized) {
      TLentry_initialized = true;
      TLentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        TLentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_TLentry_value = TLentry_compute();
        if ((new_TLentry_value==null && TLentry_value!=null) || (new_TLentry_value!=null && !new_TLentry_value.equals(TLentry_value))) {
          state.CHANGE = true;
        }
        TLentry_value = new_TLentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        TLentry_computed = true;
        state.LAST_CYCLE = true;
        TLentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        TLentry_compute();
        state.RESET_CYCLE = false;
        TLentry_computed = false;
        TLentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      return TLentry_value;
    }
    if(TLentry_visited != state.CIRCLE_INDEX) {
      TLentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      TLentry_computed = true;
        Set<Map.Entry> new_TLentry_value = TLentry_compute();
        return new_TLentry_value;
      }
      if (state.RESET_CYCLE) {
        TLentry_computed = false;
        TLentry_initialized = false;
        TLentry_visited = -1;
        return TLentry_value;
      }
      Set<Map.Entry> new_TLentry_value = TLentry_compute();
      if ((new_TLentry_value==null && TLentry_value!=null) || (new_TLentry_value!=null && !new_TLentry_value.equals(TLentry_value))) {
        state.CHANGE = true;
      }
      TLentry_value = new_TLentry_value;
      return TLentry_value;
    }
    return TLentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> TLentry_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet();
  		if (getLabelAST().equals(progInitLabel())) {
  			ret.addAll(SetRepUtility.crossWith(progFV(), new NumLabel("?")));
  		} else {
  			for (Label l : inFlows()) {
  				Block b = l.itsBlock();
  				ret.addAll(b.TLexit());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int TLexit_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean TLexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean TLexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> TLexit_value;
  /**
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:67
   */
  public Set<Map.Entry> TLexit() {
    if(TLexit_computed) {
      return TLexit_value;
    }
    ASTNode$State state = state();
    if (!TLexit_initialized) {
      TLexit_initialized = true;
      TLexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        TLexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_TLexit_value = TLexit_compute();
        if ((new_TLexit_value==null && TLexit_value!=null) || (new_TLexit_value!=null && !new_TLexit_value.equals(TLexit_value))) {
          state.CHANGE = true;
        }
        TLexit_value = new_TLexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        TLexit_computed = true;
        state.LAST_CYCLE = true;
        TLexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        TLexit_compute();
        state.RESET_CYCLE = false;
        TLexit_computed = false;
        TLexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      return TLexit_value;
    }
    if(TLexit_visited != state.CIRCLE_INDEX) {
      TLexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      TLexit_computed = true;
        Set<Map.Entry> new_TLexit_value = TLexit_compute();
        return new_TLexit_value;
      }
      if (state.RESET_CYCLE) {
        TLexit_computed = false;
        TLexit_initialized = false;
        TLexit_visited = -1;
        return TLexit_value;
      }
      Set<Map.Entry> new_TLexit_value = TLexit_compute();
      if ((new_TLexit_value==null && TLexit_value!=null) || (new_TLexit_value!=null && !new_TLexit_value.equals(TLexit_value))) {
        state.CHANGE = true;
      }
      TLexit_value = new_TLexit_value;
      return TLexit_value;
    }
    return TLexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> TLexit_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.TLentry());
  		ret.removeAll(this.killTL());
  		ret.addAll(this.genTL());		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int TVentry_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean TVentry_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean TVentry_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> TVentry_value;
  /**
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:60
   */
  public Set<Map.Entry> TVentry() {
    if(TVentry_computed) {
      return TVentry_value;
    }
    ASTNode$State state = state();
    if (!TVentry_initialized) {
      TVentry_initialized = true;
      TVentry_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        TVentry_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_TVentry_value = TVentry_compute();
        if ((new_TVentry_value==null && TVentry_value!=null) || (new_TVentry_value!=null && !new_TVentry_value.equals(TVentry_value))) {
          state.CHANGE = true;
        }
        TVentry_value = new_TVentry_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        TVentry_computed = true;
        state.LAST_CYCLE = true;
        TVentry_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        TVentry_compute();
        state.RESET_CYCLE = false;
        TVentry_computed = false;
        TVentry_initialized = false;
      }
      state.IN_CIRCLE = false;
      return TVentry_value;
    }
    if(TVentry_visited != state.CIRCLE_INDEX) {
      TVentry_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      TVentry_computed = true;
        Set<Map.Entry> new_TVentry_value = TVentry_compute();
        return new_TVentry_value;
      }
      if (state.RESET_CYCLE) {
        TVentry_computed = false;
        TVentry_initialized = false;
        TVentry_visited = -1;
        return TVentry_value;
      }
      Set<Map.Entry> new_TVentry_value = TVentry_compute();
      if ((new_TVentry_value==null && TVentry_value!=null) || (new_TVentry_value!=null && !new_TVentry_value.equals(TVentry_value))) {
        state.CHANGE = true;
      }
      TVentry_value = new_TVentry_value;
      return TVentry_value;
    }
    return TVentry_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> TVentry_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet();
  		if (!getLabelAST().equals(progInitLabel())) {
  			for (Label l : inFlows()) {
  				Block b = l.itsBlock();
  				ret.addAll(b.TVexit());
  			}
  		}		
  		return ret;
  	}
  /**
   * @apilevel internal
   */
  protected int TVexit_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean TVexit_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean TVexit_initialized = false;
  /**
   * @apilevel internal
   */
  protected Set<Map.Entry> TVexit_value;
  /**
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:73
   */
  public Set<Map.Entry> TVexit() {
    if(TVexit_computed) {
      return TVexit_value;
    }
    ASTNode$State state = state();
    if (!TVexit_initialized) {
      TVexit_initialized = true;
      TVexit_value = SetRepUtility.emptySet();
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      // TODO: fixme
      // state().CIRCLE_INDEX = 1;
      do {
        TVexit_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        Set<Map.Entry> new_TVexit_value = TVexit_compute();
        if ((new_TVexit_value==null && TVexit_value!=null) || (new_TVexit_value!=null && !new_TVexit_value.equals(TVexit_value))) {
          state.CHANGE = true;
        }
        TVexit_value = new_TVexit_value;
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
      if(isFinal && num == state().boundariesCrossed) {
        TVexit_computed = true;
        state.LAST_CYCLE = true;
        TVexit_compute();
        state.LAST_CYCLE = false;
      } else {
        state.RESET_CYCLE = true;
        TVexit_compute();
        state.RESET_CYCLE = false;
        TVexit_computed = false;
        TVexit_initialized = false;
      }
      state.IN_CIRCLE = false;
      return TVexit_value;
    }
    if(TVexit_visited != state.CIRCLE_INDEX) {
      TVexit_visited = state.CIRCLE_INDEX;
      if (state.LAST_CYCLE) {
      TVexit_computed = true;
        Set<Map.Entry> new_TVexit_value = TVexit_compute();
        return new_TVexit_value;
      }
      if (state.RESET_CYCLE) {
        TVexit_computed = false;
        TVexit_initialized = false;
        TVexit_visited = -1;
        return TVexit_value;
      }
      Set<Map.Entry> new_TVexit_value = TVexit_compute();
      if ((new_TVexit_value==null && TVexit_value!=null) || (new_TVexit_value!=null && !new_TVexit_value.equals(TVexit_value))) {
        state.CHANGE = true;
      }
      TVexit_value = new_TVexit_value;
      return TVexit_value;
    }
    return TVexit_value;
  }
  /**
   * @apilevel internal
   */
  private Set<Map.Entry> TVexit_compute() {
  		Set<Map.Entry> ret = SetRepUtility.emptySet(); // start with a fresh set!
  		ret.addAll(this.TVentry());
  		ret.removeAll(this.killTV());
  		ret.addAll(this.genTV());
  		ret.addAll(this.ITexit());
  		return ret;
  	}
  /**
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:143
   */
  public Set<Label> inFlows() {
    ASTNode$State state = state();
    if (inFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: inFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    inFlows_visited = state().boundariesCrossed;
    Set<Label> inFlows_value = getParent().Define_Set_Label__inFlows(this, null);

    inFlows_visited = -1;
    return inFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int inFlows_visited = -1;
  /**
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:188
   */
  public Set<Label> outFlows() {
    ASTNode$State state = state();
    if (outFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: outFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    outFlows_visited = state().boundariesCrossed;
    Set<Label> outFlows_value = getParent().Define_Set_Label__outFlows(this, null);

    outFlows_visited = -1;
    return outFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int outFlows_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:11
   */
  public Set<Label> progLabels() {
    ASTNode$State state = state();
    if (progLabels_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progLabels in class: org.jastadd.ast.AST.InhDecl");
    }
    progLabels_visited = state().boundariesCrossed;
    Set<Label> progLabels_value = getParent().Define_Set_Label__progLabels(this, null);

    progLabels_visited = -1;
    return progLabels_value;
  }
  /**
   * @apilevel internal
   */
  protected int progLabels_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:15
   */
  public Set<String> progReadVar() {
    ASTNode$State state = state();
    if (progReadVar_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progReadVar in class: org.jastadd.ast.AST.InhDecl");
    }
    progReadVar_visited = state().boundariesCrossed;
    Set<String> progReadVar_value = getParent().Define_Set_String__progReadVar(this, null);

    progReadVar_visited = -1;
    return progReadVar_value;
  }
  /**
   * @apilevel internal
   */
  protected int progReadVar_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:19
   */
  public Label progInitLabel() {
    ASTNode$State state = state();
    if (progInitLabel_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progInitLabel in class: org.jastadd.ast.AST.InhDecl");
    }
    progInitLabel_visited = state().boundariesCrossed;
    Label progInitLabel_value = getParent().Define_Label_progInitLabel(this, null);

    progInitLabel_visited = -1;
    return progInitLabel_value;
  }
  /**
   * @apilevel internal
   */
  protected int progInitLabel_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:23
   */
  public Set<String> progFV() {
    ASTNode$State state = state();
    if (progFV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progFV in class: org.jastadd.ast.AST.InhDecl");
    }
    progFV_visited = state().boundariesCrossed;
    Set<String> progFV_value = getParent().Define_Set_String__progFV(this, null);

    progFV_visited = -1;
    return progFV_value;
  }
  /**
   * @apilevel internal
   */
  protected int progFV_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:32
   */
  public FlowGraph<Label,Label> progCFG() {
    ASTNode$State state = state();
    if (progCFG_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progCFG in class: org.jastadd.ast.AST.InhDecl");
    }
    progCFG_visited = state().boundariesCrossed;
    FlowGraph<Label,Label> progCFG_value = getParent().Define_FlowGraph_Label_Label__progCFG(this, null);

    progCFG_visited = -1;
    return progCFG_value;
  }
  /**
   * @apilevel internal
   */
  protected int progCFG_visited = -1;
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:121
   * @apilevel internal
   */
  public Block Define_Block_itsBlock(ASTNode caller, ASTNode child) {
    if (caller == getLabelASTNoTransform()) {
      return this;
    }
    else {
      return getParent().Define_Block_itsBlock(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
