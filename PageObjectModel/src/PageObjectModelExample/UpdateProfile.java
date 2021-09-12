package PageObjectModelExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPageObjects;
import PageObjects.UpdateMyInfoObjects;

public class UpdateProfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		//Pagefactory model
		PageFactory.initElements(driver, LoginPageObjects.class);
		PageFactory.initElements(driver, UpdateMyInfoObjects.class);

		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.passWord.sendKeys("admin123");
		LoginPageObjects.button.click();

		UpdateMyInfoObjects.clickMyInfo.click();
		UpdateMyInfoObjects.clickEdit.click();
		UpdateMyInfoObjects.editOtherID.sendKeys("1234");
		UpdateMyInfoObjects.clickSave.click();


		driver.quit();
	}

}
