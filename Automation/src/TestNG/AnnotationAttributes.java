package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributes {

	
		
		@Test(priority = 2,enabled=false)
		public void login() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demowebshop.tricentis.com/login");
			Reporter.log("login is successfull",true);
		}
		@Test(priority = 1,invocationCount=4,threadPoolSize=2)
		public void register(){
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demowebshop.tricentis.com/register");
			Reporter.log("Register is successfull",true);
		}
			
		
			
		}
	


