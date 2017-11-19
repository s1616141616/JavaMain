package problems;

public class MethodOverloading
{
	public static void main(String []args)
	{
		MethodOverloading n= new MethodOverloading();
		n.Over(12, 15);
		n.Over(12, 15, 2.5);
	}
	public void Over (int a, int b)
	{
		System.out.println(a+b);
	}
	public void Over(int a, int b, double c)
	{
	System.out.println(a+b+c);
	}
}