package Selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class screenShotExample {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		
		//Screenshot
		TakesScreenshot screenShot= (TakesScreenshot) driver;
		File screenFile= screenShot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile=new File("D:\\selenium\\ScreenShot\\sample1.png");
		FileHandler.copy(screenFile, destinationfile);
		
		
		WebElement alert1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alert1.click();
		
		
		
		Robot robot=new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationFile=new File("D:\\selenium\\ScreenShot\\sample2.png");
		ImageIO.write(source, "png", destinationFile);

	}

}
