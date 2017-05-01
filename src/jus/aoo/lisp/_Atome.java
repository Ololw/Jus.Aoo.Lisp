package jus.aoo.lisp;

public class _Atome implements Sexpr 
{
	public Sexpr eval() throws LispException {
		return this;		
	}
	public boolean Atom(){
		return true;
	}
	
	public boolean EQ(Sexpr e){
		return this.equals(e);
	}
	
	public Sexpr Cons(Sexpr e){
		return new Scons(this,e);
	}
}
