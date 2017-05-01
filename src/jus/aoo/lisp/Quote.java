package jus.aoo.lisp;


public class Quote extends Fsubr {
	public static Quote quote = new Quote();
	
	public Sexpr apply(Sexpr e) throws LispException{
			return e;
	}
	
	public String toString(){
		return "quote";
	}
}
