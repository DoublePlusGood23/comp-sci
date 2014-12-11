/*
  Ethan R. Jones
  12/11/14
  Merge Sort
*/

public class mergeSort
{
    public static void main(String args[])
    {
	int num[] = {45, 12, 36, 17, 28, 90, 5, 13, 64, 10};

	mergeSortCall(num);

	for(int x = 0; x < num.length; x++)
	    {
		System.out.println(num[x]);
	    }
    }

    public static void mergeSortCall(int num[])
    {
	int n = num.length;
	int temp[] =  new int[n];
	mergeSortHelper(num, 0, n-1, temp);
    }

    public static void mergeSortHelper(int num[], int from, int to, int temp[])
    {
	if(from < to)
	    {
		int mid = (from + to) / 2;
		
		mergeSortHelper(num, from, mid, temp);
		mergeSortHelper(num, mid + 1, to, temp);
		
		merge(num, from, mid, to, temp);
	    }
    }

    public static void merge(int num[], int from, int mid, int to, int temp[])
    {
	int i = from;
	int j = mid + 1;
	int k = from;

	while(i <= mid && j <= to)
	    {
		if(num[i] < num[j])
		    {
			temp[k] = num[i];
			i++;
		    }
		else
		    {
			temp[k] = num[j];
			j++;
		    }
		k++;
	    }
	while(i <= mid)
	    {
		temp[k] = num[i];
		i++;
		k++;
	    }
	while(j <= to)
	    {
		temp[k] = num[j];
		j++;
		k++;
	    }
	for(int x = from; x <= to; x++)
	    {
		num[x] = temp[x];
	    }
    }
}
