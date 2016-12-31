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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:37
 * @production NumLabel : {@link Label} ::= <span class="component">&lt;Num:String&gt;</span>;

 */
public class NumLabel extends Label implements Cloneable {
  /**
   * @apilevel internal
   */
  public NumLabel clone() throws CloneNotSupportedException {
    NumLabel node = (NumLabel) super.clone();
    node.unparse_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public NumLabel copy() {
    try {
      NumLabel node = (NumLabel) clone();
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
  public NumLabel fullCopy() {
    NumLabel tree = (NumLabel) copy();
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
  /** Are these labels equal? 
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:106
   */
  public boolean equals(Object oth) {
	   if (oth == null || !(oth instanceof NumLabel)) { return false; }
	   NumLabel l = (NumLabel) oth;
	   return getNum().equals(l.getNum());
	}
  /** Return the hash code for this label. 
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:112
   */
  public int hashCode() {
	   return getNum().hashCode();
	}
  /**
   */
  public NumLabel() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
  }
  /**
   */
  public NumLabel(String p0) {
    setNum(p0);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 0;
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
    unparse_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * Replaces the lexeme Num.
   * @param value The new value for the lexeme Num.
   * @apilevel high-level
   */
  public void setNum(String value) {
    tokenString_Num = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_Num;
  /**
   * Retrieves the value for the lexeme Num.
   * @return The value for the lexeme Num.
   * @apilevel high-level
   */
  public String getNum() {
    return tokenString_Num != null ? tokenString_Num : "";
  }
  /**
   * @apilevel internal
   */
  protected int unparse_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:7
   */
  public String unparse() {
    ASTNode$State state = state();
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try {  return getNum().toString();  }
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
