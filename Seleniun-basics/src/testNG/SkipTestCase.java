package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority = 0)
	public void startCar() {
		System.out.println("Start car");
	}
	@Test(priority = 5,enabled = true)
	public void startmusic() {
		System.out.println("Start Music");
	}
	
	@Test(priority = 1)
	public void gear1() {
		System.out.println("1 st gear");
		
	}
	@Test(priority = 2)
	public void gear2() {
		System.out.println("2 st gear");
		
	}
	@Test(priority = 3)
	public void gear3() {
		System.out.println("3 st gear");
		
	}
	@Test(priority = 4)
	public void gear4() {
		System.out.println("4 st gear");
		
	}


}
