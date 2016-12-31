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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:32
 * @production WhileS : {@link S} ::= <span class="component">{@link LabeledExpr}</span> <span class="component">{@link S}</span>;

 */
public class WhileS extends S implements Cloneable {
  /**
   * @apilevel internal
   */
  public WhileS clone() throws CloneNotSupportedException {
    WhileS node = (WhileS) super.clone();
    node.init_visited = -1;
    node.finals_visited = -1;
    node.blocks_visited = -1;
    node.labels_visited = -1;
    node.flows_visited = -1;
    node.FV_visited = -1;
    node.prettyPrint_visited = -1;
    node.RV_visited = -1;
    node.unparse_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public WhileS copy() {
    try {
      WhileS node = (WhileS) clone();
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
  public WhileS fullCopy() {
    WhileS tree = (WhileS) copy();
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
  /**
   */
  public WhileS() {
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
  public WhileS(LabeledExpr p0, S p1) {
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
    init_visited = -1;
    finals_visited = -1;
    blocks_visited = -1;
    labels_visited = -1;
    flows_visited = -1;
    FV_visited = -1;
    prettyPrint_visited = -1;
    RV_visited = -1;
    unparse_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the LabeledExpr child.
   * @param node The new node to replace the LabeledExpr child.
   * @apilevel high-level
   */
  public void setLabeledExpr(LabeledExpr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LabeledExpr child.
   * @return The current node used as the LabeledExpr child.
   * @apilevel high-level
   */
  public LabeledExpr getLabeledExpr() {
    return (LabeledExpr) getChild(0);
  }
  /**
   * Retrieves the LabeledExpr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LabeledExpr child.
   * @apilevel low-level
   */
  public LabeledExpr getLabeledExprNoTransform() {
    return (LabeledExpr) getChildNoTransform(0);
  }
  /**
   * Replaces the S child.
   * @param node The new node to replace the S child.
   * @apilevel high-level
   */
  public void setS(S node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the S child.
   * @return The current node used as the S child.
   * @apilevel high-level
   */
  public S getS() {
    return (S) getChild(1);
  }
  /**
   * Retrieves the S child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the S child.
   * @apilevel low-level
   */
  public S getSNoTransform() {
    return (S) getChildNoTransform(1);
  }
  /**
   * @apilevel internal
   */
  protected int init_visited = -1;
  /** The initial label of an AST node. 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:8
   */
  public Label init() {
    ASTNode$State state = state();
    if (init_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: init in class: org.jastadd.ast.AST.SynDecl");
    }
    init_visited = state().boundariesCrossed;
    try {  return getLabeledExpr().getLabelAST();  }
    finally {
      init_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int finals_visited = -1;
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:19
   */
  public Set<Label> finals() {
    ASTNode$State state = state();
    if (finals_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: finals in class: org.jastadd.ast.AST.SynDecl");
    }
    finals_visited = state().boundariesCrossed;
    try {  return SetRepUtility.singleton(getLabeledExpr().getLabelAST());  }
    finally {
      finals_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int blocks_visited = -1;
  /** Set of blocks in a statement. 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:45
   */
  public Set<Block> blocks() {
    ASTNode$State state = state();
    if (blocks_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: blocks in class: org.jastadd.ast.AST.SynDecl");
    }
    blocks_visited = state().boundariesCrossed;
    try {
    	      Set<Block> ret = getS().blocks();
    	      ret.add(getLabeledExpr());
    	      return ret;
    	   }
    finally {
      blocks_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int labels_visited = -1;
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:81
   */
  public Set<Label> labels() {
    ASTNode$State state = state();
    if (labels_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: labels in class: org.jastadd.ast.AST.SynDecl");
    }
    labels_visited = state().boundariesCrossed;
    try {
    	     Set ret = SetRepUtility.singleton(getLabeledExpr().getLabelAST());
    	     ret.addAll(getS().labels());
    	     return ret;
    	   }
    finally {
      labels_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int flows_visited = -1;
  /** flows inside of a statement 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:201
   */
  public FlowGraph<Label, Label> flows() {
    ASTNode$State state = state();
    if (flows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: flows in class: org.jastadd.ast.AST.SynDecl");
    }
    flows_visited = state().boundariesCrossed;
    try {
    	     Label l = getLabeledExpr().getLabelAST();
    	     FlowGraph<Label, Label> ret = getS().flows();
    	     ret.put(l, getS().init());
    	     ret.putAll(FlowGraph.crossWith(getS().finals(), l));
    	     return ret;
              }
    finally {
      flows_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int FV_visited = -1;
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\FreeVars.jrag:9
   */
  public Set<String> FV() {
    ASTNode$State state = state();
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    try {
    	   Set<String> ret = getLabeledExpr().FV();
    	   ret.addAll(getS().FV());
    	   return ret;
    	}
    finally {
      FV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:13
   */
  public String prettyPrint() {
    ASTNode$State state = state();
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    try { return PPUtility.spacesForIndent(nestingLevel())
                                     + "while "  + getLabeledExpr().prettyPrint() 
                                     + " \n" + getS().prettyPrint(); }
    finally {
      prettyPrint_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int RV_visited = -1;
  /**
   * @attribute syn
   * @aspect ReadVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ReadVars.jrag:9
   */
  public Set<String> RV() {
    ASTNode$State state = state();
    if (RV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: RV in class: org.jastadd.ast.AST.SynDecl");
    }
    RV_visited = state().boundariesCrossed;
    try {
    	   Set<String> ret = SetRepUtility.emptySet();
    	   ret.addAll(getS().RV());
    	   return ret;
    	}
    finally {
      RV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:4
   */
  public String unparse() {
    ASTNode$State state = state();
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try {
    		return "while "  + getLabeledExpr().unparse() + "\n"
    	                     +  getS().unparse() ; 
    	}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:145
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__inFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()){
		Set<Label> ins = this.inFlows();
		ins.addAll(getS().finals());
		return ins;
	}
    else if (caller == getSNoTransform()){
	    return SetRepUtility.singleton(getLabeledExpr().getLabelAST());
	}
    else {
      return getParent().Define_Set_Label__inFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:164
   * @apilevel internal
   */
  public S Define_S_next(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return this;
    }
    else {
      return getParent().Define_S_next(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:194
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__outFlows(ASTNode caller, ASTNode child) {
    if (caller == getLabeledExprNoTransform()){
		Set<Label> outs = SetRepUtility.singleton(getS().init());
		if (next() != null) { outs.add(next().init()); }
		return outs;
	}
    else if (caller == getSNoTransform()){
	    return SetRepUtility.singleton(getLabeledExpr().getLabelAST());
	}
    else {
      return getParent().Define_Set_Label__outFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:10
   * @apilevel internal
   */
  public int Define_int_nestingLevel(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return nestingLevel();
    }
    else {
      return getParent().Define_int_nestingLevel(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
