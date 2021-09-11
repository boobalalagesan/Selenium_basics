package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://testng.org/doc/download.html");
		//scroll
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
//		executor.executeScript("window.scroll(0,100)", "");
//		Thread.sleep(5000);
//		executor.executeScript("window.scroll(0,-450)", "");
		
		//go to bottom
		
//		executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
//		Thread.sleep(5000);
//		executor.executeScript("window.scroll(0,0)", "");
		
		//by webelement
		WebElement link=driver.findElement(By.linkText("Eclipse Marketplace"));
		executor.executeScript("arguments[0].scrollIntoView(true);", link);
		
		
		//use robot class
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
