package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement drop1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(drop1);
		select.selectByIndex(1);

		select.selectByValue("2");

		select.selectByVisibleText("Loadrunner");

		List<WebElement> listOfOptions =select.getOptions();
		int size = listOfOptions.size();
		System.out.println(size);

		drop1.sendKeys("Selenium");

		WebElement multiSelectBox=driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiBox=new Select(multiSelectBox);
		multiBox.selectByIndex(1);
		multiBox.selectByIndex(2);
		multiBox.selectByIndex(3);
		
	}

}
