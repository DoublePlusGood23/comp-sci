// DrawPanel - use MyLine to draw random lines

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    private Random random = new Random();
    private MyLine[] lines;
    private MyRectangle[] rects;
    private MyOval[] ovals;
    
    public DrawPanel()
    {
	setBackground(Color.WHITE);

	lines = new MyLine[100];

	for(int count = 0; count < lines.length; count++)
	    {
		int x1 = random.nextInt(500);	// 0-499
		int y1 = random.nextInt(500);
		int x2 = random.nextInt(500);
		int y2 = random.nextInt(500);

		int r = random.nextInt(256);	// 0-255
		int g = random.nextInt(256);
		int b = random.nextInt(256);

		Color c = new Color(r,g,b);

		lines[count] = new MyLine(x1, y1, x2, y2, c);
	    }

	rects = new MyRectangle[100];
	for(int count = 0; count < rects.length; count ++)
	    {
		int x1 = random.nextInt(500);	// 0-499
		int y1 = random.nextInt(500);
		int x2 = random.nextInt(500);
		int y2 = random.nextInt(500);

		int r = random.nextInt(256);	// 0-255
		int g = random.nextInt(256);
		int b = random.nextInt(256);
			
		Color c = new Color(r,g,b);

		boolean f = random.nextBoolean();
			
		rects[count] = new MyRectangle(x1, y1, x2, y2, c, f);
	    }
	ovals = new MyOval[100];
	for(int count = 0; count < rects.length; count ++)
	    {
		int x1 = random.nextInt(500);	// 0-499
		int y1 = random.nextInt(500);
		int x2 = random.nextInt(500);
		int y2 = random.nextInt(500);

		int r = random.nextInt(256);	// 0-255
		int g = random.nextInt(256);
		int b = random.nextInt(256);
			
		Color c = new Color(r,g,b);

		boolean f = random.nextBoolean();
		
		ovals[count] = new MyOval(x1, y1, x2, y2, c, f);
	    }
    }

    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);

	// for-next loop
	//for(int x=0;x<lines.length;x++)
	//{
	//	lines[x].draw(g);
	//}

	// for-each loop
	//	"for each single line in the list (array) of lines
	for(MyLine line : lines)
	    {
		line.draw(g);
	    }
	for(MyRectangle rect : rects)
	    {
		rect.draw(g);
	    }
	for(MyOval oval : ovals)
	    {
		oval.draw(g);
	    }
    }
}
