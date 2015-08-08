package com.example.vo;

import java.util.ArrayList;

public class Student {
	private String status;
	private String info;
	private ArrayList<Data1> data;
	public Student(String status, String info, ArrayList<Data1> data) {
		super();
		this.status = status;
		this.info = info;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public ArrayList<Data1> getData() {
		return data;
	}
	public void setData(ArrayList<Data1> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Student [status=" + status + ", info=" + info + ", data="
				+ data + "]";
	}
	
}
