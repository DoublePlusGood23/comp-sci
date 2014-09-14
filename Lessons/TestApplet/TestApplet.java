/**
 * @(#)TestApplet.java
 *
 * TestApplet Applet application
 *
 * @author
 * @version 1.00 2014/9/8
 */

import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class TestApplet extends Applet
{
	// Declare these globally, as they are used in both init and paint.

	int num1, num2, sum;

	public void init()
	{
		// Not declaring globally. No reason to make them public.
		String sNum1 = JOptionPane.showInputDialog("Enter first number.");
		String sNum2 = JOptionPane.showInputDialog("Enter second number.");

		num1 = Integer.parseInt(sNum1);
		num2 = Integer.parseInt(sNum2);

		sum = num1 + num2;
	}

	public void paint(Graphics g)
	{
		g.drawString("The sum of " + num1 + " and " + num2 + " is " + sum , 50, 50);
		// g.drawRect(left, top, width, height)
		g.drawRect(50, num1, num2, sum);
		g.drawOval(80, num2, num1, sum);
		g.drawOval(80, sum, num1, num2);
	}
}
