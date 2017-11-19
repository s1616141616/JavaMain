package problems;

public class ArrayTwoD {

	public static void main(String[] args) {

		int array [][]= new int [3][3];
		int x=array.length;
		int y=array[0].length;
		
		array [0][0]=10;
		array [0][1]=20;
		array [0][2]=30;

		array [1][0]=100;
		array [1][1]=200;
		array [1][2]=300;

		array [2][0]=1000;
		array [2][1]=2000;
		array [2][2]=3000;

		System.out.println(array [0][1]);
		System.out.println("Now printing all : ");
		
		for (int i =0; i<x; i++){
			for (int j =0; j<y; j++){
				System.out.println(array[i][j]);
				}
		}
	}
}