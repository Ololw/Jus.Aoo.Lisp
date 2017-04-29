package lisp.func.subr;

import lisp.LispException;
import lisp.SCons;
import lisp.Sexpr;
import lisp.func.Subr;

public class Cons extends Subr {

	@Override
	public int ArgCount() {
		return 2;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		return new SCons(args.car(), args.cdr());

	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}
}
