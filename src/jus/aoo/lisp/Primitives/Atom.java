package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.Atome;
import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.Nil;
import jus.aoo.lisp.Scons;
import jus.aoo.lisp.Symbole;

public class Atom extends A_Subr 
{
	public static Atom atom = new Atom();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		if(((Scons)e).CAR() instanceof Atome && ((Scons)e).CDR() instanceof Nil)
			return new Symbole("t");
		else 
			return Nil.NIL;
	}
	
	public String toString()
	{
		return "atome";
	}
}
