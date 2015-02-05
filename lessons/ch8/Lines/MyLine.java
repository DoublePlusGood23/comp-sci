/*
  Ethan R. Jones
  2-5-15
  MyLine class of Lines project. (Line segements acttually.)
*/

import java.awt.Color;
import java.awt.Graphics;

public class MyLine
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private Color myColor;

    // Speific Constructor
    public MyLine(int x1, int y1, int x2, int y2, Color myColor);
    {
	this.x1 = x1; // this.x1 is the class member, x1 is just the parameter.
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
	this.myColor = myColor;
    }

    public void draw(Graphics g)
    {
	g.setColor(myColor);
	g.drawLine(x1,y1,x2,y2);
	
    }
    
    
    
}
