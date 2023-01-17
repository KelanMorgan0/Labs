package ie.setu.Lab12;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;

public class ListBox extends JFrame{
	private JCheckBox snapToGrid;
	private JCheckBox showGrid;
	private JLabel xLabel;
	private JLabel yLabel;
	private JTextField x;
	private JTextField y;
	private JButton ok;
	private JButton cancel;
	private JButton help;
	private GridBagConstraints grid;
	private JPanel p;
	private JPanel p2;
	
	public ListBox() {
		super("Align");
		setLayout(new FlowLayout());
		
		grid = new GridBagConstraints();
		p = new JPanel(new GridBagLayout());
		p2 = new JPanel(new GridBagLayout());
		
		snapToGrid = new JCheckBox(" snap To Grid");
		grid.gridx = 0;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(snapToGrid, grid);
		
		showGrid = new JCheckBox(" show grid");
		grid.gridx = 0;
		grid.gridy = 1;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(showGrid, grid);
		
		xLabel = new JLabel("  X: ");
		grid.gridx = 1;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(xLabel, grid);
		
		x = new JTextField();
		x.setPreferredSize(new Dimension(100, 20));
		grid.gridx = 2;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(x, grid);
		
		yLabel = new JLabel("  Y: ");
		grid.gridx = 1;
		grid.gridy = 1;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(yLabel, grid);
		
		y = new JTextField();
		x.setPreferredSize(new Dimension(100, 20));
		grid.gridx = 2;
		grid.gridy = 1;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p.add(y, grid);
		
		ok = new JButton();
		ok.setText("OK");
		ok.setPreferredSize(new DimensionUIResource(100, 30));
		grid.gridx = 0;
		grid.gridy = 0;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p2.add(ok, grid);
		
		cancel = new JButton();
		cancel.setText("cancel");
		cancel.setPreferredSize(new DimensionUIResource(100, 30));
		grid.gridx = 0;
		grid.gridy = 1;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p2.add(cancel, grid);
		
		help = new JButton();
		help.setText("help");
		help.setPreferredSize(new DimensionUIResource(100, 30));
		grid.gridx = 0;
		grid.gridy = 2;
		grid.fill = GridBagConstraints.HORIZONTAL;
		p2.add(help, grid);
		
		add(p);
		add(p2);
	}
	
}
