package com.mangesh.olpay.auth;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserManagementTest {

	@Test
	public void authUserByPhoneNumber() {

		//given
		User u1 = new User("Tushar","9225866145","password");
		User u2 = new User("rahul","1234567890","password");
		User u3 = new User("rajesh","0123456789","password");
		User u4 = new User("sumedh","9012345678","password");
		
		
		UserCollection usercollection = new usercollection(new BookMySQLStoreTestDouble());
		UserData userdata = new UserData(usercollection);
		UserManagement usermanagement = new UserManagement(usercollection);
		
		//when
		UserData.addUser(u1);
		UserData.addUser(u2);
		UserData.addUser(u3);
		UserData.addUser(u4);
		
		//then
		User actual = UserManagement.getUserByPhoneNumber("9225866145");
		
		assertEquals(u1, actual);

		
	}

}
