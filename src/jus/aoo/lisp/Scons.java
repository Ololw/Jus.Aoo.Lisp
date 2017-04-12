package jus.aoo.lisp;

public class Scons implements Liste
{
	private Sexpr car;
	private Sexpr cdr;
	
	public Scons(Sexpr psexpr1, Sexpr psexpr2)
	{
		car = psexpr1;
		cdr = psexpr2;
	}
	
	public Sexpr CAR()
	{
		return car;
	}
	
	public Sexpr CDR()
	{
		return cdr;
	}
	
	
	
}
