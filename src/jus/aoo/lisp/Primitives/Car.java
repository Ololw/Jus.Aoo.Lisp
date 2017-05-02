package jus.aoo.lisp.Primitives;

import jus.aoo.lisp.I_Sexp;
import jus.aoo.lisp.LispException;
import jus.aoo.lisp.Nil;
import jus.aoo.lisp.Scons;
import jus.aoo.lisp.Atome;
import jus.aoo.lisp.I_Liste;

public class Car extends A_Subr 
{
	public static Car car = new Car();
	
	public I_Sexp apply(I_Sexp e) throws LispException
	{
		
		if(e instanceof I_Liste)
		{	if((((Scons) e).CDR() instanceof Nil) && !(((Scons) e).CAR() instanceof Nil))
				throw new LispException("CAR : Necessite une liste");
			else 
				return ((Scons) e).CAR();
		}
		else 
			throw new LispException("CAR : Necessite une liste"); 
	}
	
	public String toString()
	{
		return "car";
	}
}
