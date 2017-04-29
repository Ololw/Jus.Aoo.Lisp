package lisp;


public abstract class Atom implements Sexpr {

	@Override
	// le car d'un atome n'existe pas
	public Sexpr car() throws LispException {
		throw new LispException("Atom has no car");
	}

	@Override
	// le cdr d'un atome n'existe pas
	public Sexpr cdr() throws LispException {
		throw new LispException("Atom has no cdr");
	}

}
