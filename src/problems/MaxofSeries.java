package problems;

public class MaxofSeries {
	public static void main (String[]args){
		
		int array[] ={50,60,6,70,8};
		int max= array[0];
		for (int i =0;i<array.length;i++){
			
			if (array[i]>max){
			max=array[i];
		}
	}
		System.out.println ("Maximum value is : "+max);
	
	}
}
