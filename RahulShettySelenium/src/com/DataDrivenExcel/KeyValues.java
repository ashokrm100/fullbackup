package com.DataDrivenExcel;

public class KeyValues {
	String fname,fgender,fdate,faddress;

	public KeyValues(String fname, String fgender, String fdate, String faddress) {
		super();
		this.fname = fname;
		this.fgender = fgender;
		this.fdate = fdate;
		this.faddress = faddress;
	}

	
	@Override
	public String toString() {
		return "KeyValues [fname=" + fname + ", fgender=" + fgender + ", fdate=" + fdate + ", faddress=" + faddress
				+ "]";
	}


	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFgender() {
		return fgender;
	}

	public void setFgender(String fgender) {
		this.fgender = fgender;
	}

	public String getFdate() {
		return fdate;
	}

	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	public String getFaddress() {
		return faddress;
	}

	public void setFaddress(String faddress) {
		this.faddress = faddress;
	}
	
	

}
