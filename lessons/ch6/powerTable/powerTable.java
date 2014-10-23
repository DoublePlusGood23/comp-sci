/*
Ethan R. Jones
10-23-2014
PowerTable (J?)Applet
*/

import java.awt.*; // Container (Graphics.)
import java.applet.*;
import javax.swing.*; // JTextArea & JApplet.

public class powerTable extends JApplet 
{
    public void init()
    {
	String output = "";
	double q;

	JTextArea outputArea = new JTextArea();
	Container container = getContentPane(); // Get applet's GUI component display area.
	
	container.add(outputArea);
	
	for(int x = 0; x <= 10; x++)
	    {
		q = x / 10.0;
		output += x + "\t" + square(q) + "\t" + cubed(x) + "\t" + "\n";
	    }
	outputArea.setText(output);
    }
    
    public int square(int x)
    {
	return x * x;
    }
    public double square(double y)
    {
	return y * y;
    }
    
    public int cubed(int z)
    {
	return z * z * z;
    }
}
