package lisp.func.subr;

import lisp.Context;
import lisp.LispException;
import lisp.Sexpr;
import lisp.Symbol;
import lisp.func.Subr;

public class Set extends Subr {

	@Override
	public int ArgCount() {
		return 2;
	}

	@Override
	public Sexpr apply(Sexpr args) throws LispException {
		Sexpr var = args.car();
		if (!(var instanceof Symbol))
			throw new LispException(
					"Le premier parametre de Set ne peut etre qu'un symbole");

		Context.changeValue(args.car().toString(), args.cdr());
		return args.cdr();
	}

	@Override
	public Sexpr eval() throws LispException {
		// TODO Auto-generated method stub
		return null;
	}

}
