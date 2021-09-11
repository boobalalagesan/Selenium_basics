package Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class ActiveElement {
	static WebElement q;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.google.com/");
		
		//driver.switchTo().activeElement().sendKeys("duke"+Keys.ENTER);
		
		PageFactory.initElements(driver, ActiveElement.class);	
		q.sendKeys("Filter \n");

	}

}
