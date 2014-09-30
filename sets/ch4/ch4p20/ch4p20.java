/*
Ethan Jones
9-29-14
Ch4 P20
*/
public class ch4p20
{
    public static void main(String args[])
    {
	int row = 10, column;
	
	while(row >= 1)
	    {
		column = 1;
		while(column <= 10)
		    {
			System.out.print(row % 2 == 1 ? "<" : ">" );
			++column;
		    }
		--row;
		System.out.println();
	    }
    }
}
		
