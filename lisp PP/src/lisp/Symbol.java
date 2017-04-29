package lisp;
import lisp.LispException;

public class Symbol extends Atom {
	private String name;

	public Symbol(String name) {
		this.name = name;
	}

	public String Name() {
		return this.name;
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object o) {
		return (o instanceof Symbol) && this.name.equals(((Symbol) o).name);
	}

	public Sexpr eval() throws LispException {
		System.out.println("par la !!!");
		
		try{
			return Context.lookupValue(this.name);
		}
		catch(Exception e){
			throw new LispException("Probleme de contexte.");
		}
		
	}
}
