package Selenium;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class waitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//implicit wait
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);



		driver.navigate().to("https://www.phptravels.net/login");

		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys("user@phptravels.com");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement clickButton=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));  
		clickButton.click();


		//WebElement profile=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a"));
		//profile.click();

		//explicit wait
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//WebElement profile=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a")));

		//Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("/html/body/div[1]/div/div[3]/ul/li[4]/a")) ;
			}
			 
		});
		profile.click();

		driver.close();

	}

}
