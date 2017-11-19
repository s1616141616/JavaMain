package problems;

public class MinofSeries {

	public static void main (String[]args){
		
		int array[] ={50,60,6,70,8};
		int min= array[0];
		for (int i =0;i<array.length;i++){
			
			if (array[i]<min){
			min=array[i];
		}
	}
		System.out.println ("Minimum value is : "+min);
	
	}
}