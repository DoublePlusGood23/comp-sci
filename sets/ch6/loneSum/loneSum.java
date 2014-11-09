/*
  Ethan R. Jones
  11-8-2014
  Lone Sum
*/

public int loneSum(int a, int b, int c)
{
    if(a == b && b == c)
	{
	    return 0;
	}
    else if(a == b)
	{
	    return c;
	}
    else if(a == c)
	{
	    return b;
	}
    else if(b == c)
	{
	    return a;
	}
    return a + b + c;
}
