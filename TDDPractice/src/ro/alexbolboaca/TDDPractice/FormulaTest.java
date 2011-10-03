package ro.alexbolboaca.TDDPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormulaTest {

	@Test
	public void testAddFormulaWorks(){
		ICalculator calculator = new CalculatorStub();
		((CalculatorStub)calculator).ValueToReturn = 30;
		Formula formula = new Formula("10 + 20", calculator);
		
		int result = formula.evaluate();
		
		assertEquals(30, result);
	}
	
	@Test
	public void evaluateAdditionFormulaCallsAddOnCalculator(){
		ICalculator calculatorMock = new CalculatorMock();
		Formula formula = new Formula("10 + 20", calculatorMock);

		formula.evaluate();

		assertTrue(((CalculatorMock)calculatorMock).AddCalledWith10And20);		
	}
	
	public class Formula{

		private ICalculator calculator;
		private String formulaAsString;

		public Formula(String formulaAsString, ICalculator calculator) {
			this.calculator = calculator;
			this.formulaAsString = formulaAsString;
		}

		public int evaluate() {
			String[] operands = formulaAsString.split("\\+");
			
			return calculator.add(Integer.valueOf(operands[0].trim()), Integer.valueOf(operands[1].trim()));
		}
		
	}
	
}
