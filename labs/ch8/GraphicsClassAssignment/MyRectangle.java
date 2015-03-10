// MyRectangle Class - Draws a rectangle!

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color myColor;
    private boolean filled;
    

    // Specific constructor
    public MyRectangle(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
	this.x1 = x1;	// this.x1 is the class member, just x1 is the parameter
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
	this.myColor = myColor;
	this.filled = filled;
    }

    public void draw(Graphics g)
    {
	g.setColor(myColor);
	g.drawRect(x1,y1, Math.abs(x1 - y2), Math.abs(x2 - y1));
	if(filled = true)
	    {
		g.fillRect(x1,y1, Math.abs(x1 - y1), Math.abs(x2 - y1));
	    }
    }
}
