package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	
	@BeforeSuite
	public void openBrowser() {
		startTime=	System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Test
	public void openGoogle() {
		driver.navigate().to("https://www.google.com/");
		
	}
	@Test
	public void openBing() {
		
		driver.navigate().to("https://www.bing.com/");

	}
	@Test
	public void OpenYahoo() {
		
		driver.navigate().to("https://in.search.yahoo.com/");
		
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		long endTime=	System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken is "+totalTime);
		
	}

}
