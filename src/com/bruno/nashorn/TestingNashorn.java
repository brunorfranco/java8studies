package com.bruno.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TestingNashorn {

	public static void main(String[] args) throws ScriptException {
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		Object eval = engine.eval("var test = 'Testing Nashorn'");
		
		System.out.println(eval);
		
	}
}
