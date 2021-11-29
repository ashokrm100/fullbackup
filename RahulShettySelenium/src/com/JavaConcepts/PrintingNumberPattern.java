package com.JavaConcepts;

public class PrintingNumberPattern {
	
	public static void main(String args[])
	{
		int val=0;
		System.out.println("Printing pattern");
		for(int i=1; i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				val=val+1;
				System.out.print(val+"\t");
			}
			System.out.println("");
		}
		 val=0;
		System.out.println("Printing Second Pattern");
		for(int i=1; i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				val++;
				System.out.print(val+"\t");
			}
			System.out.println("");
		}
		
	}
	
	
	

}
