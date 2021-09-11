package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("boobalalagesan@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("added");
		
		WebElement getText=driver.findElement(By.name("username"));
		String val=getText.getAttribute("value");
		System.out.println(val);
	    
	    WebElement clearText=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	    clearText.clear();
	    
	    WebElement disBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	    boolean enable= disBox.isEnabled();
	    System.out.println(enable);
	}

}
