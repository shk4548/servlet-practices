package com.poscoict.guestbook.vo;

public class GuestbookVo {
	private int no;
	private String name;
	private String password;
	private String messsage;
	private String date;
	
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getMesssage() {
		return messsage;
	}


	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}


	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "GuestbookVo [no=" + no + ", name=" + name + ", password=" + password + ", messsage=" + messsage
				+ ", date=" + date + "]";
	}
	

}
