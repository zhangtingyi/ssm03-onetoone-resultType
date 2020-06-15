package com.mybatis.entity;

public class OrderCustomer extends Orders{
	private String username;
	private String birthday;
	private String sex;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*
	@Override
	public String toString() {
		return "OrderCustomer [username=" + username + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + "]"+"Customer [id=" + getId() + ", username=" + getUsername() + ", birthday=" + getBirthday() + ", sex=" + getSex()
				+ ", address=" + getAddress() + "]"+ "\n";
	}
	*/
	@Override
	public String toString() {
		return "Orders [id=" + getId() + ", c_id=" + getC_id() + ", number=" + getNumber() + ", createtime=" + getCreatetime() + ", note="
				+ getNote() + "," + " OrderCustomer [username=" + username + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + "]"+ "]";
	}
	
}
