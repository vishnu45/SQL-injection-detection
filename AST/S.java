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
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\php.ast:28
 * @production S : {@link ASTNode};

 */
public abstract class S extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel internal
   */
  public S clone() throws CloneNotSupportedException {
    S node = (S) super.clone();
    node.prettyPrint_visited = -1;
    node.toString_visited = -1;
    node.inFlows_visited = -1;
    node.next_visited = -1;
    node.outFlows_visited = -1;
    node.nestingLevel_visited = -1;
    node.progAST_visited = -1;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   */
  public S() {
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
    inFlows_visited = -1;
    next_visited = -1;
    outFlows_visited = -1;
    nestingLevel_visited = -1;
    progAST_visited = -1;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** The initial label of an AST node. 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:8
   */
  public abstract Label init();
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:19
   */
  public abstract Set<Label> finals();
  /** Set of blocks in a statement. 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:45
   */
  public abstract Set<Block> blocks();
  /**
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:81
   */
  public abstract Set<Label> labels();
  /** flows inside of a statement 
   * @attribute syn
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:201
   */
  public abstract FlowGraph<Label, Label> flows();
  /**
   * @attribute syn
   * @aspect FreeVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\FreeVars.jrag:9
   */
  public abstract Set<String> FV();
  /**
   * @attribute syn
   * @aspect ReadVars
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ReadVars.jrag:9
   */
  public abstract Set<String> RV();
  /**
   * @attribute syn
   * @aspect Unparse
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:4
   */
  public abstract String unparse();
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
    try {  return PPUtility.spacesForIndent(nestingLevel()) + unparse();  }
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
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\Unparse.jrag:10
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
  /** Flows into a block.
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:124
   */
  public Set<Label> inFlows() {
    ASTNode$State state = state();
    if (inFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: inFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    inFlows_visited = state().boundariesCrossed;
    Set<Label> inFlows_value = getParent().Define_Set_Label__inFlows(this, null);

    inFlows_visited = -1;
    return inFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int inFlows_visited = -1;
  /** Next statement in a sequence (lexically), null if none.
   * This is a helping attribute for outFlows. 
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:153
   */
  public S next() {
    ASTNode$State state = state();
    if (next_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: next in class: org.jastadd.ast.AST.InhDecl");
    }
    next_visited = state().boundariesCrossed;
    S next_value = getParent().Define_S_next(this, null);

    next_visited = -1;
    return next_value;
  }
  /**
   * @apilevel internal
   */
  protected int next_visited = -1;
  /** Flows out of a block. 
   * @attribute inh
   * @aspect CFG
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:167
   */
  public Set<Label> outFlows() {
    ASTNode$State state = state();
    if (outFlows_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: outFlows in class: org.jastadd.ast.AST.InhDecl");
    }
    outFlows_visited = state().boundariesCrossed;
    Set<Label> outFlows_value = getParent().Define_Set_Label__outFlows(this, null);

    outFlows_visited = -1;
    return outFlows_value;
  }
  /**
   * @apilevel internal
   */
  protected int outFlows_visited = -1;
  /**
   * @attribute inh
   * @aspect PrettyPrint
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\PrettyPrint.jrag:5
   */
  public int nestingLevel() {
    ASTNode$State state = state();
    if (nestingLevel_visited == state().boundariesCrossed) {
      throw new RuntimeException("Circular definition of attr: nestingLevel in class: org.jastadd.ast.AST.InhDecl");
    }
    nestingLevel_visited = state().boundariesCrossed;
    int nestingLevel_value = getParent().Define_int_nestingLevel(this, null);

    nestingLevel_visited = -1;
    return nestingLevel_value;
  }
  /**
   * @apilevel internal
   */
  protected int nestingLevel_visited = -1;
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:27
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
