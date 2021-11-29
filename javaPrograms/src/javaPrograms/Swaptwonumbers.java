package javaPrograms;

public class Swaptwonumbers {
	
	public static void main (String args[])
	{
		int a =5;
		int b=10;
		
		a=a-b;//5-10=-5;
		b=a+b;//-5+10=5;
		a=b-a;
		
		System.out.println(a);
		System.out.println(b);
		
	}

}
