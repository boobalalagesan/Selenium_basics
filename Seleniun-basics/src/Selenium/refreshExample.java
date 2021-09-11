package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class refreshExample {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		WebElement searchKW=driver.findElement(By.name("q"));
		//searchKW.sendKeys("hair oil"+Keys.ENTER);
		
		//driver.navigate().refresh();
		
		//get current URL
		//driver.get(driver.getCurrentUrl());
		
		//Java script executor
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()");//history.go(0)
		
		//F5
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		
		

	}

}
