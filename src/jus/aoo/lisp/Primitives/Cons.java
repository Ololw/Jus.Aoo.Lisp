package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Liste;
import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.Scons;

public class Cons extends A_Subr 
{

	public static Cons cons = new Cons();
	
	@Override
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		I_Sexp a = ((Scons)e).CAR();
		I_Sexp b = ((Scons)e).CDR();
		
		if (b instanceof Scons)
			return new Scons(a,b);
		else 
			throw new LispException("CONS : Le deuxieme argument n'est pas une liste");
	}
	
	
	public String toString()
	{
		return "cons";
	}

}
