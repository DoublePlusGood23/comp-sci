/*
Ethan R. Jones
10-20-2014
ch3p10
*/

import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class ch3p10 extends Applet 
{
    public void init()
    {
	/*
	double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
	System.out.println("Radius: " + radius + "\nDiameter: " + radius * 2.0 + "\nCircumference: " + 2.0 * Math.PI * radius + "\nArea: " + Math.PI * Math.pow(radius, 2));
	*/
    }

    public void paint(Graphics g)
    {
	double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius"));
	g.drawString("Radius: " + radius , 25, 20);
	g.drawString("Diameter: " + radius * 2.0, 25, 40); 
	g.drawString("Circumference: " + 2.0 * Math.PI * radius, 25, 60);  
	g.drawString("Area: " + Math.PI * Math.pow(radius, 2), 25, 80);
    }
}
