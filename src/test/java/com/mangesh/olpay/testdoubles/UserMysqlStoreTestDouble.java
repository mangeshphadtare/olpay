package com.mangesh.olpay.testdoubles;

import java.util.List;
import java.util.ArrayList;

import com.mangesh.olpay.entities.User;
import com.mangesh.olpay.gateway.UserStore;

public class UserMysqlStoreTestDouble implements UserStore {

	List <User> userdb = new ArrayList<User> ();
	
		@Override
		public User getUserByPhoneNumber(String Phnumber){
		
			for(User u : userdb) {
				if(u.getUserByPhoneNumber().equals(Phnumber)) {
					return u;
				}
			}
			return null;
		}

		@Override
		public void addUser(User u1) {
			// TODO Auto-generated method stub
			
		}
}
