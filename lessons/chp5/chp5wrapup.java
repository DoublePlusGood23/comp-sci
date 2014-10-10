/*
Ethan R. Jones
10-10-14
Chp5 Wrap Up
*/

import javax.swing.*;

public class chp5wrapup
{
    public static void main(String args[])
    {
	JTextArea textbox1 = new JTextArea(5,10);
	JScrollPane scroll1 = new JScrollPane(textbox1);
	
	/*
	  Output the number if divisable by 5 or 3 but not both
	 */
	for(int x = 1; x <= 20; x++)
	    {
		if((x % 3 == 0 ^ x % 5 == 0))
		    {
			textbox1.append(x + "\n");
		    }
	    }
	JOptionPane.showMessageDialog(null, scroll1);
    }
}
 
