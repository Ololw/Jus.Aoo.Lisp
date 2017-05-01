package jus.aoo.lisp;

import java.util.HashMap;

public class Symbole extends _Atome
{
	private String symbole;
	static HashMap<String, Symbole> mem_sym;
	
	public static void init_mem()
	{
		mem_sym = new HashMap<String,Symbole>();
	}
	
	public  Symbole(String ps)
	{
		if (!mem_sym.containsKey(ps))
		{
			mem_sym.put(symbole,this);
		}
		symbole = ps;
		
	}
	
	@Override
	public String toString()
	{
		return symbole;
	}
	
}
