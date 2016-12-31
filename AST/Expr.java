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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:9
 * @production Expr : {@link ASTNode};

 */
public abstract class Expr extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Expr clone() throws CloneNotSupportedException {
    Expr node = (Expr) super.clone();
    node.prettyPrint_visited = -1;
    node.toString_visited = -1;
    node.progAST_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   */
  public Expr() {
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
    progAST_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\FreeVars.jrag:43
   */
  public abstract Set<String> FV();
  /**
   * @attribute syn
   * @aspect ReadVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ReadVars.jrag:40
   */
  public abstract Set<String> RV();
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:5
   */
  public abstract String unparse();
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:11
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
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:28
   */
  public Program progAST() {
    ASTNode$State state = state();
    if (progAST_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: progAST in class: org.jastadd.ast.AST.InhDecl");
    }
    progAST_visited = state().boundariesCrossed;
    Program progAST_value = getParent().Define_Program_progAST(this, null);

    progAST_visited = -1;
    return progAST_value;
  }
  /**
   * @apilevel internal
   */
  protected int progAST_visited = -1;
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
