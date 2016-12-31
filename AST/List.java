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
 * @production List : {@link ASTNode};

 */
public class List<T extends ASTNode> extends ASTNode<T> implements Cloneable {
  /**
   * @apilevel internal
   */
  public List<T> clone() throws CloneNotSupportedException {
    List node = (List) super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public List<T> copy() {
    try {
      List node = (List) clone();
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
  public List<T> fullCopy() {
    List tree = (List) copy();
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
  public List() {
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
  public List(T... initialChildren) {
    children = new ASTNode[initialChildren.length];
    for (int i = 0; i < children.length; ++i) {
      addChild(initialChildren[i]);
    }
  }
  /**
   */
  private boolean list$touched = true;
  /**
   */
  public List<T> add(T node) {
    addChild(node);
    return this;
  }
  /**
   */
  public List<T> addAll(java.util.Collection<? extends T> c) {
    for (T node : c) {
      addChild(node);
    }
    return this;
  }
  /**
   */
  public void insertChild(ASTNode node, int i) {

    list$touched = true;

    super.insertChild(node, i);
  }
  /**
   */
  public void addChild(T node) {

    list$touched = true;

    super.addChild(node);
  }
  /**
   * @apilevel low-level
   */
  public void removeChild(int i) {

    list$touched = true;

    super.removeChild(i);
  }
  /**
   */
  public int getNumChild() {

    if (list$touched) {
      for (int i = 0; i < getNumChildNoTransform(); i++) {
        getChild(i);
      }
      list$touched = false;
    }

    return getNumChildNoTransform();
  }
  /**
   * @apilevel internal
   */
  public boolean mayHaveRewrite() {
    return true;
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
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    if(list$touched) {
      for(int i = 0 ; i < getNumChildNoTransform(); i++) {
        getChild(i);
      }
      list$touched = false;
      return this;
    }    return super.rewriteTo();
  }}
