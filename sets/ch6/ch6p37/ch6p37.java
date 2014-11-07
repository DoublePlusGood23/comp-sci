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

    // tower function, tower(Number of disks, Intinal peg, Disks being move to peg, Temporary holding peg)
    public static String towers(int nDisks, int fromPeg, int toPeg, int tempPeg)
    {
	String s1, s2, s3;
	
	if(nDisks == 1)
	    {
		return fromPeg + " → " + toPeg + "\n";
	    }
	else
	    {
		tempPeg = 6 - fromPeg - toPeg;
		s1 = towers(nDisks - 1, fromPeg, tempPeg, toPeg);
		s2 = fromPeg + " → " + toPeg + "\n";
		s3 = towers(nDisks - 1, tempPeg, fromPeg, toPeg);
	    }
	return s1 + s2 + s3;
    }
	
    public void actionPerformed(ActionEvent e)
    {
	// Call tower() with user's input from iField.
	oArea.append(towers(Integer.parseInt(iField.getText()), 1, 3, 2));
    }
}
