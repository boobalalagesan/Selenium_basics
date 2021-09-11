package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maximizeExample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.navigate().to("https://www.google.com/");
		//driver.manage().window().maximize();
		
		/*Dimension dimension=new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);*/
		
		/*ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");*/

	}

}
