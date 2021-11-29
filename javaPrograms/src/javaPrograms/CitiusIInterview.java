package javaPrograms;


class A
{
	void display()
	{
		System.out.println("Hello");
	}

}

class B
{
	void display()
	{
		System.out.println("welcome");
	}
}

class CitiusIInterview extends A
{
	public static void main(String args[])
	{
		CitiusIInterview ci = new CitiusIInterview();
		ci.display();
	}
}


