/* 
Ethan R. Jones
10-7-14
Do While
*/

import java.awt.*;
import java.applet.*;

public class Chp5DoWhile extends Applet
{
    public void init()
    {
	
    }
    
    public void paint(Graphics g)
    {
	int count = 1;
	do
	    {
		g.drawOval((110 - count * 10), (110 - count * 10), (count * 20), (count * 20));
		
		count++;
	    }while(count <= 10);
    }
}
