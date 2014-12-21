/*
  Ethan R. Jones
  12/16/14
  twoTwo
*/
public boolean twoTwo(int[] nums)
{
    for (int x = 0; x < nums.length; x++)
	{
	    if (nums[x] != 2)
		continue;
	    if (x >= 1 && nums[x - 1] == 2)
		continue;
	    if (x < (nums.length - 1) && nums[x + 1] == 2)
		continue;
	    return false;
	}
    return true;
}
