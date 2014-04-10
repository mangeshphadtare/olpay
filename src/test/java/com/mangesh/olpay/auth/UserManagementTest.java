package com.mangesh.olpay.auth;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

import com.mangesh.olpay.entities.User;
import com.mangesh.olpay.gateway.UserCollection;
import com.mangesh.olpay.testdoubles.UserMysqlStoreTestDouble;
import com.mangesh.olpay.user.UserData;
import com.mangesh.olpay.usermgmt.UserManagement;

public class UserManagementTest {

	@SuppressWarnings("deprecation")
	@Test
	public void authUserByPhoneNumber() {

		//given
		User u1 = new User("mangesh","9225866145","password");
		User u2 = new User("rahul","1234567890","password");
		User u3 = new User("rajesh","0123456789","password");
		User u4 = new User("sumedh","9012345678","password");
		
		
		UserCollection usercollection = new UserCollection(new UserMysqlStoreTestDouble());
		UserData userdata = new UserData(usercollection);
		UserManagement usermanagement = new UserManagement(usercollection);
		
		//when
		userdata.addUser(u1);
		userdata.addUser(u2);
		userdata.addUser(u3);
		userdata.addUser(u4);
		
		
		User actual = usermanagement.getUserByPhoneNumber("9225866145");
		//then
		assertEquals(u1, actual);

		
	}

}
