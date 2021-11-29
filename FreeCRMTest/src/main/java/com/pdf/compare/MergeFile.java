package com.pdf.compare;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.testng.annotations.Test;

public class MergeFile {
	
	@Test
	public static void LoadFile() throws IOException
	{
		//Writing Text
		
		
		//Writing xxx content
		FileWriter writer1 = new FileWriter("C:\\Users\\ashok\\Downloads\\Merging\\File3.txt");
		writer1.write("xxxxxxx");
		writer1.close();
		
		//Reading Invoice contents
		BufferedReader br3 = new BufferedReader(new FileReader("C:\\Users\\ashok\\Downloads\\Merging\\File3.txt"));
		File directory = new File("C:\\Users\\ashok\\Downloads\\TEXTINVOICE\\ADDIT_TEXT");
		File[] file2 = directory.listFiles();
		System.out.println(file2.length);
		int i=0;
		
		for(File f:file2)
		{
			FileWriter writer = new FileWriter("C:\\Users\\ashok\\Downloads\\Merging\\File4 "+i+".txt");
			i++;
			if(f.isFile())
			{
				String path = f.getAbsolutePath();
				BufferedReader br1 = new BufferedReader(new FileReader(path));
				BufferedWriter bw = new BufferedWriter(writer);
				PrintWriter pw = new PrintWriter(bw);
				String file1=br1.readLine();
				String file3=br3.readLine();
			
		while(file1 !=null)
		{
		pw.println(file1);
		file1=br1.readLine();
		}
		
		while(file3!=null)
		{
			pw.println(file3);
			file3 = br3.readLine();
		}
		
			pw.flush();
			br1.close();
			writer.close();
		}
		}
		
		//br3.close();
		//br2.close();
		//writer1.close();
		
	}
}
		
	/*	
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\ashok\\Downloads\\Merging\\File2.txt"));
		String file2=br2.readLine();
		while(file2!=null)
		{
			pw.println(file2);
			file2=br2.readLine();
		}
		
		
	}

}*/
