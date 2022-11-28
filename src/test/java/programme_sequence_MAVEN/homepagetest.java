package programme_sequence_MAVEN;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangeHRM.qa.base.orangeHRMbase;
import com.orangeHRM.qa.pages.orangeHRMhomepage;
import com.orangeHRM.qa.pages.orangeHRMloginpage;



public class homepagetest extends orangeHRMbase {

	public homepagetest() throws IOException {
		super();
	}

	orangeHRMhomepage homepage;
	orangeHRMloginpage loginpage;
	
	@BeforeMethod
	public void setup() throws IOException {
		
	 intialization();
		
	 homepage=new orangeHRMhomepage();
	 
	 loginpage=new orangeHRMloginpage();
	}

	@Test
	public void validatename() throws InterruptedException {
		
		loginpage.logindata(props.getProperty("userid"), props.getProperty("pass"));
		
		Thread.sleep(3000);
		
		homepage.homepagevalidate(props.getProperty("Name"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
