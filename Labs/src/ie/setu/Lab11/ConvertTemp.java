package ie.setu.Lab11;

import java.awt.Desktop.Action;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		fahrenField.addActionListener(new FahrenheitConvert());
		// Attach listener to text field

		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		celsiusField.addActionListener(new CelsiusConvert());
		// Attach listener to text field

		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor
	
	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
	
	class FahrenheitConvert implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			double celsius = Double.parseDouble(evt.getActionCommand());
			celsius = (celsius-32)*5/9;
			celsius = Math.round(celsius*100.0)/100.0;
			celsiusField.setText(String.valueOf(celsius));
		}

	}
	
	class CelsiusConvert implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			double fahrenheit = Double.parseDouble(evt.getActionCommand());
			fahrenheit = (fahrenheit*9/5)+32;
			fahrenheit = Math.round(fahrenheit*100.0)/100.0;
			fahrenField.setText(String.valueOf(fahrenheit));
		}

	}

}//end class
