package bbarrantes;

public class CalcModel {
	private int result;

	// multiply method
	public void add(int num1, int num2) {
		int sum = num1 + num2;

		result = sum;
	}

	// multiply method
	public void subtract(int num1, int num2) {
		int sum = num1 - num2;

		result = sum;
	}

	// multiply method
	public void multiply(int num1, int num2) {
		int product = num1 * num2;

		result = product;
	}

	// multiply method
	public void divide(int num1, int num2) {
		int product = num1 / num2;

		result = product;
	}

	// getter for total to be used by controller
	public int getTotal() {
		return result;
	}
}
