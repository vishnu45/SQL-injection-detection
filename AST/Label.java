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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:36
 * @production Label : {@link ASTNode};

 */
public abstract class Label extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public Label clone() throws CloneNotSupportedException {
    Label node = (Label) super.clone();
    node.prettyPrint_visited = -1;
    node.toString_visited = -1;
    node.itsBlock_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   */
  public Label() {
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
    itsBlock_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:7
   */
  public abstract String unparse();
  /**
   * @apilevel internal
   */
  protected int prettyPrint_visited = -1;
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:16
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:13
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
  /** Mapping from labels back to blocks. 
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:117
   */
  public Block itsBlock() {
    ASTNode$State state = state();
    if (itsBlock_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: itsBlock in class: org.jastadd.ast.AST.InhDecl");
    }
    itsBlock_visited = state().boundariesCrossed;
    Block itsBlock_value = getParent().Define_Block_itsBlock(this, null);

    itsBlock_visited = -1;
    return itsBlock_value;
  }
  /**
   * @apilevel internal
   */
  protected int itsBlock_visited = -1;
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
