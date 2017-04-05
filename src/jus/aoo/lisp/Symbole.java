package jus.aoo.lisp;

import java.util.Map;

public class Symbole extends _Atome
{
	private String symbole;
	static Map<String, Symbole> mem_sym;
	
	protected  Symbole(String ps)
	{
		if (!mem_sym.containsKey(ps))
		{
			if (!(ps.contains("'")|ps.contains(" ")|ps.contains("(")|ps.contains(")")))
			{
				symbole = ps;
				mem_sym.put(ps,this);
			}
		}
	}
}
