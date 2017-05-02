package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.Atome;
import jus.aoo.lisp.I_Evaluator;
import jus.aoo.lisp.I_Sexp;

public abstract class A_Primitive extends Atome implements I_Evaluator 
{
	public I_Sexp eval()
	{
		return this;
	}
}
