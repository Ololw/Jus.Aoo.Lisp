package jus.aoo.lisp;


public interface I_Sexp 
{
	public boolean Atom();
	public boolean EQ(I_Sexp e);
	public I_Sexp eval() throws LispException;
}
