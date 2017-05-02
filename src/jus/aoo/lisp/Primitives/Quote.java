package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;

public class Quote extends A_Fsubr 
{
	public static Quote quote = new Quote();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
			return e;
	}
	
	public String toString()
	{
		return "quote";
	}
}
