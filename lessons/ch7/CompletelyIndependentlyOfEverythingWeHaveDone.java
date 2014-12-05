/*
  Ethan R. Jones
  12/03/2014
  Array Lists!
*/

import java.util.*;

public class CompletelyIndependentlyOfEverythingWeHaveDone
{
    public static void main(String args[])
    {
	ArrayList<Integer> numList = new ArrayList<Integer>();

	numList.add(15);
	numList.add(12);
	numList.add(23);

	for(int x = 0; x < numList.size(); x++)
	    {
		System.out.println(numList.get(x));
	    }

	// For each $num in $numList
	for(int num : numList)
	    {
		System.out.println(num);
	    }
	
	System.out.println(numList.size());	
    }
}
