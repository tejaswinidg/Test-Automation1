package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
//	@FindBy(xpath="//span[normalize-space()='My Account']")
//	WebElement element;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement login;
	
	
	public void clickMyAccount() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = null;
		int attempts = 0;
		while (attempts < 3) {
		    try {
		    	
		        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='My Account']")));
		        element.click();

		        // Wait for the page to refresh and re-locate elements
//		        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));
		        // Re-locate the element
		        element = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
		      
		        break; // Exit loop if successful
		    } catch (Exception e) {
		        attempts++;
		        System.out.println("Exception caught: " + e.getMessage() + ", retrying...");
		        // Optional delay before retrying
		        
		    }
		}

		    if(register.isDisplayed() && login.isDisplayed()) { 
		    	System.out.println("nnnnnnnnnnnnnnnnnnn");
		    	
		    }
		   

	}
	


public void MyAccount_Register() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown']//a[normalize-space()='Register']")));
	register.click();
	String registerUrl= driver.getCurrentUrl();
	Assert.assertEquals(registerUrl, "https://demo.opencart.com/en-gb?route=account/register");
	System.out.println("Register url is displayed");
	System.out.println(registerUrl);

	
}
public void MyAccount_LogIn() {
	
	
	System.out.println("jjjjjjjjj");
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown']//a[normalize-space()='Login']")));	
	login.click();
	String logInUrl= driver.getCurrentUrl();
	Assert.assertEquals(logInUrl, "https://demo.opencart.com/en-gb?route=account/login");
	System.out.println("LogIn url is displayed");
	System.out.println(logInUrl);
	
}
}