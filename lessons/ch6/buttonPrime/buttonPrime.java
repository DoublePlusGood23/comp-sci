/*
  Ethan R. Jones
  10-30-2014
  Prime Button Pressing
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class buttonPrime extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
{
    JTextField iField;
    JButton oButton;
    
    
    public void init()
    {
	// Initionalizes all the Applet parts.
	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());
	
	iField = new JTextField(10);
	iField.addActionListener(this);
	form1.add(iField);

	oButton = new JButton("Prime?");
	oButton.addActionListener(this);
	form1.add(oButton);
    }
    
    public void actionPerformed(ActionEvent e)
    {
	String iStr = iField.getText();
	int i = Integer.parseInt(iStr);

	if(fPrime(i) == true)
	    {
		JOptionPane.showMessageDialog(null, i + " is Prime.");
	    }
	else
	    {
		JOptionPane.showMessageDialog(null, i + " is not Prime.");
	    }
    }
    
    public static boolean fPrime(int i)
    {
	if(i <= 3) // Is n 1,2 or 3?
	    {
		return i > 1; // 2 and 3 will be TRUE, 1 will be FALSE
	    }
	else if(i % 2 == 0 || i % 3 == 0) // i % 2 means that an even WILL work so it must be false, checks for 3 multi as well.
	    {
		return false;
	    }
	else
	    {
		for(int x = 5; x * x <= i; x += 6)
		    {
			if(i % x == 0 || i % (x + 2) == 0) // Checking the last remaining numbers.
			    {
				return false;
			    }
		    }
		return true;
	    }
    }
    
}
    
