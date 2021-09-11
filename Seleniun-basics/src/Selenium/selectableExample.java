package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectable=driver.findElements(
				By.xpath("//*[@id=\'selectable\']/li"));
		int size=selectable.size();
		System.out.println(size);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();
		
		//Actions action = new Actions(driver);
		action.clickAndHold(selectable.get(4));
		action.clickAndHold(selectable.get(5));
		action.clickAndHold(selectable.get(3));
		action.build().perform();
	}

}
