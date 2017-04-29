package lisp.func;

import lisp.LispException;
import lisp.Sexpr;

public interface Function {
	
	public int ArgCount();

	public Sexpr apply(Sexpr args) throws LispException;

}
