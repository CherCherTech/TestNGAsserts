package testngasserts;

import org.testng.Assert;

public class TestNGAssertNotSame {
	public static void main(String[] args) {
		String s1 = "Chercher tech";
		System.out.println("s1 address is : "+System.identityHashCode(s1));
		String s2 = "Chercher tech";
		System.out.println("s2 address is : "+System.identityHashCode(s2));
		// strings created with double quotes keyword will have same addresses if content is same
		Assert.assertNotSame(s1, s2, "Strings not sharing same address when we create using double quotes");
	}
}
