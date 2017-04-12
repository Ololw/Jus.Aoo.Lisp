package jus.aoo.lisp;

public class Scons implements Liste
{
	private Sexpr car,cdr;
	
	public Sexpr CAR()
	{
		return car;
	}
	
	public Sexpr CDR()
	{
		return cdr;
	}
	
}
