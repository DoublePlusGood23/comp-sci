/*
  Ethan R. Jones
  12/11/14
  Insertion Sort
*/
public class insertionSort
{
    public static void main(String args[])
    {
	int num[] = {56, 12, 34, 98, 2, 37, 51};

	insertionSortCall(num);

	for(int x = 0; x < num.length; x++)
	    {
		System.out.println(num[x]);
	    }
    }

    // Loop from j = 1 to length -1 (end of Array)
    // In each pass move the temp item to it's proper position.
    // By making a temp variable, we are able to create
    // a 'vacant' position at location j.

    // Loop until the proper position to get ascending order
    // for the temp variable.

    // In each iteration in the while() loop we will move the vacant
    // position one postion lower in the array.
    public static void insertionSortCall(int num[])
    {
	int temp;
	int tempIndex;
	for(int j = 1; j < num.length; j++)
	    {
		temp = num[j];
		tempIndex = j;

		while(tempIndex > 0 && temp < num[tempIndex -1])
		    {
			num[tempIndex] = num[tempIndex - 1];
			tempIndex--;
		    }
	    }
	
	num[tempIndex] = temp;
	
    }
}
