package day3;

import org.testng.annotations.Test;

public class Forgotpassword {
  @Test
  public void forgotpasswordwithemailID () {
  System.out.println("OTP has been sent to your registered email id");
  }
  
  @Test
  public void forgotpasswordwithMobileNO () {
  System.out.println("OTP has been sent to your registered mobile number ");
  }
}
