package javaPrograms;

public class DuplicateChar {
	public static void main(String args[])
	{
		String name="Ashok Kumar";
		char ch[]=name.toLowerCase().toCharArray();
		int len = ch.length;
		int count;
		for(int i=0; i<len;i++)
		{
			count=1;
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			System.out.println(ch[i]+":"+count);
			if(count>1)
			System.out.println(ch[i] +":" +count);
		}
	}
}
