package ie.setu.Lab14;

import javax.swing.JFrame;

import ie.setu.Lab13.GUI;

public class Driver {
	public static void main(String[] args) {
		Gui snapToGrid = new Gui();
		
		snapToGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		snapToGrid.setSize(400,150);
		snapToGrid.setVisible(true);
		snapToGrid.setLocation(400,400);
	}
}
