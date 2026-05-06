import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com");


		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hpotter5@test.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testing@2025");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		driver.get("https://hogwards-dev-ed.develop.lightning.force.com/lightning/r/Contact/003Ig000006IWDDIA4/view");

		String getAttributeVaue = driver.findElement(By.xpath("//html//div//h1//slot//lightning-formatted-name")).getAttribute("slot");
		System.out.println("getAttributeVaue** " + getAttributeVaue);
		
		boolean displayFlag = driver.findElement(By.xpath("//p[text()='Title']//following::p//slot//lightning-formatted-text[text()='CFO']")).isDisplayed();
		System.out.println("displayFlag** "+ displayFlag);
		
		//explicitWait() tells the WebDriver to wait for certain conditions before maximum time exceeds
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//multiple conditions
		//wait.until(ExpectedConditions.visibilityOf(usernameElement));
		Thread.sleep(5000);
		driver.quit();
}}
