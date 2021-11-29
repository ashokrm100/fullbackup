package javaPrograms;


// super is used to refer immediate parent class instance variable.
public class SuperConstructor {
	
	 String color="white";
}
	
class Animal extends SuperConstructor
	 {
	public void printmethod() 
	{
		String color= "black";
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String args[]) 
	{
		Animal dog = new Animal();
		dog.printmethod();

	}
}
