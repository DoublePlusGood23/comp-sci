/*
  Ethan R. Jones
  2-5-15
  Tests the MyLine and DrawPanel claseses
*/

import javax.swing.*;

public class TestDraw
{
    public static void main(String args[])
    {
	DrawPanel panel = new DrawPanel();

	JFrame application = new JFrame();

	application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	application.add(panel);
	application.setSize(500,500);
	application.setVisible(true);
    }
}
