package com.JavaConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapsWorking {

	public static void main(String args[])
	{
		HashMap<Integer,String> ha = new HashMap<Integer,String>();
		ha.put(1,"ashok");
		ha.put(2, "anusha");
		ha.put(3, "Usha");
		ha.put(4, "Venkatesh");
		
		for(int i =1; i<ha.size();i++)
		{
		System.out.println(ha.get(i));
		}
		Set se = ha.entrySet();
		
		Iterator it = se.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			//System.out.println(it.next());
		}
		}
		
		
	
}
