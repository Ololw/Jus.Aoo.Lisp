package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.Contexte;
import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.Scons;
import jus.aoo.lisp.Symbole;

public class Set extends A_Subr 
{

	public static Set set = new Set();
	
	@Override
	public I_Sexp apply(I_Sexp e) throws LispException 
	{
		
		if( e instanceof Scons)
		{
			I_Sexp var = ((Scons)e).CAR();
			I_Sexp arg = ((Scons)((Scons)e).CDR()).CAR();
			
			if (!(var instanceof Symbole))
				throw new LispException("SET : Le premier parametre n'est pas un symbole");
	
			Contexte.set_value(var.toString(),arg.eval());
			return arg.eval();
		}
		else
			throw new LispException("SET : Nécessite une liste d'arguments");
	}
	
	public String toString()
	{
		return "set";
	}
}
