/*
Ethan R. Jones
9-30-14
Ch4 P23
*/
import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class ch4p23 extends Applet
{
    String sSide;
    int side;
    int posX = 100;
    int posY = 100;
    
    public void init()
    {
	sSide = JOptionPane.showInputDialog("Enter the size of square.");
	side = Integer.parseInt(sSide);

    }
    
    public void paint(Graphics g)
    {
	// Top of square
	for(int a = 0; a < side; a++)
	    {
		g.drawString("*", (posX + ((a - 1) * 10)), posY);
	    }

	// Bottom of square
	for(int b = 0; b < side; b++)
	    {
		g.drawString("*", (posX + ((b - 1) * 10)), (posY + ((side - 1) * 10)));
	    }
	// Left Side of square
	for(int c = 0; c < side; c++)
	    {
		g.drawString("*", posX - 20, (posY + (c * 10))); 
	    }
	// Right side of square
	for(int d = 0; d < side; d++)
	    {
		g.drawString("*", ((posX + (side * 10)) - 20), (posY + (d * 10 )));
	    }
    }
}
