package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/radio.html");

		WebElement uncheck=driver.findElement(By.xpath(
				"/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		
		WebElement check=driver.findElement(By.xpath(
				"/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		boolean s1 = check.isSelected();
		boolean s2 = uncheck.isSelected();
		System.out.println(s1);
		System.out.println(s2);
		
		WebElement selectYear=driver.findElement(By.xpath(
				"/html/body/div/div/div[3]/section/div[3]/div/div/input[1]"));
		selectYear.click();

	}

}
