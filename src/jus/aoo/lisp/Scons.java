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
	
	public boolean Atom() {return false;}
	
	public boolean EQ(Sexpr e) {
		return this==(e);
	}

	
	public Sexpr eval() throws LispException {
		Evaluator evaluator;
		Sexpr arg = cdr;
		Sexpr fun = car;
		//Sexpr param=null; // initialisation pour enlever erreur
		//Sexpr forme=Nil.NIL; // initialisation pour enlever erreur
		
		if (fun instanceof _Atome){
		
			if (fun instanceof Primitive)
				evaluator =((Primitive) fun);
			else if(fun instanceof Symbole)
					return new Scons(((Symbole)fun).eval(),arg.eval());
			
			else //if(fun instanceof Nil){
			
				if(!(cdr instanceof Nil))	
					return new Scons(fun.eval(),arg.eval());
				else
					return fun.eval();
			if (fun instanceof Quote)
				return evaluator.apply(arg);
			else
				return evaluator.apply(arg.eval());
			
		}
		
		else if(fun instanceof Scons ){
			if(!(cdr instanceof Nil))	
				return new Scons(fun.eval(),cdr.eval());
			else
				return fun.eval();
		}
		else {/*if(fun instanceof Nil)
				return new Scons(fun.eval(),cdr.eval());*/
			System.out.println(fun.toString());
			throw new LispException("pas un atome en premier");
		}
		
	}
	
	/*public void associerContexte(Sexpr param,Sexpr arg) throws LispException{
		if (param instanceof Scons && arg instanceof Scons){
			Contexte.cont.ajouter(((Scons)param).car.toString(),((Scons)param).car); // vérifier qu'on a bien un Symbole à droite 
			associerContexte(((Scons)param).cdr,((Scons)arg).cdr);
		}    
		else if (!(param instanceof Nil) || !(arg instanceof Nil))
			throw new LispException("3");
			
	}*/
	
	public Scons evalListe () throws LispException{
		if (cdr==Nil.NIL)
			return new Scons(car.eval(),Nil.NIL);
		else if (cdr instanceof Symbole)
			throw new LispException("4");
		else
			return new Scons(car.eval(),((Scons)cdr).evalListe());
	}
	
	public Scons evalListe2 () throws LispException{
		if (cdr==Nil.NIL)
			return new Scons(car,Nil.NIL);
		else if (cdr instanceof Symbole)
			throw new LispException("5");
		else
			return new Scons(car,((Scons)cdr).evalListe2());
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
