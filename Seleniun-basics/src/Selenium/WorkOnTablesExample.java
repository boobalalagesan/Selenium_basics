package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkOnTablesExample {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.leafground.com/pages/table.html");
		//Column
		List<WebElement> noOfColumn = driver.findElements(By.tagName("th"));
		int columnSize = noOfColumn.size();
		System.out.println("Column size is "+columnSize);
		//Row
		List<WebElement> noOfRow = driver.findElements(By.tagName("tr"));
		int rowSize = noOfRow.size();
		System.out.println("Row size is "+rowSize);

		////td[normalize-space()='Learn to interact with Elements']//following::td[1]
		//get table value
		WebElement getPercentValue =driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact using Keyboard, Actions']//following::td[1]"));
		String percentValue = getPercentValue.getText();
		System.out.println("Percentage is "+percentValue);

		List<WebElement> allPercent = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numList = new ArrayList<Integer>();

		for (WebElement webElement : allPercent) {
			String indiVal = webElement.getText().replace("%", "");
			Integer.parseInt(indiVal);
			numList.add(Integer.parseInt(indiVal));
		}

		System.out.println(numList);

		int smallVal = Collections.min(numList);
		System.out.println(smallVal);

		String finalString=Integer.toString(smallVal)+"%";

		String finalXpath = "//td[text() ="+"\""+finalString+"\""+"]"+"//following::td[1]"+"//input";

		System.out.println(finalXpath);

		//"//td[normalize-space()='30%']//following::td[1]//input"
		WebElement check = driver.findElement(By.xpath(finalXpath));
		check.click();

		driver.close();

	}

}
