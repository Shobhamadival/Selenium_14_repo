package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("raj@323");
		driver.findElement(By.name("password")).sendKeys("raj@1234");
		
	}

}
