package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calenderDatePicker=driver.findElement(By.id("datepicker"));
		calenderDatePicker.sendKeys("20/12/2021"+Keys.ENTER);
		
		////a[@title='Next']
		calenderDatePicker.click();
		WebElement nextMonth = driver.findElement(By.xpath("//a[@title='Next']"));
		nextMonth.click();
		
		WebElement dateSelect = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateSelect.click();
		

	}

}
