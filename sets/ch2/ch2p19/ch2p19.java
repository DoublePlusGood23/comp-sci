// Ethan Jones
// 9-10-14
// Ch2 P19

import javax.swing.*;
public class ch2p19
{
    public static void main(String args[])
    {
	String sRadius = JOptionPane.showInputDialog(null, "Enter radius of circle.");
	double radius = Double.parseDouble(sRadius);
	JOptionPane.showOutputDialog("Diameter: " + (2*radius) + " Circumference: " + (2*Math.PI*radius) + " Area: " + Math.PI*(radius * radius)); 
    }
}