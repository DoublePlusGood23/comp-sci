/*
  Ethan R. Jones
  11-8-2014
  Black Jack
*/

public int blackjack(int a, int b)
{
    if(a <= 21 && a > b || a <= 21 && b > 21)
	{
	    return a;
	}
    else if(b <= 21 && b > a || b <= 21 && a > 21)
	{
	    return b;
	}
    return 0;
}
