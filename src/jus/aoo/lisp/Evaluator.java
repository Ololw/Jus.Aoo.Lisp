package jus.aoo.lisp;

public interface Evaluator {
	public Sexpr apply(Sexpr e) throws LispException;
}
