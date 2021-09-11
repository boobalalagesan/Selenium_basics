package testNG;

import org.testng.annotations.Test;

public class DriveCar {
	@Test(priority = 0)
	public void startCar() {
		System.out.println("Start car");
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
