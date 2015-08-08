package com.example.bean;

public class Data {
	private String id;
	private String content;
	private String up;
	private String created_at;
	private Article article;
	private User user;

	public Data(String id, String content, String up, String created_at,
			Article article, User user) {
		super();
		this.id = id;
		this.content = content;
		this.up = up;
		this.created_at = created_at;
		this.article = article;
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUp() {
		return up;
	}

	public void setUp(String up) {
		this.up = up;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", content=" + content + ", up=" + up
				+ ", created_at=" + created_at + ", article=" + article
				+ ", user=" + user + "]";
	}

}
