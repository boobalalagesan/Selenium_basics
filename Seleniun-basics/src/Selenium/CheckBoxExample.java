package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");

		WebElement check1=driver.findElement(
				By.xpath("/html/body/div/div/div[3]/section/div[1]/div[1]/input"));
		check1.click();

		WebElement selectedCheck=driver.findElement(
				By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean sel = selectedCheck.isSelected();
		System.out.println(sel);

		WebElement selected1=driver.findElement(
				By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));

		if(selected1.isSelected()) {
			selected1.click();
		}
		else
			selected1.click();

		WebElement selected2=driver.findElement(
				By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		if(selected2.isSelected()) {
			selected2.click();
		}
	}

}
