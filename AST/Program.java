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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:1
 * @production Program : {@link ASTNode} ::= <span class="component">{@link S}</span>;

 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program) super.clone();
    node.finals_visited = -1;
    node.FV_visited = -1;
    node.prettyPrint_visited = -1;
    node.RV_visited = -1;
    node.toString_visited = -1;
    node.unparse_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public Program copy() {
    try {
      Program node = (Program) clone();
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
  public Program fullCopy() {
    Program tree = (Program) copy();
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
  public Program() {
    super();
    is$Final(true);
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   */
  public Program(S p0) {
    setChild(p0, 0);
    is$Final(true);
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
    finals_visited = -1;
    FV_visited = -1;
    prettyPrint_visited = -1;
    RV_visited = -1;
    toString_visited = -1;
    unparse_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the S child.
   * @param node The new node to replace the S child.
   * @apilevel high-level
   */
  public void setS(S node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the S child.
   * @return The current node used as the S child.
   * @apilevel high-level
   */
  public S getS() {
    return (S) getChild(0);
  }
  /**
   * Retrieves the S child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the S child.
   * @apilevel low-level
   */
  public S getSNoTransform() {
    return (S) getChildNoTransform(0);
  }
  /**
   * @apilevel internal
   */
  protected int finals_visited = -1;
  /** The set of final labels of an AST node. 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:17
   */
  public Set<Label> finals() {
    ASTNode$State state = state();
    if (finals_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: finals in class: org.jastadd.ast.AST.SynDecl");
    }
    finals_visited = state().boundariesCrossed;
    try {  return getS().finals();  }
    finally {
      finals_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int FV_visited = -1;
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\FreeVars.jrag:8
   */
  public Set<String> FV() {
    ASTNode$State state = state();
    if (FV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: FV in class: org.jastadd.ast.AST.SynDecl");
    }
    FV_visited = state().boundariesCrossed;
    try {  return getS().FV();  }
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:12
   */
  public String prettyPrint() {
    ASTNode$State state = state();
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    try { 
              StringBuffer s = new StringBuffer();
    		  s.append("<?php\n");
    		  s.append(getS().prettyPrint());
    		  s.append("\n?>");
    		  return s.toString();
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ReadVars.jrag:8
   */
  public Set<String> RV() {
    ASTNode$State state = state();
    if (RV_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: RV in class: org.jastadd.ast.AST.SynDecl");
    }
    RV_visited = state().boundariesCrossed;
    try {  return getS().RV();  }
    finally {
      RV_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int toString_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:9
   */
  public String toString() {
    ASTNode$State state = state();
    if (toString_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: toString in class: org.jastadd.ast.AST.SynDecl");
    }
    toString_visited = state().boundariesCrossed;
    try {  return unparse();  }
    finally {
      toString_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:3
   */
  public String unparse() {
    ASTNode$State state = state();
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try { StringBuffer s = new StringBuffer();
    		  s.append("<?php\n");
    		  s.append(getS().unparse());
    		  s.append("\n?>");
    		  return s.toString();
    		}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:125
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__inFlows(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return SetRepUtility.emptySet();
    }
    else {
      return getParent().Define_Set_Label__inFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:161
   * @apilevel internal
   */
  public S Define_S_next(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return null;
    }
    else {
      return getParent().Define_S_next(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:168
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__outFlows(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return SetRepUtility.emptySet();
    }
    else {
      return getParent().Define_Set_Label__outFlows(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:6
   * @apilevel internal
   */
  public int Define_int_nestingLevel(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return 0;
    }
    else {
      return getParent().Define_int_nestingLevel(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:10
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__progLabels(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return getS().labels();
    }
    else {
      return getParent().Define_Set_Label__progLabels(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:14
   * @apilevel internal
   */
  public Set<String> Define_Set_String__progReadVar(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return getS().RV();
    }
    else {
      return getParent().Define_Set_String__progReadVar(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:18
   * @apilevel internal
   */
  public Label Define_Label_progInitLabel(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return getS().init();
    }
    else {
      return getParent().Define_Label_progInitLabel(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:22
   * @apilevel internal
   */
  public Set<String> Define_Set_String__progFV(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return getS().FV();
    }
    else {
      return getParent().Define_Set_String__progFV(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:26
   * @apilevel internal
   */
  public Program Define_Program_progAST(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return this;
    }
    else {
      return getParent().Define_Program_progAST(this, caller);
    }
  }
  /**
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:31
   * @apilevel internal
   */
  public FlowGraph<Label,Label> Define_FlowGraph_Label_Label__progCFG(ASTNode caller, ASTNode child) {
    if (caller == getSNoTransform()) {
      return getS().flows();
    }
    else {
      return getParent().Define_FlowGraph_Label_Label__progCFG(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
