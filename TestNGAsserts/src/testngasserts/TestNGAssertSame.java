package testngasserts;

import org.testng.Assert;

public class TestNGAssertSame {
	public static void main(String[] args) {
		String s1 = "Chercher tech";
		String s2 = "Chercher tech";
		// strings created with double quotes keyword will have same addresses if content is same
		Assert.assertSame(s1, s2, "Strings not sharing same address when we create using double quotes");
		
		String s3 = new String("Google");
		String s4 = new String("Google");
		// compare using Assert Equals, assertion passes
		Assert.assertEquals(s3,  s4, "string content comparision failed");
		// strings created with new keyword will have different addresses
		Assert.assertSame(s3, s4, "String as not sharing same address when created using 'new' keyword");
	}
}
