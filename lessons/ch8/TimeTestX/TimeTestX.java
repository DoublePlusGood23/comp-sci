/*
  Ethan R. Jones
  1/15/2015
  Time Test!
*/

import java.awt.*;
import java.awt.event.*;	// ActionListener
import java.applet.*;
import java.text.*;			// Font
import javax.swing.*;

public class TimeTestX extends JApplet implements ActionListener
{
    private Time3 time;
    
    private JLabel hourLabel, minuteLabel, secondLabel;
    private JTextField hourField, minuteField, secondField, displayField;
    private JButton tickButton;

    public void init()
    {
	time = new Time3();

	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());

	hourLabel = new JLabel("Set Hour: ");
	form1.add(hourLabel);

	hourField = new JTextField(4);
	form1.add(hourField);

	minuteLabel = new JLabel("Set Minutes: ");
	form1.add(minuteLabel);

	minuteField = new JTextField(4);
	form1.add(minuteField);

	secondLabel = new JLabel("Set Seconds: ");
	form1.add(secondLabel);

	secondField = new JTextField(4);
	form1.add(secondField);

	displayField = new JTextField(30);
	displayField.setEditable(false);
	form1.add(displayField);

	tickButton = new JButton("Add 1 to seconds");
	form1.add(tickButton);

	hourField.addActionListener(this);
	minuteField.addActionListener(this);

    }

    public void paint(Graphics g)
    {
	
    }

}
