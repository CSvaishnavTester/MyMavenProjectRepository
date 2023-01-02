package sanity;

import org.testng.annotations.Test;

	public class Homepage {
		@Test 
		public void verifyLoginbyEmail()
		{
			System.out.println("Login with email address..........");
		}

		@Test 
		public void loginByMobileNumber()
		{
			System.out.println("Login with mobile number..........");
		}
}
