package lisp.func.subr;

import lisp.LispException;
import lisp.Nil;
import lisp.SCons;
import lisp.Sexpr;
import lisp.func.Subr;

public class Cdr extends Subr {

	@Override
	public int ArgCount() {
		return 1;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		if (!(args instanceof SCons))
			throw new LispException("l'argument de Car doit etre un Scons");

		return args.cdr();
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
