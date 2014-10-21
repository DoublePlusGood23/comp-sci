/*
Ethan R. Jones
10-20-2014
ch3p15
*/

import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class ch3p15 extends Applet 
{
    public void init()
    {
	
    }

    public void paint(Graphics g)
    {
	int p1 = Integer.parseInt(JOptionPane.showInputDialog("Enter point 1."));
	int p2 = Integer.parseInt(JOptionPane.showInputDialog("Enter point 2."));
	int p3 = Integer.parseInt(JOptionPane.showInputDialog("Enter point 3."));
	int p4 = Integer.parseInt(JOptionPane.showInputDialog("Enter point 4."));
	
	g.drawRect(p1, p2, p3, p4);
    }
}
