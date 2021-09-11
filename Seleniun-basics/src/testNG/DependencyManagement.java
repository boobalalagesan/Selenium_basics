package testNG;

import org.testng.annotations.Test;

public class DependencyManagement {
	@Test
	public void sslc() {
		System.out.println("SSLC");
		
	}
	@Test(dependsOnMethods = "sslc")
	public void hsc() {
		System.out.println("HSC");
		
	}
	@Test(dependsOnMethods = "hsc")
	public void engineering () {
		
		System.out.println("College");
	}

}