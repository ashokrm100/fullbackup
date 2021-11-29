package com.InterviewQuestions;

import org.testng.annotations.Test;

public class ClassCastException {
	
	public void raiseException()
	{
		System.out.println("Enter the Integer");
		String  str ="200";
		int val = Integer.parseInt(str);
		System.out.println(val);
	}
	public static void main(String args[])
	{
		B obj = new B();
		ClassCastException rp=new ClassCastException();
		obj.getException(rp);
		//int i =Integer.valueOf(42);
		
	}

}

class B extends ClassCastException
{
	public void getException(Object o)
	{
		B ex = (B)o;
		System.out.println("M in B Exception");
	}
}

class C extends ClassCastException
{
	public void CException()
	{
		System.out.println("M in C Exception");
	}
}