package lisp.func.fsubr;

import lisp.LispException;
import lisp.Sexpr;
import lisp.func.Fsubr;

public class Quote extends Fsubr {

	@Override
	public int ArgCount() {
		return 1;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		System.out.println("CCCCCCC");
		return args;
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}
}