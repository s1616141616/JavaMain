package problems;

public class ReturnVoidType
{
	public static void main (String []args)
	{
		int a =10;
		int b=20;
		int answer=Calculation (a,b);
		System.out.println(answer);
		
		MethodAdd(10,20);
	}
	public static int Calculation(int a, int b)
	{
		return a*b;
	}
	public static void MethodAdd(int a,int b)
	{
		int ans =a+b;
		System.out.println(ans);
	}
}