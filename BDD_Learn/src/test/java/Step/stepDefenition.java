package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefenition {				
			

	    WebDriver driver;			
	    		
	    @Given("^User enters google.com$")					
	    public void user_enters_google() throws Throwable							
	    {		
	       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://www.google.com/");					
	    }		

	    @When("^user is typing the search term\"(.*)\"$")			
	    public void enter_KW(String username) throws Throwable 							
	    {	
	    	//System.out.println(username);
	       WebElement ele1= driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));					
	       		ele1.sendKeys(username);
	       		ele1.sendKeys(Keys.RETURN);
	    }	

	    @Then("^User should see the results$")					
	    public void closeBrowser() throws Throwable 							
	    {		
	       driver.close();
	    }		
	}	




