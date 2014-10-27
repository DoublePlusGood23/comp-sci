/*
Ethan R. Jones
10-27-14
Random Numbers
*/

import javax.swing.*;
import java.util.*;

public class randomNumbers
{
    public static void main(String args[])
    {
	// No need for a random number seed - built in to the JVM
	// Math.random() gives a random decimal [0.00, 1.0] [] == inclusive
	for(int x = 1; x <= 10; x++)
	    {
		double roll = (int)(Math.random() * 6 + 1); // 1 to 7
		System.out.println(roll);
	    }
	
	for(int x = 1; x <= 10; x++)
	    {
		Random r = new Random();
		int roll = r.nextInt(6);
		System.out.println(roll);
	    }
    }
}
