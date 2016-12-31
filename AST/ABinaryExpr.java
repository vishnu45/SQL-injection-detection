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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:19
 * @production ABinaryExpr : {@link Expr} ::= <span class="component">Left:{@link Expr}</span> <span class="component">Op:{@link Op_a}</span> <span class="component">Right:{@link Expr}</span>;

 */
public class ABinaryExpr extends Expr implements Cloneable {
  /**
   * @apilevel internal
   */
  public ABinaryExpr clone() throws CloneNotSupportedException {
    ABinaryExpr node = (ABinaryExpr) super.clone();
    node.FV_visited = -1;
    node.RV_visited = -1;
    node.unparse_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public ABinaryExpr copy() {
    try {
      ABinaryExpr node = (ABinaryExpr) clone();
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
  public ABinaryExpr fullCopy() {
    ABinaryExpr tree = (ABinaryExpr) copy();
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
  public ABinaryExpr() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   */
  public void init$Children() {
    children = new ASTNode[3];
  }
  /**
   */
  public ABinaryExpr(Expr p0, Op_a p1, Expr p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return 3;
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
   * Replaces the Left child.
   * @param node The new node to replace the Left child.
   * @apilevel high-level
   */
  public void setLeft(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Left child.
   * @return The current node used as the Left child.
   * @apilevel high-level
   */
  public Expr getLeft() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Left child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Left child.
   * @apilevel low-level
   */
  public Expr getLeftNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Op child.
   * @param node The new node to replace the Op child.
   * @apilevel high-level
   */
  public void setOp(Op_a node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Op child.
   * @return The current node used as the Op child.
   * @apilevel high-level
   */
  public Op_a getOp() {
    return (Op_a) getChild(1);
  }
  /**
   * Retrieves the Op child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Op child.
   * @apilevel low-level
   */
  public Op_a getOpNoTransform() {
    return (Op_a) getChildNoTransform(1);
  }
  /**
   * Replaces the Right child.
   * @param node The new node to replace the Right child.
   * @apilevel high-level
   */
  public void setRight(Expr node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Right child.
   * @return The current node used as the Right child.
   * @apilevel high-level
   */
  public Expr getRight() {
    return (Expr) getChild(2);
  }
  /**
   * Retrieves the Right child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Right child.
   * @apilevel low-level
   */
  public Expr getRightNoTransform() {
    return (Expr) getChildNoTransform(2);
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
    try {
    	   Set<String> ret = getLeft().FV();
    	   ret.addAll(getRight().FV());
    	   return ret;
    	}
    finally {
      FV_visited = -1;
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
    try { return "(" + getLeft().unparse() + " " + getOp().unparse() + " " + getRight().unparse() + ")";}
    finally {
      unparse_visited = -1;
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
