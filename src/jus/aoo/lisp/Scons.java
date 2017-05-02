package jus.aoo.lisp;

import jus.aoo.lisp.Primitives.A_Primitive;
import jus.aoo.lisp.Primitives.Quote;
import jus.aoo.lisp.Primitives.Set;

public class Scons implements I_Liste
{
	private I_Sexp car;
	private I_Sexp cdr;
	
	public Scons(I_Sexp psexpr1, I_Sexp psexpr2)
	{
		car = psexpr1;
		cdr = psexpr2;
	}
	
	public I_Sexp CAR()
	{
		return car;
	}
	
	public I_Sexp CDR()
	{
		return cdr;
	}
	
	public boolean Atom() 
	{
	return false;
	}
	
	public boolean EQ(I_Sexp e) 
	{
		return this==(e);
	}

	
	public I_Sexp eval() throws LispException 
	{
		I_Evaluator evaluator;
		I_Sexp arg = cdr;
		I_Sexp fun = car;
		
		if (fun instanceof Atome)
		{
		
			if (fun instanceof A_Primitive)
				evaluator =((A_Primitive) fun);
				
			else if(fun instanceof Symbole)
					return new Scons(((Symbole)fun).eval(),arg.eval());
			
			else
			
				if((cdr instanceof Scons))	
					return new Scons(fun.eval(),arg.eval());
				else
					return new Scons(fun.eval(),Nil.NIL);
					
			if (fun instanceof Quote || fun instanceof Set)// || fun instanceof Implode || fun instanceof Explode)
				return evaluator.apply(arg);
			else
				return evaluator.apply(arg.eval());
		}
		
		else if(fun instanceof Scons )
		{
			if(!(cdr instanceof Nil))	
				return new Scons(fun.eval(),cdr.eval());
			else
				return fun.eval();
		}
		else 
		{
			System.out.println(fun.toString());
			throw new LispException("SCONS : Le premier argument n'est pas un atome");
		}
	}
		
	@Override
	public String toString()
	{
		if (cdr instanceof Nil) 
		{
			return "(".concat(car.toString()).concat(")");
		}
		else if (cdr instanceof Symbole) 
		{
			return "(".concat(car.toString()).concat(" . ").concat(cdr.toString()).concat(")");
		}
		else 
			return "(".concat(car.toString()).concat(" ").concat((afficher((Scons)cdr)));
	}
	
	public String afficher(Scons e) {
		if (e.cdr instanceof Nil) {
			return e.car.toString().concat(")");
		}
		else if (e.cdr instanceof Symbole) {
			return "(".concat(e.car.toString()).concat(".").concat(e.cdr.toString()).concat(")");
		}
		return e.car.toString().concat(" ").concat(afficher(((Scons)e.cdr)));
	} 
}
