package javaPrograms;

//The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:
public class SuperForClass {
	int x;
	SuperForClass()
	{
		System.out.println("hello");
	}
	
	SuperForClass(int x)
	{
		this.x=x;
		System.out.println(x);
		
	}
}
	class Water extends SuperForClass
	{
		Water()
		{
		super(10);
		System.out.println("Water is printed");
	}
	public static void main (String args[])
	{
		Water ani = new Water();
		
	}

}
