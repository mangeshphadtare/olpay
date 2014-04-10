package com.mangesh.olpay.usermgmt;

import com.mangesh.olpay.gateway.UserCollection;
import com.mangesh.olpay.entities.User;

public class UserManagement {

	private com.mangesh.olpay.gateway.UserCollection userCollection;
	
	public UserManagement(UserCollection userCollection) {

		this.userCollection = userCollection;
	}

	public  User getUserByPhoneNumber(String phNumber) {

		return userCollection.getUserByPhoneNumber(phNumber);
		
	}

}
