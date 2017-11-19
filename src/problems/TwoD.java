package problems;

public class TwoD {

	public static void main(String[] args) {

		Object array [][]= new Object [3][3];
		
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
		
		for (int i =0; i<array.length; i++){
			for (int j =0; j<array.length; j++){
				System.out.println(array[i][j]);
				}
		}
	}

}