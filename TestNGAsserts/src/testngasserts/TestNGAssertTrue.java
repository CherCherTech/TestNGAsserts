package testngasserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertTrue {
	@Test
	public void testAssertTrue()
	{
		int i = 10;
		Assert.assertTrue(i < 300 && i > 5 , "Either 'i' is not less than '300' or not greater than '5'" );
		Assert.assertTrue( 2>1 );
		System.out.println("compare 2 is greated than 1");
		
		Assert.assertTrue( "chercher tech".equals("karthiQ") );
		System.out.println("compared two not equal string & this should not be executed");
	}
}
