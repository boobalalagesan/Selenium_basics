package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class suggestExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.navigate().to("https://www.google.com/");
		
		WebElement searchKW=driver.findElement(By.name("q"));
		searchKW.sendKeys("hair oil"+Keys.ENTER);
		Thread.sleep(6000);
		
		List<WebElement> totalLinks= driver.findElements(
				By.xpath("//*[@id='rso']//following::h3//following::div/cite"));
		for (WebElement webElement : totalLinks) {
			System.out.println(webElement.getText());
		}
		
		
		/*List<WebElement> listSuggest= driver.findElements(By.xpath("//ul[@role='listbox']/child::*"));
		
		//int position=0;
		for (WebElement webElement : listSuggest) {
			String text = webElement.getText();
			System.out.println(text);
			
			if(text.contains("grey")) {
				webElement.click();
				break;
			}*/
			//position++;
			
			/*if(position==3) {
				webElement.click();
				break;
			}*/
			
			
		//}
		//driver.close();
		

	}

}
