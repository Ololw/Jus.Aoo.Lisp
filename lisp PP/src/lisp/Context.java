package lisp;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class Context {

	private static Hashtable<String, Sexpr> globalContext;
	private static Stack<Hashtable<String, Sexpr>> savedContexts;

	private static Context ref;

	private Context() {
		globalContext = new Hashtable<String, Sexpr>();
		savedContexts = new Stack<Hashtable<String, Sexpr>>();
	}

	/*
	 * public static Context getContext() { if (ref == null) ref = new
	 * Context(); return ref; }
	 */

	public static void InitContext() {
		globalContext = new Hashtable<String, Sexpr>();
		savedContexts = new Stack<Hashtable<String, Sexpr>>();
	}

	public static Sexpr lookupValue(String name) {
		return globalContext.get(name);
	}

	/**
	 * 
	 * @param callContext
	 * @return true if any mappings were saved in the stack in the process,
	 *         false otherwise.
	 */
	public static Boolean addCallContext(Map<String, Sexpr> callContext) {
		Boolean savedAny = false;
		Hashtable<String, Sexpr> saveContext = new Hashtable<String, Sexpr>();
		for (Entry<String, Sexpr> mapping : callContext.entrySet()) {
			String name = mapping.getKey();
			Sexpr value = mapping.getValue();
			if (globalContext.get(name) != null) {
				saveContext.put(name, value);
			}
		}
		if (!saveContext.isEmpty()) {
			savedContexts.push(saveContext);
			savedAny = true;
		}

		globalContext.putAll(callContext);
		return savedAny;
	}

	public static void restoreContext() {
		Map<String, Sexpr> lastSavedContext = savedContexts.pop();
		globalContext.putAll(lastSavedContext);
	}

	public static void changeValue(String name, Sexpr newValue) {
		globalContext.put(name, newValue);
	}
}
