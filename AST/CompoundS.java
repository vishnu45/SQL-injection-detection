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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:29
 * @production CompoundS : {@link S} ::= <span class="component">SList:{@link S}*</span>;

 */
public class CompoundS extends S implements Cloneable {
  /**
   * @apilevel internal
   */
  public CompoundS clone() throws CloneNotSupportedException {
    CompoundS node = (CompoundS) super.clone();
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
  public CompoundS copy() {
    try {
      CompoundS node = (CompoundS) clone();
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
  public CompoundS fullCopy() {
    CompoundS tree = (CompoundS) copy();
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
  public CompoundS() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   */
  public CompoundS(List<S> p0) {
    setChild(p0, 0);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 1;
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
   * Replaces the SList list.
   * @param list The new list node to be used as the SList list.
   * @apilevel high-level
   */
  public void setSListList(List<S> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SList list.
   * @return Number of children in the SList list.
   * @apilevel high-level
   */
  public int getNumSList() {
    return getSListList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SList list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SList list.
   * @apilevel low-level
   */
  public int getNumSListNoTransform() {
    return getSListListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SList list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SList list.
   * @apilevel high-level
   */
  public S getSList(int i) {
    return (S) getSListList().getChild(i);
  }
  /**
   * Check whether the SList list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSList() {
    return getSListList().getNumChild() != 0;
  }
  /**
   * Append an element to the SList list.
   * @param node The element to append to the SList list.
   * @apilevel high-level
   */
  public void addSList(S node) {
    List<S> list = (parent == null || state == null) ? getSListListNoTransform() : getSListList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void addSListNoTransform(S node) {
    List<S> list = getSListListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SList list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSList(S node, int i) {
    List<S> list = getSListList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  public List<S> getSListList() {
    List<S> list = (List<S>) getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<S> getSListListNoTransform() {
    return (List<S>) getChildNoTransform(0);
  }
  /**
   * Retrieves the SList list.
   * @return The node representing the SList list.
   * @apilevel high-level
   */
  public List<S> getSLists() {
    return getSListList();
  }
  /**
   * Retrieves the SList list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SList list.
   * @apilevel low-level
   */
  public List<S> getSListsNoTransform() {
    return getSListListNoTransform();
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
    try {  return getSList(0).init();  }
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
    try {  return getSList(getNumSList()-1).finals();  }
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
    	     Set<Block> ret = SetRepUtility.emptySet();
    	     for (int i =0; i < getNumSList(); i++) {
    	        ret.addAll(getSList(i).blocks());
    	     }
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
    	     Set ret = SetRepUtility.emptySet();
    	     for (int i = 0; i < getNumSList(); i++) {
    	       ret.addAll(getSList(i).labels());
    	     }
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
    	     FlowGraph<Label, Label> ret = new FlowGraph<Label, Label>();
    	     for (int i = 1; i < getNumSList()-1; i++) {
    	        ret.putAll(getSList(i-1).flows());
    	        Set<Label> finalsM1 = getSList(i-1).finals();
    	        ret.putAll(FlowGraph.crossWith(finalsM1, getSList(i).init()));
    	     }
    	     ret.putAll(getSList(getNumSList()-1).flows());
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
    	   Set<String> ret = SetRepUtility.emptySet();
    	   for (int i = 0; i < getNumSList(); i++) {
    	      ret.addAll(getSList(i).FV());
    	   }
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
    try { 
                    StringBuffer s1 = new StringBuffer();
                    String indent = PPUtility.spacesForIndent(nestingLevel());
                    s1.append(indent);
                    s1.append("{\n");
                    int len = getNumSList();
                    for (int i = 0; i < len; i++) {
                            s1.append(getSList(i).prettyPrint());
                            if (i < len-1) { s1.append("\n"); }     
                    }
                    s1.append(PPUtility.spacesForIndent(nestingLevel()));
                    s1.append('\n'); s1.append(indent); s1.append("}");
                    return s1.toString();
            }
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
    	   for (int i = 0; i < getNumSList(); i++) {
    	      ret.addAll(getSList(i).RV());
    	   }
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
    		StringBuffer s1 = new StringBuffer();
    		int len = getNumSList();
    		s1.append("{\n");
    		for (int i = 0; i < len; i++) {
    			s1.append(getSList(i).unparse());
    			if (i < len-1) { s1.append("\n"); }	
    		}
    		s1.append("\n}");
    		return s1.toString();
    	}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:135
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__inFlows(ASTNode caller, ASTNode child) {
    if (caller == getSListListNoTransform()) {
      int index = caller.getIndexOfChild(child);
      {
		if (index == 0) {
			return inFlows();
		} else { 
			return getSList(index-1).finals();
		}
	}
    }
    else {
      return getParent().Define_Set_Label__inFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:154
   * @apilevel internal
   */
  public S Define_S_next(ASTNode caller, ASTNode child) {
    if (caller == getSListListNoTransform()) {
      int index = caller.getIndexOfChild(child);
      {
		if (index == getNumSList()-1) {
			return next();
		} else {
			return getSList(index+1);
		}
	}
    }
    else {
      return getParent().Define_S_next(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:180
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__outFlows(ASTNode caller, ASTNode child) {
    if (caller == getSListListNoTransform()) {
      int index = caller.getIndexOfChild(child);
      {
		if (index == getNumSList()-1) {
			return outFlows();
		} else { 
			return SetRepUtility.singleton(getSList(index+1).init());
		}
	}
    }
    else {
      return getParent().Define_Set_Label__outFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:7
   * @apilevel internal
   */
  public int Define_int_nestingLevel(ASTNode caller, ASTNode child) {
    if (caller == getSListListNoTransform()) {
      int index = caller.getIndexOfChild(child);
      return nestingLevel()+1;
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
