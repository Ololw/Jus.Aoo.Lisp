package lisp.vm;

import java.io.Console;
import java.io.Serializable;

import lisp.LispException;
import lisp.grammar.Lecteur;

@SuppressWarnings("serial")
public class LVM implements Serializable {

	public LVM() {
		while (true) {
			System.out.print(">");
			try {
				System.out.println(Lecteur.read().eval());
			} catch (LispException le) {
				System.out.println(le.getMessage());
			} catch (Exception e) {
				System.out.println("Unexpected Exception");
				e.printStackTrace();
			} finally {

			}

		}
	}

}
