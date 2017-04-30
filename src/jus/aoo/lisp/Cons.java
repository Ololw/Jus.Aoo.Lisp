package jus.aoo.lisp;

public class Cons extends Subr {

	public static Cons cons = new Cons();
	private Cons(){};
	
	@Override
	public Sexpr apply(Sexpr e) throws LispException{
		Sexpr a = e.CAR();
		Sexpr b = e.CDR();
		if (b instanceof Scons && ((Scons) b).CDR() instanceof Nil) {
			return new Scons(a,((Scons)b).CAR());
		}
		
		throw new LispException("Erreur Cons");
	}
	
	
	public String toString(){
		return "cons";
		}

}

public class Cons extends Subr {
	public static Cons cons = new Cons();
	
	public SExpr apply(SExpr a, SExpr b) throws ListException{
		
		return Scons(a,b);
	}
	
	public String toString(){
		return "cons";
	}
}
