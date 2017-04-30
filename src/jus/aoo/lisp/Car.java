package jus.aoo.lisp;

public class Car extends Subr {
	public static Car car = new Car();
	
	public Sexpr apply(Sexpr e) throws LispException
	{
		
		if(e instanceof Scons)
		{
			return (Sexpr)((Scons) e).CAR();
		}
		else if (e instanceof Nil)
		{
			return e;
		}
		else 
			throw new LispException("Erreur Car"); 
	}
	
	public String toString(){
		return "car";
	}
}
