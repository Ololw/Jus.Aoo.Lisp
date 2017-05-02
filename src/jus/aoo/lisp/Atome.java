package jus.aoo.lisp;

public class Atome implements I_Sexp 
{
	public I_Sexp eval() throws LispException 
	{
		return this;		
	}
	
	public boolean Atom()
	{
		return true;
	}
	
	public boolean EQ(I_Sexp e)
	{
		return this==(e);
	}
	
	public I_Sexp Cons(I_Sexp e)
	{
		return new Scons(this,e);
	}
}
