package com.Streams;

import java.util.ArrayList;

public class StreamFilter {
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList();
		al.add("Anu");
		al.add("Ashok");
		al.add("Inki");
		al.add("Pinki");
		
		Long c=al.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
	

}
