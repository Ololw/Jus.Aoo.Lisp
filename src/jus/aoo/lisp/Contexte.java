package jus.aoo.lisp;

import java.util.HashMap;

public class Contexte 
{
	private static HashMap<String, I_Sexp> contexte;
	
	public static void init_contexte()
	{
		contexte = new HashMap<String, I_Sexp>();
	}
	
	public static I_Sexp get_value(String ps)
	{
		return contexte.get(ps);
	}
	
	public static boolean EstDansContexte(String s)
	{
		return contexte.containsKey(s);
	}
	
	public static void set_value(String ps, I_Sexp pse)
	{
		contexte.put(ps, pse);
	}
	
	public static void afficher(){
		System.out.println("Etat du contexte :\n " + contexte.toString());
	}
}
