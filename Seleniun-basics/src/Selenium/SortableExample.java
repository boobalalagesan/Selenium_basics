package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/sortable.html");

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'sortable\']/li")); 
		WebElement fromElement=elements.get(6);
		WebElement toElement=elements.get(0);
		
		Actions action=new Actions(driver);
		action.clickAndHold(fromElement);
		action.moveToElement(toElement);
		action.release(toElement);
		action.build().perform();
		
		//driver.close();


	}

}
