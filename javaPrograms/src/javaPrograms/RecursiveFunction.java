package javaPrograms;

public class RecursiveFunction {
	public static void main(String args[])
	{
		int a=20;
		int val=calculate(a);
		System.out.println(val);
		
		
	}
	
	public static int calculate(int a)
	{
		if(a!=0)
		{
		return a+calculate(a-1);
		}
		return a;
		
	}
}
