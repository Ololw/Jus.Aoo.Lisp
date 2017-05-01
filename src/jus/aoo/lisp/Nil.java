package jus.aoo.lisp;

public class Nil extends _Atome implements Liste
{
	static Nil NIL = new Nil();
	
	@Override
	public String toString()
	{
		return "Nil";
	}
	
	
}
