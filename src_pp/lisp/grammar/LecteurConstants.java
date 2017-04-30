/* Generated By:JavaCC: Do not edit this line. LecteurConstants.java */
package lisp.grammar;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface LecteurConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SL_COMMENT = 37;
  /** RegularExpression Id. */
  int ML_COMMENT = 38;
  /** RegularExpression Id. */
  int PAROUV = 40;
  /** RegularExpression Id. */
  int PARFERM = 41;
  /** RegularExpression Id. */
  int POINT = 42;
  /** RegularExpression Id. */
  int ID = 43;
  /** RegularExpression Id. */
  int QUOTE = 44;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_SL_COMMENT = 1;
  /** Lexical state. */
  int IN_ML_COMMENT = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"\\u0000\"",
    "\"\\b\"",
    "\"\\u0013\"",
    "\"\\u001b\"",
    "\"\\u0001\"",
    "\"\\u000b\"",
    "\"\\u0014\"",
    "\"\\u001c\"",
    "\"\\u0002\"",
    "\"\\f\"",
    "\"\\u0015\"",
    "\"\\u001d\"",
    "\"\\u0003\"",
    "\"\\u000e\"",
    "\"\\u0016\"",
    "\"\\u001e\"",
    "\"\\u0004\"",
    "\"\\u000f\"",
    "\"\\u0017\"",
    "\"\\u001f\"",
    "\"\\u0005\"",
    "\"\\u0010\"",
    "\"\\u0018\"",
    "\"\\u007f\"",
    "\"\\u0006\"",
    "\"\\u0011\"",
    "\"\\u0019\"",
    "\"\\u0007\"",
    "\"\\u0012\"",
    "\"\\u001a\"",
    "\"//\"",
    "\"/*\"",
    "<SL_COMMENT>",
    "\"*/\"",
    "<token of kind 39>",
    "\"(\"",
    "\")\"",
    "\".\"",
    "<ID>",
    "\"\\\'\"",
  };

}