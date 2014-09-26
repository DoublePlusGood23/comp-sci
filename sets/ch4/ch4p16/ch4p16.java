/*
Ethan Jones
9-26-14
Ch4 P16
*/
import javax.swing.*;

public class ch4p16
{
    public static void main(String args[])
    {
	int n = 1;
	
	System.out.println("n\tn*10\tn*100\tn*1000\n");
	while(n <= 5)
	    {
		System.out.println("" + n + "\t" + (n * 10) + "\t" + (n * 100) + "\t" + (n * 1000));
		n++;
	    }
    }
}
