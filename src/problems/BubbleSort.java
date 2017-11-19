package problems;

public class BubbleSort
{
	void bubbleSort(int arr[])
	{
		//int n = arr.length;
		for (int i= 0; i<arr.length; i++)
		for (int j =0; j <arr.length; j++)
			if (arr[i] < arr [j])
				{
				//swap temp and arr[i]
				int temp = arr[i];
					arr[i] = arr [j];
					arr[j] =temp;
				}
	}

//print this array
	void printArray(int arr[])
	{
	int n =arr.length;
	for (int i=0; i<n;i++)
		System.out.println(arr[i] + " ");
		System.out.println();
	}


	public static void main(String[] args)
	{
	BubbleSort bs = new BubbleSort();
	int arr[] = {5,7,2,4,3,1,6};
	bs.bubbleSort(arr);
	System.out.println("Sorted array");
	bs.printArray(arr);
	}
}