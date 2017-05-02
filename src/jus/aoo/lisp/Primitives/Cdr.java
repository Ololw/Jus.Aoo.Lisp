
package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.I_Liste;

public class Cdr extends A_Subr 
{
	public static Cdr cdr = new Cdr();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		if(e instanceof I_Liste)
		{
			return (I_Sexp)((I_Liste) e).CDR();
		}
		else 
			throw new LispException("CDR : Necessite une liste");
	}
	
	public String toString()
	{
		return "cdr";
	}
}
