/*
  Ethan R. Jones
  11-6-2014
  Is Even?
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class ch6p17 extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
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

    public boolean isEven(int i)
    {
	if(i % 2 == 0)
	    {
		return true;
	    }
	else
	    {
		return false;
	    }
    }

    public void actionPerformed(ActionEvent e)
    {
	int i = Integer.parseInt(iField.getText());

	if(isEven(i) == true)
	    {
		oArea.append("" + i + " is even.\n");
	    }
	else
	    {
		oArea.append("" + i + " is odd.\n");
	    }
    }
    
}
