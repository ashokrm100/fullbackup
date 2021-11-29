package javaPrograms;

public class NumberPalindrome {
	public static void main(String args[])
	{
		int num =128;
		int k=num;
		int n;
		int rev =0;
		while(num!=0)
		{
			n = num%10;
			rev = (rev*10)+n;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(k);
		if(rev==k)
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
