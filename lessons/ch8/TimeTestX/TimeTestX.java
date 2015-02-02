/**
 * @(#)TimeTestX.java
 *
 * TimeTestX Applet application
 *
 * @author
 * @version 1.00 2015/1/29
 */

import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class TimeTestX extends JApplet implements ActionListener
{
    private Time3 time;

    private JLabel hourLabel, minuteLabel, secondLabel;
    private JTextField hourField, minuteField, secondField, displayField;
    private JButton tickButton, tickButton2;

    public void init()
    {
	time = new Time3();

	Container form1 = getContentPane();
	form1.setLayout(new FlowLayout());

	hourLabel = new JLabel("Set Hour: ");
	form1.add(hourLabel);

	hourField = new JTextField(4);
	form1.add(hourField);

	minuteLabel = new JLabel("Set Minute: ");
	form1.add(minuteLabel);

	minuteField = new JTextField(4);
	form1.add(minuteField);

	secondLabel = new JLabel("Set Second: ");
	form1.add(secondLabel);

	secondField = new JTextField(4);
	form1.add(secondField);

	displayField = new JTextField(30);
	displayField.setEditable(false);
	form1.add(displayField);

	tickButton = new JButton("Add 1 to seconds");
	form1.add(tickButton);

	tickButton2 = new JButton("Subtract 1 from seconds");
	form1.add(tickButton2);

	hourField.addActionListener(this);
	minuteField.addActionListener(this);
	secondField.addActionListener(this);
	tickButton.addActionListener(this);
	tickButton2.addActionListener(this);

	displayTime();
    }

    public void actionPerformed(ActionEvent e)
    {
	if(e.getSource()==tickButton)
	    {
		tick();
	    }
	else if(e.getSource()==tickButton2)
	    {
		decrease();
	    }
	else if(e.getSource()==hourField)
	    {
		time.setHour( Integer.parseInt( hourField.getText() ) );
		hourField.setText("");
	    }
	else if(e.getSource()==minuteField)
	    {
		time.setMinute( Integer.parseInt( minuteField.getText() ) );
		minuteField.setText("");
	    }
	else if(e.getSource()==secondField)
	    {
		time.setSecond( Integer.parseInt( secondField.getText() ) );
		secondField.setText("");
	    }

	displayTime();
    }

    public void displayTime()
    {
	displayField.setText("Hour: " + time.getHour() + " Minute: " + time.getMinute() + " Second: " + time.getSecond());
	showStatus("Standard time: " + time.toStandardString() + " Military time: " + time.toUniversalString());
    }

    public void tick()
    {
	time.setSecond( (time.getSecond() + 1) % 60);
	if(time.getSecond()==0)
	    {
		time.setMinute( (time.getMinute() + 1) % 60);
		    
		if(time.getMinute()==0)
		    {
			time.setHour( (time.getHour() + 1) % 24);
		    }
	    }
		
    }
    public void decrease()
    {
	time.setSecond((time.getSecond() - 1) % 60);
	if(time.getSecond()==-1)
	    {
		time.setMinute(59);
		if(time.getMinute()==-1)
		    {
			time.setHour(59);
		    }
	    }
    }
    
}

