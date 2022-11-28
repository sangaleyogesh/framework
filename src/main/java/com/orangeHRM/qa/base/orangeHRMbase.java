package com.orangeHRM.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.orangeHRM.qa.util.orangeHRMutil;

public class orangeHRMbase {
	
	public static WebDriver driver;
	
	public static Properties props;
	
	public orangeHRMbase() throws IOException {
		
		props=new Properties();
		
		FileInputStream ip=new FileInputStream("C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\src\\main\\java\\com\\orangeHRM\\qa\\config\\config.properties");
		
	    props.load(ip);
	
	}
    @SuppressWarnings("deprecation")
    public void intialization() {

    	String browsername=props.getProperty("browser");
    	
		System.out.println(browsername);

    	
    	if(browsername.equals("chrome")) {
    		
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\Browser\\chromedriver.exe");
    		
    		driver=new ChromeDriver();
    		
    	}
    	
    	else if(browsername.equals("Firefox")) {
    		
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\Browser\\geckodriver.exe");
    	
    		driver=new FirefoxDriver();
    		
    	}
    	else if(browsername.equals("IE")) {
    		
    		System.setProperty("webdriver.IE.driver", "C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\Browser\\msedgedriver.exe");
    		
    		driver=new InternetExplorerDriver();
    	}
    	else{
    		System.out.println("no browser");
    	}
    	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\Browser\\chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yogesh Sangale\\eclipse-workspace\\programme_sequence_MAVEN\\Browser\\geckodriver.exe");

	driver=new ChromeDriver();
	//driver=new FirefoxDriver();
	driver.get(props.getProperty("url"));
	
	driver.manage().window().maximize();
	
	//driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().implicitlyWait(orangeHRMutil.imlicitwait,TimeUnit.SECONDS);
}
	
}
