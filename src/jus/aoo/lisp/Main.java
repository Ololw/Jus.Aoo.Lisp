package jus.aoo.lisp;

import grammaire.ParseException;
import grammaire.Reader;

public class Main {
	public static void main(String args []){
		System.out.println("Projet réalisé par : ECHEVET Theo, MANGER Raphael, HOUBRON Adrian et CUZIN Florian\n");
		System.out.println("Bienvenue dans notre interpreteur Lisp\n");
		
		try {
			Reader.Parser();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}