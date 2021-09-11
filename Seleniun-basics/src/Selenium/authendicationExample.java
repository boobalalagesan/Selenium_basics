package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class authendicationExample {

	public static void main(String[] args) {
		
		ChromeOptions chromeOptions =new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(chromeOptions);
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth.com");

	}

}
