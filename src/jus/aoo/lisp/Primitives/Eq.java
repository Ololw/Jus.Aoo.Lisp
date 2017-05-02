package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.Nil;
import jus.aoo.lisp.Scons;
import jus.aoo.lisp.Symbole;

public class Eq extends A_Subr 
{
	public static Eq eq = new Eq();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		if(e instanceof Scons)
		{
			I_Sexp car = ((Scons)e).CAR();
			I_Sexp cdr = ((Scons)((Scons)e).CDR()).CAR();
			
			if(((Scons)((Scons)e).CDR()).CDR() instanceof Scons)
				throw new LispException("EQ : Nombres d'arguments incorrect (<2)");
			else
				if(car.toString().equals(cdr.toString())) 
					return new Symbole("t");
				else 
					return  Nil.NIL;			
		}
		else
			throw new LispException("EQ : Necessite une liste d'arguments");
		
	}
	
	public String toString()
	{
		return "eq";
	}
}
