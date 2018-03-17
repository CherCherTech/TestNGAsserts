package testngasserts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestNGAssertNotNull {
	static WebDriver driver ;
	public static void main(String[] args) {
		//check driver is not null
		Assert.assertNotNull(driver);
	}
}
