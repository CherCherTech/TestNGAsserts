package testngasserts;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;

public class TestNGAssertEquals {
	public static void main(String[] args) {
		List l = new ArrayList();
		List l2 = new ArrayList();
		
		// compare the empty lists
		Assert.assertEquals(l, l2);
		
		l2.add(3);
		// compare the list with element
		Assert.assertEquals(l, l2, "both List are not same");
	}
}
