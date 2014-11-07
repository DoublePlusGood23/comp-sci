/*
  Ethan R. Jones
  11-5-2014
  Calculate Charges
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class ch6p8 extends JApplet implements ActionListener // ActionListener lets JButton trigger events 
{
    
    JLabel oLabel;
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
	
	oLabel = new JLabel("");
	form1.add(oLabel);

	oArea = new JTextArea();
	form1.add(oArea);
    }

    public double calculateCharges(double i)
    {
	if(i <= 3.00)
	    {
		return 2.00;
	    }
	else
	    {
		i -= 3.0;
		if( ((i * .50) + 2.00) <= 10.00)
		    {
			return ((i * .50) + 2.00);
		    }
		else
		    {
			return 10.00;
		    }
	    }
    }
    
    public void actionPerformed(ActionEvent e)
    {
	oArea.append(oLabel.getText() + "\n");
	oLabel.setText("" + calculateCharges(Math.ceil(Double.parseDouble(iField.getText()))));
    }
}
