package lisp;

public interface Sexpr {

	/**
	 * 
	 * @return la Sexpression resultat de l'evaluation de car
	 */
	public Sexpr car() throws LispException;

	/**
	 * 
	 * @return la Sexpression resultat de l'evaluation de cdr
	 */
	public Sexpr cdr() throws LispException;

	/**
	 * 
	 * @return le resultat de l'evaluation de la Sexpression
	 */
	public Sexpr eval() throws LispException;

}