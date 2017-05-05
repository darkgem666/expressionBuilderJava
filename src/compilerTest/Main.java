package compilerTest;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) {
		 try {

	            ScriptEngineManager sem = new ScriptEngineManager();
	            ScriptEngine se = sem.getEngineByName("JavaScript");
	            String myExpression = "(2 == 1) || ( 1 == 2) || (1 == 3 ) || ( 1 == 4 && 2 == 3)";
	            System.out.println(se.eval(myExpression));

	        } catch (ScriptException e) {

	            System.out.println("Invalid Expression");
	            e.printStackTrace();

	        }

	}

}
