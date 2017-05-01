package jus.aoo.lisp;


public interface Sexpr 
{
	public boolean Atom();
	public boolean EQ(Sexpr e);
	public Sexpr eval() throws LispException ;
}
