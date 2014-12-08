/*
  Ethan R. Jones
  12/08/14
  Two Dimensional Arrays, 2D Arrays, arrays 
*/

public class TwoDArray
{
    public static void main(String args[])
    {
	int table[][] = {{2, 4, 10}, {3, -2, -1}};

	// 2  4 10     (2 rows, 3 columns)
	// 3 -2 -1

	// -- Pretend it's a system --
	// 2x + 4y = 10
	// 3x - 2y = -1

	

	int table2[][] = {{1,2}, {3}, {4,5,6}};

	for(int row = 0; row < table.length; row++)
	    {
		for(int column = 0; column < table[row].length; column++)
		    {
			System.out.print(table[row][column]);
		    }
		System.out.println();
	    }
    }
}
