package bbarrantes;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame {
	
	// setting up variables needed for the GUI
	private static final String INITIAL_VALUE = "1";

	private JTextField m_totalTf = new JTextField(10);
	private JTextField m_userInputTf = new JTextField(10);
	private JButton m_addBtn = new JButton("Add");
	private JButton m_subtractBtn = new JButton("Subtract");
	private JButton m_multiplyBtn = new JButton("Multiply");
	private JButton m_divideBtn = new JButton("Divide");
	private JButton m_clearBtn = new JButton("Clear");

	private int m_total; // The total current value state.

	public CalcView() {
		
		// initializes the GUI and sets the total equal to 1
		m_total = 1;
		m_totalTf.setText(INITIAL_VALUE);
		m_totalTf.setEditable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Performs Simple Multiplications");

		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Input"));
		content.add(m_userInputTf);
		content.add(m_addBtn);
		content.add(m_subtractBtn);
		content.add(m_multiplyBtn);
		content.add(m_divideBtn);
		content.add(new JLabel("Total"));
		content.add(m_totalTf);
		content.add(m_clearBtn);

		this.setContentPane(content);
		this.pack();

	}

	// various getters and setters
	public int getInput() {
		return Integer.parseInt(m_userInputTf.getText());
	}

	public int getTotal() {
		return Integer.parseInt(m_totalTf.getText());
	}

	public void setTotal(int total) {
		m_totalTf.setText(Integer.toString(total));
	}
	
	// basically a setter for the user input text field but renamed to clearInput to be more clear since the only time
	// we alter the input text field is when clearing
	public void clearInput() {
		m_userInputTf.setText(null);
	}

	// setting up listeners
	
	void addAddListener(ActionListener listenForAdd) {
		m_addBtn.addActionListener(listenForAdd);
	}
	
	void addSubtractListener(ActionListener listenForSub) {
		m_subtractBtn.addActionListener(listenForSub);
	}
	
	void addMultiplyListener(ActionListener listenForMult) {
		m_multiplyBtn.addActionListener(listenForMult);
	}
	
	void addDivideListener(ActionListener listenForDiv) {
		m_divideBtn.addActionListener(listenForDiv);
	}

	void addClearListener(ActionListener listenForClear) {
		m_clearBtn.addActionListener(listenForClear);
	}

	// error message method
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
