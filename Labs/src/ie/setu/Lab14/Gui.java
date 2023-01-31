package ie.setu.Lab14;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Gui extends JFrame{
	private JLabel printer;
	private JLabel printerQualityLabel;
	
	private JCheckBox image;
	private JCheckBox text;
	private JCheckBox code;
	private JCheckBox printToFile;
	
	private JRadioButton selection;
	private JRadioButton all;
	private JRadioButton applet;
	
	private JComboBox printQuality;
	
	private JButton ok;
	private JButton cancel;
	private JButton setup;
	private JButton Help;
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	
	private GridBagConstraints grid;
	
	private JPanel root;
	private JPanel p;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	private JPanel p6;
	
	private String[] quality = {"High", "Medium", "Low"};
	
	public Gui() {
		super("Printer");
		setLayout(new FlowLayout());
		
		grid = new GridBagConstraints();
		root = new JPanel(new GridBagLayout());
		p = new JPanel(new GridBagLayout());
		p2 = new JPanel(new GridBagLayout());
		p3 = new JPanel(new GridBagLayout());
		p4 = new JPanel(new GridBagLayout());
		p5 = new JPanel(new GridBagLayout());
		p6 = new JPanel(new GridBagLayout());
		
		//root
		grid.gridx = 0;
		grid.gridy = 0;
		root.add(p, grid);
		
		grid.gridx = 1;
		grid.gridy = 0;
		root.add(p4, grid);
		
		//p1
		grid.gridx = 0;
		grid.gridy = 0;
		p.add(printer, grid);
		
		grid.gridx = 0;
		grid.gridy = 1;
		p.add(p2, grid);
		
		grid.gridx = 0;
		grid.gridy = 2;
		p.add(p3, grid);
		
		//TODO p2
		grid.gridx = 0;
		grid.gridy = 0;
		p2.add(text1, grid);
		
		grid.gridx = 1;
		grid.gridy = 0;
		p2.add(p5, grid);
		
		grid.gridx = 2;
		grid.gridy = 0;
		p2.add(text2, grid);
		
		grid.gridx = 3;
		grid.gridy = 0;
		p2.add(p6, grid);
		
		grid.gridx = 4;
		grid.gridy = 0;
		p2.add(text3, grid);
		
		//TODO p3
		grid.gridx = 0;
		grid.gridy = 0;
		p3.add(printerQualityLabel, grid);
		
		grid.gridx = 1;
		grid.gridy = 0;
		p3.add(printQuality, grid);
		
		grid.gridx = 2;
		grid.gridy = 0;
		p3.add(printToFile, grid);
		
		add(root);
	}
}
