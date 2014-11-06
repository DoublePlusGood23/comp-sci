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
    
    JLabel oLabel, rLabel;
    JTextField iField;
    
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

	/*
	rLabel = new JLabel("Hello!");
	form1.add(rLabel);
	*/
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
	String i = iField.getText();
	double total = calculateCharges(Math.ceil(Double.parseDouble(i)));
	
	oLabel.setText("Total Paid: "+ total);
    }
}
