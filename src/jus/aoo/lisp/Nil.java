package jus.aoo.lisp;

public class Nil extends Atome implements I_Liste
{
	public static Nil NIL = new Nil();
	
	
	public I_Sexp CAR()
	{
		return NIL;
	}
	
	public I_Sexp CDR()
	{
		return NIL;
	}
	

	@Override
	public String toString()
	{
		return "Nil";
	}
	
	
}
