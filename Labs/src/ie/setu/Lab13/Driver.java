package ie.setu.Lab13;

import javax.swing.JFrame;
import ie.setu.Lab12.ListBox;

public class Driver {
	public static void main(String[] args) {
		GUI snapToGrid = new GUI();
		
		snapToGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		snapToGrid.setSize(400,150);
		snapToGrid.setVisible(true);
		snapToGrid.setLocation(400,400);
	}
}
