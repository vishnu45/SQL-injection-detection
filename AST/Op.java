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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:3
 * @production Op : {@link ASTNode} ::= <span class="component">&lt;Contents:String&gt;</span>;

 */
public abstract class Op extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Op clone() throws CloneNotSupportedException {
    Op node = (Op) super.clone();
    node.prettyPrint_visited = -1;
    node.toString_visited = -1;
    node.unparse_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   */
  public Op() {
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
  public Op(String p0) {
    setContents(p0);
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
    prettyPrint_visited = -1;
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
   * Replaces the lexeme Contents.
   * @param value The new value for the lexeme Contents.
   * @apilevel high-level
   */
  public void setContents(String value) {
    tokenString_Contents = value;
  }
  /**
   * @apilevel internal
   */
  protected String tokenString_Contents;
  /**
   * Retrieves the value for the lexeme Contents.
   * @return The value for the lexeme Contents.
   * @apilevel high-level
   */
  public String getContents() {
    return tokenString_Contents != null ? tokenString_Contents : "";
  }
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:15
   */
  public String prettyPrint() {
    ASTNode$State state = state();
    if (prettyPrint_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: prettyPrint in class: org.jastadd.ast.AST.SynDecl");
    }
    prettyPrint_visited = state().boundariesCrossed;
    try {  return unparse();  }
    finally {
      prettyPrint_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  protected int toString_visited = -1;
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:12
   */
  public String toString() {
    ASTNode$State state = state();
    if (toString_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: toString in class: org.jastadd.ast.AST.SynDecl");
    }
    toString_visited = state().boundariesCrossed;
    try {  return getContents();  }
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:6
   */
  public String unparse() {
    ASTNode$State state = state();
    if (unparse_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: unparse in class: org.jastadd.ast.AST.SynDecl");
    }
    unparse_visited = state().boundariesCrossed;
    try {  return getContents();  }
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
