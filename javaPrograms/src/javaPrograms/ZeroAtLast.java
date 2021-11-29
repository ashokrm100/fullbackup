package javaPrograms;

public class ZeroAtLast {
	public static void main(String args[])
	{
		int arr[]= {23,0,1,78,0,109};
		//int arr1[];
		int count=0;
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			System.out.println("values in array:" +arr[i]);
			if(arr[i]!=0)
			{
				System.out.println("Zeros not present in index:"+i);
				//System.out.println("Value of Count:"+count++);
				System.out.println(count);
				arr[count]=arr[i];
				System.out.println("Count value :"+count);
				System.out.println("Aligned array:"+arr[count]);
				count++;
			}
		}
		while(count<len)
			arr[count++]=0;
		for(int i=0;i<len;i++)
			System.out.print(arr[i] +" ");
	}
}