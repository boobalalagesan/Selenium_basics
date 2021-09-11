package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("Apple");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("Apple");
	}

	@Test(groups = {"Moto"})
	public void moto1() {
		System.out.println("Moto");
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("Moto");
	}
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("vivo");
	}
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("vivo");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo1() {
		System.out.println("lenovo");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo2() {
		System.out.println("lenovo");
	}

}
