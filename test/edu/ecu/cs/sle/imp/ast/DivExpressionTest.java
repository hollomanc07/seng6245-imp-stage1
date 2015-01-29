package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class DivExpressionTest {
	
	private static Interpreter interpreter;
	
	private static DivExpression divex;
	private static Expression expa;
	private static Expression expb;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}

	@Test
	public void testInterpret() {
		IntegerValue iv = interpreter.interpret("4/2");
		assertEquals("4/2", 2, iv.getIntValue().intValue());
	}

	@Test
	public void testDivExpression() {
		divex = new DivExpression(expa,expb);
		assertNotNull("Class Setup",divex);
	}

}
