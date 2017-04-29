package lisp;

import lisp.func.Expr;
import lisp.func.Fexpr;
import lisp.func.Fsubr;
import lisp.func.Function;
import lisp.func.Subr;

public class SCons implements List {

	private Sexpr car;
	private Sexpr cdr;

	public SCons(Sexpr car, Sexpr cdr) {
		this.car = car;
		this.cdr = cdr;
	}

	@Override
	public Sexpr car() throws LispException {
		return this.car;
	}

	@Override
	public Sexpr cdr() throws LispException {
		return this.cdr;
	}

	@Override
	public Sexpr eval() throws LispException {
		Sexpr c = this.car;
		Sexpr d = this.cdr;
		
		//System.out.println(c);
		System.out.println(this.cdr);

		if (c.equals(Nil.NIL))
			throw new LispException("Nil peut pas etre un foncteur");

		if (!(c instanceof SCons) && !(c instanceof Symbol))
			throw new LispException("syntax error in functor name");

		if (c instanceof SCons) {
			if (!(c.car() instanceof Symbol))
				throw new LispException("syntax error in functor name");

			if (((Symbol) c.car()).Name().equals("lambda"))
				return new Expr().apply(new SCons(c.cdr(), this.cdr));
			else if (((Symbol) c.car()).Name().equals("flambda"))
				return new Fexpr().apply(new SCons(c.cdr(), this.cdr));
			else
				return new SCons(c.eval(), this.cdr);

		} else {
			if (c.eval() instanceof Subr){
				return ((Subr) c.eval()).evaluate((Function) c.eval(),d);}
				
			else if (c.eval() instanceof Fsubr)
				return ((Fsubr) c.eval()).evaluate((Function) c.eval(),this.cdr);
			else
				return new SCons(c.eval(), this.cdr.eval());
		}

	}

	public String toString() {
		return this.car.toString() + " . " + this.cdr.toString();
	}

}