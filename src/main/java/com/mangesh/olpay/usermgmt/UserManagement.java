package com.mangesh.olpay.usermgmt;

import com.mangesh.olpay.gateway.UserCollection;
import com.mangesh.olpay.entities.User;
import com.mangesh.olpay.gateway.UserCollection;

public class UserManagement {

	//private UserCollection UserCollection;
	private static com.mangesh.olpay.gateway.UserCollection userCollection;
	
	public UserManagement(UserCollection userCollection) {

		this.userCollection = userCollection;
	}

	public static   User getUserByPhoneNumber(String phNumber) {

		return userCollection.getUserByPhoneNumber(phNumber);
		
	}

}
