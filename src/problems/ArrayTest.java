package problems;

public class ArrayTest {

	public static void main(String[] args) {
		int [] Value;
				
		Value = new int[5];
		
		Value [0]= 15;
		Value [1]= 25;
		Value [2]= 35;
		Value [3]= 45;
		Value [4]= 55;

		System.out.println(Value [3]);
		System.out.println();
		System.out.println("Length of this array is :" +Value.length);
		
		String List []= {"Fish", "Meat", "Rice", "Vegetable", "Juice"};
		/*List =new String [5];
		
		List[0]= "Fish";
		List[1]= "Meat";
		List[2]= "Rice";
		List[3]= "Vegetable";
		List[4]= "Juice";
		*/
		System.out.println("");
		System.out.println(List [4]);
		System.out.println("");
		
		System.out.println("Now using for loop :");
		System.out.println("**************");
		for (int i=0;i<List.length;i++){
			System.out.println("List number " +(i+1)+ ":" + List[i]);
		}
	}

}
