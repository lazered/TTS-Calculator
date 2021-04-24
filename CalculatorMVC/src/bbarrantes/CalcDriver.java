package bbarrantes;

public class CalcDriver {
	
	public static void main(String[] args) {
		
	// creating model and view
	CalcModel Model = new CalcModel();
	
	CalcView View = new CalcView();
	
	// passing model and view into the controller
	CalcController Controller = new CalcController(Model, View);
	
	// setting the view's GUI to be visible
	View.setVisible(true);
	
	}
}
