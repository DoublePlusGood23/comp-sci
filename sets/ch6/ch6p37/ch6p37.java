/*
  Ethan R. Jones
  11-7-2014
  Tower of Hanoi
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class ch6p37 extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
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

    // tower function, this took me like 3 hours at this point. KILL ME

    public void towers(int nDisks, int fromPeg, int tempPeg, int toPeg)
    {
	if(nDisks == 0)
	    {
		return;
	    }
	else
	    {
		towers(nDisks - 1, fromPeg, toPeg, tempPeg);
		oArea.append("" + fromPeg + " -> " + toPeg + "\n");
		towers(nDisks - 1, tempPeg, fromPeg, toPeg);
	    }
    }
    
    public void actionPerformed(ActionEvent e)
    {
	// Call tower() with user's input from iField.
	towers(Integer.parseInt(iField.getText()), 1, 2, 3);
    }
}
