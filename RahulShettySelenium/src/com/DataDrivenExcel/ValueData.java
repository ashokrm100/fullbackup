package com.DataDrivenExcel;

import java.util.ArrayList;

public class ValueData {
	
	String name;
	String gender;
	String date;
	String address;

	
	public ValueData(String name, String gender, String date, String address) {
		super();
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ValueData [name=" + name + ", gender=" + gender + ", date=" + date + ", address=" + address + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
