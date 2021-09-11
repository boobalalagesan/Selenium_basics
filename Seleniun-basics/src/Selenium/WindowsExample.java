package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement button1=driver.findElement(By.id("home"));
		button1.click();
		
		String oldWindow = driver.getWindowHandle();
		
		Set<String> handle =driver.getWindowHandles();
		
		for (String newWindow : handle) {
			driver.switchTo().window(newWindow);
			
		}
		
		WebElement afterNewWin=driver.findElement(
				By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		afterNewWin.click();
		
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		//multiple window
		WebElement multipleWindow=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindow.click();
		
		int size= driver.getWindowHandles().size();
		System.out.println("size is "+size);
		//Close new window
		WebElement newWindowClose=driver.findElement(By.id("color"));
		newWindowClose.click();
		
		Set<String> newNoClose = driver.getWindowHandles();
		
		for (String allwindows : newNoClose) {
			if(!allwindows.equals(oldWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		}
		driver.quit();

	}

}
