/*
` Ethan R. Jones
  2-10-15
  Rectangle 2
*/

public class Rectangle2
{
    
    // top-corner of the rectangle
    private int x; 
    private int y;

    private int width;
    private int height;

    // Default constructor (taking no parameters)
    public Rectangle2()
    {
	x = 0;
	y = 0;
	width = 0;
	height = 0;
    }
  
    // Constructor takes two coordinates (x1,y1) and (x2, y2)
    public Rectangle2(int x1, int y1, int x2, int y2)
    {
	setX(Math.min(x1, x2));
	setY(Math.min(y1, y2));
	
	setWidth(Math.abs(x1 - x2));
	setHeight(Math.abs(y1 - y2));
    }

    // Set Functions (void returns, parameter types as each variable)
    public void setX(int x)
    {
	this.x = (x >= 0 && x <= 500 ? x : 0);
	
    }

    public void setY(int y)
    {
	this.y = (y >= 0 && y <= 500 ? x : 0);
    }

    public void setWidth(int w)
    {
	width = w;
	
    }

    public void setHeight(int h)
    {
	height = h;
    }

    // Get functions
    public int getX()
    {
	return x;
    }

    public int getY()
    {
	return y;
    }

    public int getWidth()
    {
	
    }

    public int getHeight()
    {
	return height;
    }

    public String toString()
    {
	return "(" + x + "," + y + ") Width = " + width + " Height = " + height;
    }
    
}
