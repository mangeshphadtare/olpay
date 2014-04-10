package com.mangesh.olpay.entities;

public class User {

	private String name;
	private String phnumber;
	private String password;

	public User(String name, String phnumber,String password) {
		
		this.name = name;
		this.phnumber = phnumber;
		this.password = password;
		
		}
	
	public String getUserByPhoneNumber(){
		return name;
	}

}
