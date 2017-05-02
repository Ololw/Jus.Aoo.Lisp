package jus.aoo.lisp;


public class Symbole extends Atome
{
	private String symbole;
	
	public  Symbole(String ps)
	{
		symbole = ps;	
	}
	
	@Override
	public String toString()
	{
		return symbole;
	}
	
	public I_Sexp eval()
	{
		I_Sexp val;
		if (Contexte.EstDansContexte(symbole)) 
		{
			val = Contexte.get_value(symbole);
			return val;
		}
		else
		{
			return this;
		}
		
	}
}
