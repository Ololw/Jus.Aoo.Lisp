package lisp.func.subr;

import lisp.LispException;
import lisp.Sexpr;
import lisp.func.Subr;

public class Quit extends Subr {

	@Override
	public int ArgCount() {
		return 0;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		System.exit(0);
		return null;
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
