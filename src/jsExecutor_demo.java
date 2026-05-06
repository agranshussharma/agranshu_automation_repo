import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class jsExecutor_demo {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		//Need of JSExecutor
		/*Sometimes, Selenium WebDriver alone
		 * will not be able to perform certain
		 * operations or interact with web elements.
		 * In that case, JavaScript is needed to make
		 * sure those actions are being performed accurately.*/ 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

        driver.get("https://login.yahoo.com/");

        driver.manage().window().maximize();
 
        //Get page title and Domain using JavascriptExecutor
        String titleText =  jse.executeScript("return document.title;").toString();
        System.out.println("Page Title is: "+ titleText);
 
        String domainName=  jse.executeScript("return document.domain;").toString();
        System.out.println("Domain is: "+domainName);
// 
//      
        WebElement m = driver.findElement(By.xpath("//input[@id='persistent']"));
        
        //m.click();
        jse.executeScript("arguments[0].click();", m);
//		
//        //verticalScrollBy1000px
        jse.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
        
		//driver.quit();

	}
}
