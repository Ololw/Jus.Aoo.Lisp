package lisp.func.subr;

import lisp.LispException;
import lisp.Nil;
import lisp.Sexpr;
import lisp.func.Subr;

public class Print extends Subr {

	@Override
	public int ArgCount() {
		return Integer.MAX_VALUE;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		Sexpr s, lastArg = null;

		s = args;
		while (s != Nil.NIL) {
			if (s.cdr() == Nil.NIL)
				lastArg = s.car();
			s = s.cdr();
		}
		System.out.println(args.toString());
		return lastArg;
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
