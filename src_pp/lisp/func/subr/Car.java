package lisp.func.subr;

import lisp.LispException;
import lisp.SCons;
import lisp.Sexpr;
import lisp.func.Subr;
import lisp.Symbol;

public class Car extends Subr {

	@Override
	public int ArgCount() {
		return 1;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		if (!(args instanceof SCons))
			throw new LispException("l'argument de Car doit etre un Scons");
		
		try{
		if(args.car().car().equals(new Symbol("quote"))){
			return args.car().cdr().car();
		}
		} catch(Throwable e ){
			return args.car();
		}
		return args.car();
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}
}
