package problems;


public class MinNumberArray
{
	public static void main (String[]args)
	{
		int array[] ={10,5,20,15,20};
		int min= array[0];
	
		for (int i =0;i<array.length;i++)
		{
			if (min>array[i])
			{
			min=array[i];
			}
		}
	System.out.println ("Minimum of this series is : "+ min);
	}
}