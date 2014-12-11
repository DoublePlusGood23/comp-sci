/*
  Ethan R. Jones
  12/10/14
  Selection Sort
*/

public class selectionSort
{
    public static void main(String args[])
    {
	int num[] = {12, 8, 5, 3, 9};

	selectionSortCall(num);

	for(int x = 0; x < num.length; x++)
	    {
		System.out.println(num[x]);
	    }
    }

    public static void selectionSortCall(int num[])
    {
	for(int pass = 0; pass < num.length - 1; pass++)
	    {
		int minIndex = pass;

		for(int k = pass + 1; k < num.length; k++)
		    {
			if(num[k] < num[minIndex])
			    {
				minIndex = k;
			    }
		    }
		
		int temp = num[pass];
		num[pass] = num[minIndex];
		num[minIndex] = temp;
	    }
    }
}
