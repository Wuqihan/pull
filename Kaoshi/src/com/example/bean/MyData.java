package com.example.bean;

public class MyData {
	private Comment comments;

	public MyData(Comment comments) {
		super();
		this.comments = comments;
	}

	public Comment getComments() {
		return comments;
	}

	public void setComments(Comment comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "MyData [comments=" + comments + "]";
	}

}
