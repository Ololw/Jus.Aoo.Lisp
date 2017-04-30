package jus.aoo.lisp;

public class LispException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LispException(String s)
	{
	    System.out.println("Erreur dans la commande Lisp : "+s);
	}
}
