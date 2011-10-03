package ro.alexbolboaca.TDDPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTests {

	@Test
	public void addWorks(){
		ICalculator calculator = new Calculator();
		
		int result = calculator.add(10, 20);
		
		assertEquals(30, result);
	}
}

