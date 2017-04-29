package lisp.func;

import java.util.ArrayList;
import java.util.List;

import lisp.*;
import lisp.func.fsubr.*;

public abstract class Subr extends Primitive {

	public Sexpr evaluate(Function f, Sexpr args) throws LispException {
		List<Sexpr> largs = new ArrayList<Sexpr>();

		Sexpr a = args;
		Sexpr b;
		int paramNb = 0;
		int i=0;
		while (a != Nil.NIL) { a = a.cdr();paramNb++;}
		System.out.println(""+paramNb);

		if (paramNb < f.ArgCount()) throw new LispException("Le nombre de parametres est incorrect");
		
		a = args;
		System.out.println(a.car());
		while (i<f.ArgCount()) {
			if(a.car().equals(new Symbol("quote"))){
				System.out.println("AAAAAA");
				b= ((Quote)(a.car().eval())).apply(a.cdr().car());
				System.out.println(b.toString());
				largs.add(b);
				a = a.cdr().cdr();
			}
			else{
				System.out.println("BBBBBB");
				if (a instanceof SCons) {
					if (a.car().eval() instanceof Function) {
						largs.add(a.eval());
					}
					else {
						if (a.car().eval() == null)
							throw new LispException("no function " + a.car() + " defined");
						System.out.println(a.car().cdr());
						largs.add(((Fsubr)((a.car().eval()))).apply(a.car().cdr()));
						break;
					}
				} else {
				largs.add(a.car().eval());
			}
			a = a.cdr();
			}
			i++;
		}

		if (largs.size() == 1)
			return f.apply(largs.get(0));
		else {
			Sexpr sexprInConstruction = null;
			int sz = largs.size();
			sexprInConstruction = new SCons(largs.get(sz - 1), Nil.NIL);
			for (int nextSexprIndex = sz - 2; nextSexprIndex >= 0; nextSexprIndex--) {
				sexprInConstruction = new SCons(largs.get(nextSexprIndex),
						sexprInConstruction);
			}

			return f.apply(sexprInConstruction);
		}
	}
}
