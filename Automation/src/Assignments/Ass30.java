package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass30 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		WebElement kidsLink = driver.findElement(By.partialLinkText("KIDS"));
		Actions act=new Actions(driver);
		act.moveToElement(kidsLink).perform();
		WebElement ethinicWear = driver.findElement(By.linkText("Ethnic Wear"));
		ethinicWear.click();
		ethinicWear.isDisplayed();
		
	}

}
