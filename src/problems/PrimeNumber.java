package problems;

class PrimeNumber
{	
   public static void main (String[] args)
   {   
	   for (int i = 1; i <= 100; i++)
	   {
		   for(int j = 2; j <= i; j++)
		   {
			 if(j==i)
			 {
             System.out.println(i);
             }
             if(i%j==0)
             	{
            	 break;
             	}
		   }
	   }
   }
}