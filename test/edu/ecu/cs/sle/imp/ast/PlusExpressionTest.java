package edu.ecu.cs.sle.imp.ast;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.interpreter.Interpreter;
import edu.ecu.cs.sle.imp.value.IntegerValue;

public class PlusExpressionTest {

	private static Interpreter interpreter;
	
	private static PlusExpression plusex;
	private static Expression expa;
	private static Expression expb;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testInterpret() {
		IntegerValue iv = interpreter.interpret("6+7");
		assertEquals("6+7", 13, iv.getIntValue().intValue());
	}

	@Test
	public void testPlusExpression() {
		plusex = new PlusExpression(expa,expb);
		assertNotNull("Class Setup",plusex);
	}

}
