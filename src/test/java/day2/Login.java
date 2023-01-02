package day2;

import org.testng.annotations.Test;

public class Login {
  @Test
  public void validLogin() {
  System.out.println("Login with valid credentials");
  }
  
  @Test
  public void blankuserAndpassLogin() {
	  System.out.println("Login with blank data");
  }
  
  @Test
  public void InvalidLogin() {
	  System.out.println("Login with invalid data");
  }
}
