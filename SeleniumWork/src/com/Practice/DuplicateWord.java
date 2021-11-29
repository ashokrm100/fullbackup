package com.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;

public class DuplicateWord {
	//USING HASHMAP
	public static void findDuplicateValues(String a)
	{
	String [] a1 = a.split(" ");
	HashMap<String,Integer> hs = new HashMap();
	for(String s:a1)
	{
	if(hs.get(s)!=null)
		hs.put(s,hs.get(s)+1);
		else
		hs.put(s , 1); }
	Iterator<String> it = hs.keySet().iterator();
	while(it.hasNext())
	{
		String tp = it.next();
		if(hs.get(tp)>1)
		{
			System.out.println(tp +":" +hs.get(tp));
		}
	}
	}
	public static void main(String args[])
	{
	findDuplicateValues("This is duplicate duplicate value");
	}
	//USING TREESET
	/*public static void main(String args[]) {
		String word = "This is to find duplicate duplicate word from find string";
		String[] wd = word.split(" ");
		TreeSet ts = new TreeSet();
		int count = 0;
		//System.out.println(Arrays.toString(wd));
		for (int i = 0; i < wd.length; i++) {
			count = 1;
			//System.out.println(wd[i]);
			if (!ts.add(wd[i])) {
				count++;
				System.out.println("Duplicated word:"+wd[i] +":" +count);
			}
		}
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next());
		}*/

	//}
}
