package com.example.vo;

public class Data1 {
	private String title;
	private String img;
	private String url;
	public Data1(String title, String img, String url) {
		super();
		this.title = title;
		this.img = img;
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Data1 [title=" + title + ", img=" + img + ", url=" + url + "]";
	}
}
