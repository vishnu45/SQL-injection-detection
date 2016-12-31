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
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> implements Cloneable, Iterable<T> {
  /**
   * @apilevel internal
   */
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode) super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
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
  public ASTNode<T> fullCopy() {
    ASTNode tree = (ASTNode) copy();
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
  public ASTNode() {
    super();
    init$Children();
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
   * @apilevel internal
   */
  private int childIndex;
  /**
   * @apilevel low-level
   */
  public int getIndexOfChild(ASTNode node) {
    if (node == null) {
      return -1;
    }
    if (node.childIndex < numChildren && node == children[node.childIndex]) {
      return node.childIndex;
    }
    for(int i = 0; children != null && i < children.length; i++) {
      if(children[i] == node) {
        node.childIndex = i;
        return i;
      }
    }
    return -1;
  }
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithCircularEnabled = true;
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithCacheCycle = true;
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithComponentCheck = false;
  /**
   * Parent pointer
   * @apilevel low-level
   */
  protected ASTNode parent;
  /**
   * Child array
   * @apilevel low-level
   */
  protected ASTNode[] children;
  /**
   * @apilevel internal
   */
  protected static ASTNode$State state = new ASTNode$State();
  /**
   * @apilevel internal
   */
  public final ASTNode$State state() {
    return state;
  }
  /**
   * @apilevel internal
   */
  public boolean in$Circle = false;
  /**
   * @apilevel internal
   */
  public boolean in$Circle() {
    return in$Circle;
  }
  /**
   * @apilevel internal
   */
  public void in$Circle(boolean b) {
    in$Circle = b;
  }
  /**
   * @apilevel internal
   */
  public boolean is$Final = false;
  /**
   * @apilevel internal
   */
  public boolean is$Final() { return is$Final; }
  /**
   * @apilevel internal
   */
  public void is$Final(boolean b) { is$Final = b; }
  /**
   * @apilevel low-level
   */
  public T getChild(int i) {

    ASTNode node = this.getChildNoTransform(i);
    if(node == null) {
      return null;
    }
    if(node.is$Final()) {
      return (T) node;
    }
    if(!node.mayHaveRewrite()) {
      node.is$Final(this.is$Final());
      return (T) node;
    }
    if(!node.in$Circle()) {
      int rewriteState;
      int num = this.state().boundariesCrossed;
      do {
        this.state().push(ASTNode$State.REWRITE_CHANGE);
        ASTNode oldNode = node;
        oldNode.in$Circle(true);
        node = node.rewriteTo();
        if(node != oldNode) {
          this.setChild(node, i);
        }
        oldNode.in$Circle(false);
        rewriteState = this.state().pop();
      } while(rewriteState == ASTNode$State.REWRITE_CHANGE);
      if(rewriteState == ASTNode$State.REWRITE_NOCHANGE && this.is$Final()) {
        node.is$Final(true);
        this.state().boundariesCrossed = num;
      } else {
      }
    } else if(this.is$Final() != node.is$Final()) {
      this.state().boundariesCrossed++;
    } else {
    }
    return (T) node;


  }
  /**
   * @apilevel low-level
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   */
  public final T getChildNoTransform(int i) {
    if (children == null) {
      return null;
    }
    T child = (T)children[i];
    return child;
  }
  /**
   * @apilevel low-level
   */
  protected int numChildren;
  /**
   * @apilevel low-level
   */
  protected int numChildren() {
    return numChildren;
  }
  /**
   * @apilevel low-level
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /**
   * @apilevel low-level
   */
  public void setChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if(i >= numChildren) {
      numChildren = i+1;
    }
    if(node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   */
  public void insertChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[(i+1>4 || !(this instanceof List))?i+1:4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if(i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if(c[j] != null) {
            c[j].childIndex = j;
          }
        }
      }
      children = c;
    }
    numChildren++;
    if(node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /**
   * @apilevel low-level
   */
  public void removeChild(int i) {
    if(children != null) {
      ASTNode child = (ASTNode) children[i];
      if(child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      // Adding a check of this instance to make sure its a List, a move of children doesn't make
      // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
      // and siblings are moved one step to the right, with null at the end.
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        // fix child indices
        for(int j = i; j < numChildren; ++j) {
          if(children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /**
   * @apilevel low-level
   */
  public ASTNode getParent() {
    if(parent != null && ((ASTNode) parent).is$Final() != is$Final()) {
      state().boundariesCrossed++;
    }
    ;
    return (ASTNode) parent;
  }
  /**
   * @apilevel low-level
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /**
   * Line and column information.
   */
  protected int startLine;
  /**
   */
  protected short startColumn;
  /**
   */
  protected int endLine;
  /**
   */
  protected short endColumn;
  /**
   */
  public int getStartLine() {
    return startLine;
  }
  /**
   */
  public short getStartColumn() {
    return startColumn;
  }
  /**
   */
  public int getEndLine() {
    return endLine;
  }
  /**
   */
  public short getEndColumn() {
    return endColumn;
  }
  /**
   */
  public void setStart(int startLine, short startColumn) {
    this.startLine = startLine;
    this.startColumn = startColumn;
  }
  /**
   */
  public void setEnd(int endLine, short endColumn) {
    this.endLine = endLine;
    this.endColumn = endColumn;
  }
  /**
   * @apilevel low-level
   */
  public java.util.Iterator<T> iterator() {
    return new java.util.Iterator<T>() {
      private int counter = 0;
      public boolean hasNext() {
        return counter < getNumChild();
      }
      public T next() {
        if(hasNext())
          return (T)getChild(counter++);
        else
          return null;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
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
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {    if(state().peek() == ASTNode$State.REWRITE_CHANGE) {
      state().pop();
      state().push(ASTNode$State.REWRITE_NOCHANGE);
    }
    return this;
  }  /**
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__inFlows(ASTNode caller, ASTNode child) {
    return getParent().Define_Set_Label__inFlows(this, caller);
  }
  /**
   * @apilevel internal
   */
  public S Define_S_next(ASTNode caller, ASTNode child) {
    return getParent().Define_S_next(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__outFlows(ASTNode caller, ASTNode child) {
    return getParent().Define_Set_Label__outFlows(this, caller);
  }
  /**
   * @apilevel internal
   */
  public int Define_int_nestingLevel(ASTNode caller, ASTNode child) {
    return getParent().Define_int_nestingLevel(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Set<Label> Define_Set_Label__progLabels(ASTNode caller, ASTNode child) {
    return getParent().Define_Set_Label__progLabels(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Set<String> Define_Set_String__progReadVar(ASTNode caller, ASTNode child) {
    return getParent().Define_Set_String__progReadVar(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Label Define_Label_progInitLabel(ASTNode caller, ASTNode child) {
    return getParent().Define_Label_progInitLabel(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Set<String> Define_Set_String__progFV(ASTNode caller, ASTNode child) {
    return getParent().Define_Set_String__progFV(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Program Define_Program_progAST(ASTNode caller, ASTNode child) {
    return getParent().Define_Program_progAST(this, caller);
  }
  /**
   * @apilevel internal
   */
  public FlowGraph<Label,Label> Define_FlowGraph_Label_Label__progCFG(ASTNode caller, ASTNode child) {
    return getParent().Define_FlowGraph_Label_Label__progCFG(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Block Define_Block_itsBlock(ASTNode caller, ASTNode child) {
    return getParent().Define_Block_itsBlock(this, caller);
  }
}
