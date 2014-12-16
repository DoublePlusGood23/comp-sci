/*
  Ethan R. Jones
  12/16/14
  Codingbat shiftLeft
*/
public int[] shiftLeft(int[] nums)
{
    if(nums.length <= 1)
	{
	    return nums;
	}
    int tempInt = nums[nums.length - 1];
    nums[nums.length - 1] = nums[0];

    for(int x = 0; x < nums.length - 2; x++)
	{
	    nums[x] = nums[x + 1];
	}
    nums[nums.length - 2] = tempInt;
    return nums;
}
