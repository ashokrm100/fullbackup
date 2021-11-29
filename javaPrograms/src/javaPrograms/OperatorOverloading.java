package javaPrograms;

public class OperatorOverloading {
	public static void main(String args[])
	{
	Ab obj = new Ab();
	System.out.println("a+b:" +(obj.a+obj.b));
	System.out.println("a+b:" +obj.a+obj.b);
	}
	

}

class Ab
{
	int a=5;
	int b =9;
}