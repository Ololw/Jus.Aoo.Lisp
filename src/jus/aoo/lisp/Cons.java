package jus.aoo.lisp;

public class Cons extends Subr {

	public static Cons cons = new Cons();
	
	@Override
	public Sexpr apply(Sexpr e) throws LispException{
		Sexpr a = ((Scons)e).CAR();
		Sexpr b = ((Scons)((Scons)e).CDR()).CAR();
		if (b instanceof Liste)
			return new Scons(a,((Scons)b).CAR());
		else 
			throw new LispException("probleme cons");
	}
	
	
	public String toString(){
		return "cons";
		}

}