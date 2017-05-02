package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;

public class Apply extends A_Subr 
{
	public static Apply apply = new Apply();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		return e;
	}
	
	public String toString()
	{
		return "apply";
	}
}
