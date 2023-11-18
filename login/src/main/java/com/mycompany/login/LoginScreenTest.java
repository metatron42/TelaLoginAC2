
package com.mycompany.login;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class LoginScreenTest {

	@Test
	public void testSuccessfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("john1","password123"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("john","wrongpassword"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("testuser","testpassword");
		assertTrue(loginScreen.login("testuser","testpassword"));
	}

}
