package testngasserts;

import org.testng.Assert;

public class TestNGAssertNotEquals {
	public static void main(String[] args) {
		int i1 =10;
		int i2 = 10;
		// compare i1, i2
		Assert.assertNotEquals(i1, i2, "i1, i2 are same");
	}
}
