package com.mangesh.olpay.gateway;

import com.mangesh.olpay.entities.User;

public interface UserStore {

	User getUserByPhoneNumber(String phNumber);
	
	void addUser(User u1);


	
	

}
