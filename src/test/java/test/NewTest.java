package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("from the test method()");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("From before suite()");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("From after suite()");
  }

}
