package bbarrantes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

	// creates model and view to be used inside this class
	private CalcModel model;
	private CalcView view;

	public CalcController(CalcModel m, CalcView v) {

		// setting the model and view to be equal to the ones we created in the driver and passed into the constructor
		this.model = m;
		this.view = v;

		// setting up the action listeners
		this.view.addAddListener(new addListener());
		this.view.addSubtractListener(new subtractListener());
		this.view.addMultiplyListener(new multiplyListener());
		this.view.addDivideListener(new divideListener());
		this.view.addClearListener(new clearListener());
	}
	
	// add listener with try catch for error handling (invalid number/non-numeric characters)
	class addListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int userInput, total;

			try {
				// gets the input and total from the view
				userInput = view.getInput();
				total = view.getTotal();

				// sends those values to the model
				model.add(userInput, total);

				// gets the total from the model to be sent back to the view
				view.setTotal(model.getTotal());

				// calls the error message method in the view and displays the string passed into the method
			} catch (NumberFormatException nex) {
				view.displayErrorMessage("Invalid Input");
			}

		}
	}
	
	// multiply listener with try catch for error handling (invalid number/non-numeric characters)
	class subtractListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int userInput, total;

			try {
				// gets the input and total from the view
				userInput = view.getInput();
				total = view.getTotal();

				// sends those values to the model
				model.subtract(userInput, total);

				// gets the total from the model to be sent back to the view
				view.setTotal(model.getTotal());

				// calls the error message method in the view and displays the string passed into the method
			} catch (NumberFormatException nex) {
				view.displayErrorMessage("Invalid Input");
			}

		}
	}

	// multiply listener with try catch for error handling (invalid number/non-numeric characters)
	class multiplyListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int userInput, total;

			try {
				// gets the input and total from the view
				userInput = view.getInput();
				total = view.getTotal();

				// sends those values to the model
				model.multiply(userInput, total);

				// gets the total from the model to be sent back to the view
				view.setTotal(model.getTotal());

				// calls the error message method in the view and displays the string passed into the method
			} catch (NumberFormatException nex) {
				view.displayErrorMessage("Invalid Input");
			}

		}
	}
	
	// multiply listener with try catch for error handling (invalid number/non-numeric characters)
	class divideListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int userInput, total;

			try {
				// gets the input and total from the view
				userInput = view.getInput();
				total = view.getTotal();

				// sends those values to the model
				model.divide(userInput, total);

				// gets the total from the model to be sent back to the view
				view.setTotal(model.getTotal());

				// calls the error message method in the view and displays the string passed into the method
			} catch (NumberFormatException nex) {
				view.displayErrorMessage("Invalid Input");
			}

		}
	}

	// clears text fields in the GUI
	class clearListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			    view.setTotal(1);
			    view.clearInput();
		}
	}
}
