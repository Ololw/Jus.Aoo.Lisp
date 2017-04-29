package lisp;

public class Nil extends Atom implements List {
	public static Nil NIL = new Nil(); 
	
	private Nil() {}

	// car de nil s'evalue a nil
	public Sexpr car() {
		return this;
	}
	
	// cdr de nil s'evalue a nil
	public Sexpr cdr() {
		return this;
	}
	
	@Override
	public Sexpr eval() {
		return this;
	}

		public String toString() {
		return "()";
	}
	
	public boolean equals(Object o) {
		return o instanceof Nil;
	}

}
