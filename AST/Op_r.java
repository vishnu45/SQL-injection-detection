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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:5
 * @production Op_r : {@link Op};

 */
public class Op_r extends Op implements Cloneable {
  /**
   * @apilevel internal
   */
  public Op_r clone() throws CloneNotSupportedException {
    Op_r node = (Op_r) super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public Op_r copy() {
    try {
      Op_r node = (Op_r) clone();
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
  public Op_r fullCopy() {
    Op_r tree = (Op_r) copy();
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
  public Op_r() {
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
  public Op_r(String p0) {
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
  public ASTNode rewriteTo() {    return super.rewriteTo();
  }}
