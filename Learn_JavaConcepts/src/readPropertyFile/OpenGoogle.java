package readPropertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;
		FileInputStream stream=new FileInputStream("config.properties");

		Properties properties=new Properties();
		properties.load(stream);

		String browser= properties.getProperty("browser");


		if(browser.equalsIgnoreCase("chrome")) {
			String driverLocation= properties.getProperty("ChromeDriverLocation");
			System.setProperty("webdriver.chrome.driver",driverLocation);
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			String driverLocation= properties.getProperty("FirefoxDriverLocation");
			System.setProperty("webdriver.gecko.driver",driverLocation);
			driver = new FirefoxDriver();
		}

		System.setProperty("webdriver.chrome.driver","");


		driver.get("https://www.google.com/");

	}

}
