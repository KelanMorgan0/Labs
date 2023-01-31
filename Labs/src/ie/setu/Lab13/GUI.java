package ie.setu.Lab13;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class GUI extends JFrame {
	private JCheckBox background;
	private JCheckBox foreground;
	private JComboBox colours;
	private JButton ok;
	private JButton cancel;
	private GridBagConstraints grid;
	private JPanel p;
	private JPanel p2;
	private JPanel p3;
	private String[] colour = {"Red", "Green", "Blue"};
	
	public GUI() {
		super("Align");
		setLayout(new FlowLayout());
		
		grid = new GridBagConstraints();
		p = new JPanel(new GridBagLayout());
		p2 = new JPanel(new GridBagLayout());
		p3 = new JPanel(new GridBagLayout());
		
		colours = new JComboBox(colour);
		grid.gridx = 0;
		grid.gridy = 0;
		p.add(colours, grid);
		
		background = new JCheckBox(" background");
		grid.gridx = 0;
		grid.gridy = 0;
		p2.add(background, grid);
		
		foreground = new JCheckBox(" foreground");
		grid.gridx = 1;
		grid.gridy = 0;
		p2.add(foreground, grid);
		
		ok = new JButton();
		ok.setText("OK");
		ok.setPreferredSize(new DimensionUIResource(100, 30));
		grid.gridx = 0;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p3.add(ok, grid);
		
		cancel = new JButton();
		cancel.setText("cancel");
		cancel.setPreferredSize(new DimensionUIResource(100, 30));
		grid.gridx = 1;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p3.add(cancel, grid);
		
		grid.gridx = 0;
		grid.gridy = 1;
		p.add(p2, grid);
		
		grid.gridx = 0;
		grid.gridy = 2;
		p.add(p3, grid);
		
		add(p);
	}
}
