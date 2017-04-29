package lisp.func.subr;

import lisp.Atom;
import lisp.LispException;
import lisp.Nil;
import lisp.SCons;
import lisp.Sexpr;
import lisp.Symbol;
import lisp.func.Subr;

public class Eq extends Subr {

	@Override
	public int ArgCount() {
		return 2;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		Sexpr arg1, arg2;
		arg1 = args.car();
		arg2 = args.cdr();

		if (arg1 instanceof Atom && arg2 instanceof Atom
				|| arg1 instanceof SCons && arg2 instanceof SCons)
			if (arg1.equals(arg2))
				return new Symbol("t");

		return Nil.NIL;
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
