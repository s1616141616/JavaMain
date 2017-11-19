package problems;

public class PrimeOrNot
{

	public static void main(String[] args)
	{
		
		int prime =2;
		int count=0;
			for (int i =1;i<=prime;i++){
				if (prime%i==0){
					count++;
			}
		}
		if(count == 2)
		{
		System.out.println(prime + " is a Prime number.");
		}
		else
		{
		System.out.println(prime + " is NOT a Prime number.");
		}	
	}
}