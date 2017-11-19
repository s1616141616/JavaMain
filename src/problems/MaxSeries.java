package problems;

public class MaxSeries
{
	public static void main (String[]args)
	{
		int array[] ={20,15,5,50,60};
		int max= array[0];
		for (int i =0;i<array.length;i++)
		{
			if (max<array[i])
			{
				max=array[i];
			}
		}
		System.out.println ("Maximum of this series is : "+ max);
	}
}