
package jus.aoo.lisp;

public class Cdr extends Subr {
	public static Cdr cdr = new Cdr();
	
	public Sexpr apply(Sexpr e) throws LispException{
		if(e instanceof Scons)
		{
			return ((Scons) e).CDR();
		}
		else if (e instanceof Nil)
		{
			return e;
		}
		else 
			throw new LispException("Erreur Cdr");
	}
	
	public String toString(){
		return "cdr";
	}
}
