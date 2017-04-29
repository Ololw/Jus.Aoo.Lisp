package lisp.vm;

import lisp.Context;
import lisp.LispException;
import lisp.Sexpr;
import lisp.func.*;
import lisp.func.fsubr.*;
import lisp.func.subr.*;
import lisp.grammar.Lecteur;

public class Main {

	public static void main(String[] args) {
		Context.InitContext();
		Context.changeValue("car", new Car());
		Context.changeValue("cdr", new Cdr());
		Context.changeValue("quote", new Quote());
		Context.changeValue("set", new Set());
		
		try {
			Sexpr s = Lecteur.read("(set 'g 345)");
			//System.out.println(s.cdr().cdr());
			//System.out.println((new Car()).apply(s));
			Sexpr s1 = s.eval();
			System.out.println(s1.toString());
		} catch (LispException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
