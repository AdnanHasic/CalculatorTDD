
public class Calculator {
	
	public int sumOfNumbers(int number1, int number2) {
		
		return number1 + number2;
	}
	
	public int subtractingTwoDigts(int number1, int number2) {
		
		return number1 - number2;
	}
	
	public int multiplyingTwoDigit(int number1, int number2) {
		
		return number1 * number2;
	}
	
	public double dividingByTwoDigit(double number1, double number2) throws Exception {
		
		if (number1 == 0 || number2 == 0) {
			throw new Exception();
		}
		else {
			return number1 / number2;
		}
	}

}
