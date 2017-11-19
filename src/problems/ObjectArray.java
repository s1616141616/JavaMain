package problems;

public class ObjectArray
{
	public static void main(String[] args)
	{
		Object array [][]= new Object [3][3];

		
		array [0][0]=10;
		array [0][1]=20;
		array [0][2]=30;

		array [1][0]="Saiful";
		array [1][1]="Islam";
		array [1][2]="Harun";

		array [2][0]=1000;
		array [2][1]=2000;
		array [2][2]=3000;
	
		for (int i =0; i<array.length; i++)
		{
		for (int j =0; j<array[0].length; j++)
		{
		System.out.println(array[i][j]);
		}
		}
	}
}