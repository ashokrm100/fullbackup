package com.DataDrivenExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WriteToExcel {

	static GetDataFunction gm = new GetDataFunction();
	public String name;
	public String gender;
	public String dt;
	public String address;

	public static void main(String[] args) throws IOException {

		WriteToExcel wr = new WriteToExcel();
		// Object objv=getValue();
		// for(int i=0;i<objv.)
		wr.getValue();

		// gm.receiveData(getValue());

	}

	public void getValue() throws IOException
	// public static void getValue()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Total number of new customers data to be added:\n");
		Integer len = Integer.parseInt(sc.nextLine());
		// Object obj[][] = new Object[len][4];
		for (int j = 0; j < len; j++) {
			// obj=new Object[i][];
			// for (int k = 0; k <1; k++) {
			// int u = 0;
			System.out.println("Enter Customer Name:\n ");
			name = sc.nextLine();
			// obj[j][0] = sc.nextLine();

			System.out.println("Enter Gender:\n ");
			gender = sc.nextLine();
			// obj[j][1] = sc.nextLine();

			System.out.println("Enter date:\n");
			dt = sc.nextLine();
			// obj[j][2] = sc.nextLine();

			System.out.println("Enter Address:\n");
			address = sc.nextLine();
			// obj[j][3] = sc.nextLine();

			// System.out.println(obj[j][k]);

			 //gt.receiveData(name);
//				}

		}
		sc.close();
		// return obj;
	}

}

/*
 * String name; String gender; String dt; String address;
 * 
 * ArrayList<String> arr= new ArrayList<String>();
 */
// int n =4;
// Map<String,String> data = new HashMap<String,String>();
// sc.skip(System.lineSeparator());
// gt.receiveData(name,gender,dt,address);
// sc.skip(System.lineSeparator());
/*
 * arr.add(name); arr.add(gender); arr.add(dt); arr.add(address);
 * gt.getArraylist(arr); System.out.println(arr); arr.clear();
 */
