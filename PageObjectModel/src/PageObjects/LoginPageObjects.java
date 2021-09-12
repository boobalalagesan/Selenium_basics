package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how =How.ID,using = "txtUsername")
	public static WebElement userName;
	
	@FindBy(id = "txtPassword")
	public static WebElement passWord;
	
	@FindBy(id = "btnLogin")
	public static WebElement button;
}
	
	

	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.id("txtUsername")); }
	 * 
	 * public static WebElement passWord(WebDriver driver) { return
	 * driver.findElement(By.id("txtPassword"));
	 * 
	 * }
	 * 
	 * public static WebElement button(WebDriver driver) { return
	 * driver.findElement(By.id("btnLogin"));
	 * 
	 * }
	 */

	

