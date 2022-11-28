package programme_sequence_MAVEN;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.orangeHRMbase;
import com.orangeHRM.qa.pages.orangeHRMloginpage;

public class loginpageTest extends orangeHRMbase {
	
	public loginpageTest() throws IOException {
		super();
	}

	orangeHRMloginpage loginpage;

  @BeforeMethod
  public void setup() throws IOException {
  
	 intialization();
	  
	 loginpage=new orangeHRMloginpage();	
}
  @Test
  public void validateusername() throws InterruptedException {
	  
	boolean user= loginpage.logindata(props.getProperty("userid"), props.getProperty("pass"));
	   
	 Assert.assertTrue(true);
  }

  @Test
  public void validatepagetitle() throws InterruptedException {
	  
		String pagetitle= loginpage.validatepagetitle(props.getProperty("userid"), props.getProperty("pass"));
		
        Assert.assertEquals(pagetitle, props.getProperty("Title"));

  }
  
  @AfterMethod
  public void teardown() {
	  
  driver.quit();
  }
}


