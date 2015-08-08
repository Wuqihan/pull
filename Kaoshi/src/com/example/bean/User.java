package com.example.bean;

public class User {
	private String id;
	private String username;
	private String avatar;
	private String mask;

	public User(String id, String username, String avatar, String mask) {
		super();
		this.id = id;
		this.username = username;
		this.avatar = avatar;
		this.mask = mask;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", avatar="
				+ avatar + ", mask=" + mask + "]";
	}

}
