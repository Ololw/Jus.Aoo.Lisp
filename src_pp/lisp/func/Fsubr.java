package lisp.func;

import lisp.LispException;
import lisp.Nil;
import lisp.Sexpr;

public abstract class Fsubr extends Primitive {

	public Sexpr evaluate(Function f, Sexpr args) throws LispException {
		Sexpr s = args;
		int paramNb = 0;
		//while (s != Nil.NIL) {s = s.cdr();paramNb++;}
		//if (paramNb != f.ArgCount()) throw new LispException("Le nombre de parametres est incorrect");

		return f.apply(args);

	}

}
