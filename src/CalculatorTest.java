import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c1;

	@Before
	public void setup() {
		
		c1 = new Calculator();
	}
	
	@Test
	public void sumOfNumbersTest_ShouldReturnSumOfNumbers_IfGivenTwoNumbers() {
		
		int result = c1.sumOfNumbers(10, 5);
		
		int expected = 15;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void subtractingTwoDigtsTest_ShouldReturnSubtractingTwoDigit_IfGivenTwoNumbers() {
		
		int result = c1.subtractingTwoDigts(10, 5);
		
		int expected = 5;
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void multiplyingTwoDigitTest_ShouldReturnResultMultiplyingTwoDigit_IfGivenTwoNumbers() {
		
		int result = c1.multiplyingTwoDigit(10, 5);
		
		int expected = 50;
			
		assertEquals(expected, result);
			
	}
	
	

}
