package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downLink = driver.findElement(
				By.linkText("Download Excel"));
		downLink.click();
		
		Thread.sleep(4000);
		
		//C:\Users\booba\Downloads
		
		File filelocation = new File("C:\\Users\\booba\\Downloads");
		File[] totalFiles = filelocation.listFiles();
		
		for (File file : totalFiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("File downloaded");
				break;
			}
			
		}

	}

}
