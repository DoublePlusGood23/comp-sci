/*
  Ethan R. Jones
  2-5-15
  Draws random lines
*/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPane extends JPanel
{
    private Random random = new Random();
    private MyLine[] lines;

    public  DrawPanel()
    {
	setBackground(Color.WHITE);
	
	lines = new MyLine[100];

	for(int count = 0; count < lines.length; count++)
	    {
		int x1 = Random.nextInt(500); //0-499
		int x2 = Random.nextInt(500);
		int y1 = Random.nextInt(500);
		int y2 = Random.nextInt(500);

		int r = Random.nextInt(256);
		int g = Random.nextInt(256);
		int b = Random.nextInt(256);

		Color c = new Color(r,g,b);

		lines[count] = new MyLine(x1,y1,x2,y2,c);
	    }
    }
    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);

	//for-each loop
	for(MyLine lines : lines)
	    {
		line.draw(g);
	    }
    }
}
