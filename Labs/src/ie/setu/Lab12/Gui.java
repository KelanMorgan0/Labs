package ie.setu.Lab12;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Gui {

	public static void main(String[] args) {
		ListBox snapToGrid = new ListBox();
		
		snapToGrid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		snapToGrid.setSize(400,150);
		snapToGrid.setVisible(true);
		snapToGrid.setLocation(400,400);
	}

}
