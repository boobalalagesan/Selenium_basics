package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateMyInfoObjects {
	
	@FindBy(id = "menu_pim_viewMyDetails")
	public static WebElement clickMyInfo;
	
	@FindBy(id = "btnSave")
	public static WebElement clickEdit;
	
	@FindBy(id = "personal_txtOtherID")
	public static WebElement editOtherID;
	
	@FindBy(id = "btnSave")
	public static WebElement clickSave;
	
}
	
	/*
	 * public static WebElement clickMyInfo(WebDriver driver) { return
	 * driver.findElement(By.id("menu_pim_viewMyDetails")); }
	 * 
	 * public static WebElement clickEdit(WebDriver driver) { return
	 * driver.findElement(By.id("btnSave")); }
	 * 
	 * public static WebElement editOtherID(WebDriver driver) { return
	 * driver.findElement(By.id("personal_txtOtherID")); }
	 * 
	 * public static WebElement clickSave(WebDriver driver) { return
	 * driver.findElement(By.id("btnSave")); }
	 */


