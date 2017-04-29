package lisp.func.subr;

import lisp.LispException;
import lisp.Nil;
import lisp.Sexpr;
import lisp.Symbol;
import lisp.func.Subr;

public class Atom extends Subr {

	@Override
	public int ArgCount() {
		return 1;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		if (args instanceof lisp.Atom)
			return new Symbol("t");

		return Nil.NIL;
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
