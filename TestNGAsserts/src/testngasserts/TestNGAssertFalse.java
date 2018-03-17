package testngasserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertFalse {
	@Test
	public void testAssertFalse()
	{
		Assert.assertFalse( 2 > 30 , "comparing 2 greater than 30");
		System.out.println("this print will be executed as condition results in false");

		Assert.assertFalse(true == true);
		System.out.println("this will not be executed as condition results in true");
	}
}
