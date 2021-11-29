package javaPrograms;

/*public class ThisKeyword {
	void m()
	{
		System.out.println("This prints from m");
	}
	
	void n()
	{
		System.out.println("This prints from n");
	
	this.m();
	{
		System.out.println("This is m inside n");
	}
 }
	
	public static void main(String args[])
	{
		ThisKeyword meth = new ThisKeyword();
		meth.n();
	}
}*/

public class ThisKeyword{
	int x;
	ThisKeyword()
	{
		System.out.println("hello");
	}
	
	ThisKeyword(int x)
	{
		this();
		this.x =x;
		System.out.println("Value to be printed" +" " + x);
	}
}
	
	class ChildKeyword extends ThisKeyword
	{
		ChildKeyword()
		{
			super(10);
		}
		
		/*void display()
		{
			System.out.println("Checking the usage of this and super");
		}*/
	
	public static void main(String[] args)
	{
		ChildKeyword pri = new ChildKeyword();
		//pri.display();
		
	}
	
	}
