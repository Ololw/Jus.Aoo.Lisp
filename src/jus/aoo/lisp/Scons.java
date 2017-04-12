package jus.aoo.lisp;

public class Scons implements Liste
{
	private _Atome car;
	private Sexpr cdr;
	
	public _Atome CAR()
	{
		return car;
	}
	
	public Sexpr CDR()
	{
		return cdr;
	}
	
}
