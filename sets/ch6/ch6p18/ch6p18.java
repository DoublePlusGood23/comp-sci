/*
  Ethan R. Jones
  11-6-2014
  Square of Asterisks
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class ch6p18 extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
{
    
    JTextField iField;
    JTextArea oArea;
    
    public void init()
    {
	// Initionalizes all the Applet parts.
	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());
	
	iField = new JTextField(10);
	iField.addActionListener(this);
	form1.add(iField);

	oArea = new JTextArea();
	form1.add(oArea);
    }

    public void squareOfAsterisks(int i)
    {
	for(int x = 1; i >= x; x++)
	    {
		for(int y = 1; i >= y; y++)
		    {
			oArea.append(" * ");
		    }
		oArea.append("\n");
	    }
			
    }
    
    public void actionPerformed(ActionEvent e)
    {
	squareOfAsterisks(Integer.parseInt(iField.getText()));
    }
}
