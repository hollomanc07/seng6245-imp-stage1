package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class MinusExpressionTest {
	
	private static Interpreter interpreter;
	
	private static MinusExpression minex;
	private static Expression expa;
	private static Expression expb;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}

	@Test
	public void testInterpret() {
		IntegerValue iv = interpreter.interpret("8-3");
		assertEquals("8-3", 5, iv.getIntValue().intValue());
	}

	@Test
	public void testMinusExpression() {
		minex = new MinusExpression(expa,expb);
		assertNotNull("Class Setup",minex);
	}

}
