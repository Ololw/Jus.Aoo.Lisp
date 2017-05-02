package jus.aoo.lisp;

public interface I_Evaluator 
{
	public I_Sexp apply(I_Sexp e) throws LispException;
}
