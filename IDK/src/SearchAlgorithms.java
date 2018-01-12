
public class SearchAlgorithms 
{
	public static void main (String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1,3));
		System.out.println(linSearch(test1,3));
		
		System.out.println(binSearch(test2,23));
		System.out.println(linSearch(test2,23));
		
		System.out.println(binSearch(test2,25));
		System.out.println(linSearch(test2,25));
		
		System.out.println(binSearch(test1,10));
		System.out.println(linSearch(test1,1));
		
		System.out.println(binSearch(test1,1));
	}
	public static int linSearch(int[] name, int q)
	{
		for(int x = 0; x < name.length; x++)
		{
			if (name[x] == q)
			{
				return(x);
			}
		}
		return (-1);
	}
	public static int binSearch(int[] a, int q)
	{
		int l = 0;
		int r = a.length - 1;
		while (l <= r)
		{
			int mid = (l+r)/2;
			if (q == a[mid])
			{
				return (mid);
			}
			else if(q < a[mid])
			{
				r = mid-1;	
			}
			else 
			{
				l = mid + 1;
			}
		}
		return (-1);
	}
}
