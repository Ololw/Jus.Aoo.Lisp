package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;

public class Eval extends A_Subr 
{
	public static Eval eval = new Eval();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
			return e.eval();
	}
	
	public String toString()
	{
		return "eval";
	}
}
