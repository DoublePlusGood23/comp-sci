/*
  Ethan R. Jones
  12/16/14
  Counting Evens Codingbat
*/
public int countEvens(int[] nums)
{
    int count = 0;
    for(int x = 0; x < nums.length; x++)
	{
	    if(nums[x] % 2 == 0)
		{
		    count++;
		}
	}
    return count;
}
