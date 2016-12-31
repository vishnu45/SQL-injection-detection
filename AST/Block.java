package AST;

import java.util.*;
import utility.SetRepUtility;
import utility.FlowGraph;
import java.util.Set;
import java.util.Map;
import utility.Pair;
import AST.*;
import utility.PPUtility;
/** Blocks are kinds of control flow graph nodes. 
 * @ast interface
 * @aspect CFG
 * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\CFG.jrag:32
 */
public interface Block {

		 
		Set<Label> inFlows();

		 
		Set<Label> outFlows();

		 
		Label getLabelAST();
public boolean equals(Object oth);

public int hashCode();

  /** The kill function for Initial Taint Analysis 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:12
   */
  public Set<Map.Entry> killIT();
  /** The gen function for Inital Taint Analysis 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:23
   */
  public Set<Map.Entry> genIT();
  /** Compute the entry information for the IT analysis. 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:38
   */
  public Set<Map.Entry> ITentry();
  /** Compute the exit information for the IT analysis. 
   * @attribute syn
   * @aspect IT
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\IT.jrag:51
   */
  public Set<Map.Entry> ITexit();
  /** The kill function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:8
   */
  public Set<Map.Entry> killRD();
  /** The gen function for reaching definitions. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:19
   */
  public Set<Map.Entry> genRD();
  /** Compute the entry information for the RD analysis. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:28
   */
  public Set<Map.Entry> RDentry();
  /** Compute the exit information for the RD analysis. 
   * @attribute syn
   * @aspect RD
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\RD.jrag:43
   */
  public Set<Map.Entry> RDexit();
  /** The kill function for Taint Location Analysis 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:8
   */
  public Set<Map.Entry> killTL();
  /** The gen function for Taint Location Analysis 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:20
   */
  public Set<Map.Entry> genTL();
  /** Compute the entry information for the TL analysis. 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:51
   */
  public Set<Map.Entry> TLentry();
  /** Compute the exit information for the TL analysis. 
   * @attribute syn
   * @aspect TL
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TL.jrag:66
   */
  public Set<Map.Entry> TLexit();
  /** The kill function for Taint Variable analysis 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:14
   */
  public Set<Map.Entry> killTV();
  /** The gen function for Taint Variable analysis 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:26
   */
  public Set<Map.Entry> genTV();
  /** Compute the entry information for the TV analysis. 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:59
   */
  public Set<Map.Entry> TVentry();
  /** Compute the exit information for the TV analysis. 
   * @attribute syn
   * @aspect TV
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\TV.jrag:72
   */
  public Set<Map.Entry> TVexit();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:11
   */
  public Set<Label> progLabels();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:15
   */
  public Set<String> progReadVar();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:19
   */
  public Label progInitLabel();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:23
   */
  public Set<String> progFV();
  /**
   * @attribute inh
   * @aspect ProgramGlobalAttributes
   * @declaredat C:\\Users\\vishnu\\Documents\\GitHub\\SQL-injection-detection\\spec\\ProgramGlobalAttributes.jrag:32
   */
  public FlowGraph<Label,Label> progCFG();
}
