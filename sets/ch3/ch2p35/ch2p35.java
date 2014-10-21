/*
Ethan R. Jones 
10-20-2014
ch2p35
*/

import javax.swing.*;

public class ch2p35
{
    public static void main(String args[])
    {
	String[] sNums = new String[5]; 
	int[] nums = new int[5];
	int posi = 0;
	int nega = 0;
	int zero = 0;
	
	for(int x = 0; x < 5; x++)
	    {
		sNums[x] = JOptionPane.showInputDialog("Enter number " + x);
		nums[x] = Integer.parseInt(sNums[x]);
	    }
	for(int x = 0; x < 5; x++)
	    {
		if(nums[x] > 0)
		    {
			posi++; 
		    }
		else if(nums[x] < 0)
		    {
			nega++;
		    }
		else if(nums[x] == 0)
		    {
			zero++;
		    }
	    }
	System.out.println("Positive: " + posi + " Negative: " + nega + " Zero: " + zero);
    }
}
