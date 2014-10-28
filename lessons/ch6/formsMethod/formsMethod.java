/*
Ethan R. Jones
10-28-2014
Forms with Methods!
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JLabel, JTextField, JButton 
import java.awt.event.*; // Action listener 

public class formsMethod extends JApplet implements ActionListener // ACtionListener lets JButton trigger events 
{
    JLabel label1;
    JTextField textbox1;
    JButton button1;
    int count = 0; // Sets count to zero
    
    public void init() // All JObjects are set up inside init
    {
       	Container form1 = getContentPane(); // Set up content pane (form) and set the layout of the objects.
	form1.setLayout(new FlowLayout()); // Flow layout will put your objects in the form.

	label1 = new JLabel("Count"); // Create "label box" with text.
	form1.add(label1); // Adds label box to the form.
	
	textbox1 = new JTextField(5); // Create new textbox, '5' is the length of input.
	form1.add(textbox1); // Adds textbox to the form.

	button1 = new JButton("Click Me!"); // Creates new button, sets the button text.
	button1.addActionListener(this); // Adds ActionListener hook to the button
	form1.add(button1); // Adds button to the form.
    }

    public void actionPerformed(ActionEvent e) // This code is activated when the button is clicked.
    {
	count++;
	textbox1.setText("" + count);
    }
}
