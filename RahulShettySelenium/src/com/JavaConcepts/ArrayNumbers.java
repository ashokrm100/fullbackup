package com.JavaConcepts;

public class ArrayNumbers {

	public static void main(String args[])
	{
		int a[][]= {{8,5,67},{4,2,11},{5,3,9}};
		int sum=a[0][0];
		int col=0;
		int row=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[i][j]<sum))
				{
					sum=a[i][j];
					row=i;
					col=j;
					}
					
			}
			
		}System.out.println("Minimum value is:" +sum);
		for(int i=0;i<a.length;i++)
		{
			for(int j=col;j<=col;j++)
			{
				if(sum<a[i][j])
				{
					sum=a[i][j];
				}
			}
			
		}System.out.println("Maximum cal value:" +sum);
		
		
		
	}
}
