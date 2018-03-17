package testngasserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestNGAssertNull {
	public static void main(String[] args) {
		// set the geckodriver.exe property
		System.setProperty("webdriver.gecko.driver", "C:/Users/user/Pictures/geckodriver.exe");
				
		WebDriver driver = new FirefoxDriver();
		//check driver is null
		Assert.assertNull(driver);
	}
}
