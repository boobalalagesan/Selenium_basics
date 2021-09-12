package PageObjectModelExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPageObjects;

public class loginCase {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		//page factory
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.passWord.sendKeys("admin123");
		LoginPageObjects.button.click();
		
		driver.quit();
	}

}
/*
 * LoginPageObjects.userName(driver).sendKeys("Admin");
 * LoginPageObjects.passWord(driver).sendKeys("admin123");
 * LoginPageObjects.button(driver).click();
 */
