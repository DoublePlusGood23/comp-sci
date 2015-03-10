/*
  Ethan R. Jones
  2-11-2014
  Complex Number Tester 
*/

import java.util.*;

public class ComplexNumberTester
{
    public static void main(String args[])
    {
	ComplexNumber num[];
	num = new ComplexNumber[10];
		
	Random random = new Random();
	
	for(int x = 0; x < num.length; x++)
	    {
		float realPart = random.nextInt(500);
		float imaginaryPart = random.nextInt(500);

		num[x] = new ComplexNumber(realPart,imaginaryPart);
	    }
	
	for(ComplexNumber n : num)
	    {
		System.out.println(n.toString());

	    }
	System.out.println("");
	System.out.println()
    }
}
