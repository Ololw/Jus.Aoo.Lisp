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
	
	@Override
	public String toString(){
		if (cdr instanceof Nil) {
			return "(".concat(car.toString()).concat(")");
		}
		else if (cdr instanceof Symbole) {
			return "(".concat(car.toString()).concat(" . ").concat(cdr.toString()).concat(")");
		}
		return "(".concat(car.toString()).concat(" ").concat(afficher(((Scons)cdr)));
	}
	
	public String afficher(Scons e) {
		if (e.cdr instanceof Nil) {
			return e.car.toString().concat(")");
		}
		else if (e.cdr instanceof Symbole) {
			return "(".concat(e.car.toString()).concat(".").concat(e.cdr.toString()).concat(")");
		}
		return e.car.toString().concat(" ").concat(afficher(((Scons)e.cdr)));
	} 
}
