package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	String name="sams";
	
	@Test
	public void checkEqual() {
		
		//Assert.assertNotEquals(name, "ams");
		Assert.assertEquals(name, "sams");
	}

}
