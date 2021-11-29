package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	public static ArrayList<Object[]> getExceldata()
	{
		Xls_Reader reader = new Xls_Reader("C:\\Users\\ashok\\Desktop\\workspace\\Excel\\src\\com\\testdata\\OrangeHRM.xlsx");
		int row = reader.getRowCount("Sheet1");
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		for(int rownum=2;rownum<=row;rownum++)
		{	
		String fullname = reader.getCellData("Sheet1","FULL NAME", rownum);
		System.out.println(fullname);
		String middlename = reader.getCellData("Sheet1", "MIDDLE NAME", rownum);
		System.out.println(middlename);
		String lastname = reader.getCellData("Sheet1","LAST NAME", rownum);
		System.out.println(lastname);
		String employeeid = reader.getCellData("Sheet1","EMPLOYEE ID",rownum);
		System.out.println(employeeid);
		String otherid = reader.getCellData("Sheet1","OTHER ID",rownum);
		System.out.println(otherid);
		Object[] ob = {fullname, middlename, lastname,employeeid,otherid};
		myData.add(ob);
			
	}
		return myData;
}
}