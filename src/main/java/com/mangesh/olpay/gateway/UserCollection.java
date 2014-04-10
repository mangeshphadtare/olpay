package com.mangesh.olpay.gateway;

import com.mangesh.olpay.entities.User;
import com.mangesh.olpay.gateway.UserStore;

public class UserCollection {

	private UserStore userStore;
	
	public UserCollection(UserStore userStore) {
		
		this.userStore = userStore;
	}
	
	
	public User getUserByPhoneNumber(String phNumber) {
		return this.userStore.getUserByPhoneNumber(phNumber);
	}

	public void addUser(User b1) {
		this.userStore.addUser(b1);
	}

	
}
