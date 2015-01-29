package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class UnaryMinusExpressionTest {
	
	private static Interpreter interpreter;
	
	private static UnaryMinusExpression unex;
	private static Expression expa;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}

	@Test
	public void testInterpret() {
		IntegerValue iv = interpreter.interpret("-5");
		assertEquals("-5", -5, iv.getIntValue().intValue());
	}

	@Test
	public void testUnaryMinusExpression() {
		unex = new UnaryMinusExpression(expa);
		assertNotNull("Class Setup",unex);
	}

}
