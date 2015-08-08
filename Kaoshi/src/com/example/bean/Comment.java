package com.example.bean;

import java.util.ArrayList;

public class Comment {
	private String total;
	private String per_page;
	private String current_page;
	private String last_page;
	private ArrayList<Data> data;

	public Comment(String total, String per_page, String current_page,
			String last_page, ArrayList<Data> data) {
		super();
		this.total = total;
		this.per_page = per_page;
		this.current_page = current_page;
		this.last_page = last_page;
		this.data = data;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPer_page() {
		return per_page;
	}

	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}

	public String getCurrent_page() {
		return current_page;
	}

	public void setCurrent_page(String current_page) {
		this.current_page = current_page;
	}

	public String getLast_page() {
		return last_page;
	}

	public void setLast_page(String last_page) {
		this.last_page = last_page;
	}

	public ArrayList<Data> getData() {
		return data;
	}

	public void setData(ArrayList<Data> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Comment [total=" + total + ", per_page=" + per_page
				+ ", current_page=" + current_page + ", last_page=" + last_page
				+ ", data=" + data + "]";
	}

}
