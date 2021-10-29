package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());        	
        System.setProperty("webdriver.gecko.driver", "C:\\browser drivers\\geckodriver.exe");
	    driver = new FirefoxDriver();	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.demoqa.com");
WebElement e = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		act.click(e).perform();
         }
        
        @Test
 	public void ChromeTest()
 	{ 
System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());        	
     System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.demoqa.com"); 
	  WebElement e = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(e).perform();
		act.click(e).perform();
 	}
}
