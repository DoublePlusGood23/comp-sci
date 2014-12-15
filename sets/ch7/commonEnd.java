/*
  Ethan R. Jones
  12/15/14
  Common End Codingbat
*/
public boolean commonEnd(int[] a, int[] b)
{
    if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
	{
	    return true;
	}
    else
	{
	    return false;
	}
}
