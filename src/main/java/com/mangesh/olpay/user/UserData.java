package com.mangesh.olpay.user;

import com.mangesh.olpay.entities.User;
import com.mangesh.olpay.gateway.UserCollection;

public class UserData {

	private UserCollection userCollection;

	public UserData(UserCollection userCollection) {

		this.userCollection = userCollection;
	}

	public  void addUser(User u1) {
		this.userCollection.addUser(u1);
	}

}
