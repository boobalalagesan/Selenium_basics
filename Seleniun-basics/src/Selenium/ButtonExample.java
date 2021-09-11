package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		//find position
		WebElement getPositionButton = driver.findElement(By.id("position")) ;
		Point xypoint=getPositionButton.getLocation();
		int xval= xypoint.getX();
		int yval= xypoint.getY();
		System.out.println("x is"+xval+"Y is"+yval);
		
		//Find colour
		WebElement findColour=driver.findElement(By.id("color"));
		String colour=findColour.getCssValue("background-color");
		System.out.println("background colour is "+colour);
		
		//Find size
		WebElement findSize=driver.findElement(By.id("size"));
		int height=findSize.getSize().getHeight();
		int width=findSize.getSize().getWidth();
		System.out.println("heidht is" + height + " Width is" + width);
		
		WebElement homeclick=driver.findElement(By.id("home"));
		homeclick.click();
				
		driver.close();

	}

}
