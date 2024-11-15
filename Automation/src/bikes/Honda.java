package bikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {
	@Test(groups = "smoke")
	public void launch() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.91wheels.com/bikes/honda/sp-125");
		Reporter.log("Honda launched succesfull",true);

}
}