package testngasserts;

import org.openqa.selenium.NoSuchFrameException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGFail {
	@Test
	public void testFail()
	{
		Assert.fail("test purpose", new NoSuchFrameException("user thrown exception"));
	}
}
