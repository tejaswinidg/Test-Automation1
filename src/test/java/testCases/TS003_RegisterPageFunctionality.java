package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.RegisterPage;
import pageObjects.SearchPage;
import utilities.util1;

public class TS003_RegisterPageFunctionality  extends BaseClass{
	
	 RegisterPage registerPage;

	    @BeforeClass
	    public void setUpPages() {
	     
	        registerPage = new RegisterPage(driver);
	    }
	
		@Test(dataProvider="data",dataProviderClass=util1.class,priority=2)
	
	public void test(String firstname,String lastname,String email,String password1)  {
	
	

	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Register Account']")));
	System.out.println("Moving into the register page");
	String url1=driver.getCurrentUrl();
    System.out.println(url1);
	Assert.assertEquals(url1, "https://demo.opencart.com/en-gb?route=account/register","url as expected");
	
	
	
	
	
	
	System.out.println("Currently in registerpage");
	registerPage.firsName(firstname);
	registerPage.lastName(lastname);
	registerPage.email(email);
	registerPage.password(password1);
	registerPage.agreeButton();
	registerPage.clickRegisterButton();
	try {
		registerPage.warning(); // This may throw an exception
	} catch (Exception e) {
	    System.out.println("An error occurred: " + e.getMessage());
	    // You can also log the stack trace if needed
	    e.printStackTrace();
	}
	}
	catch(Exception e) {
		logger.error("Test failed");
		logger.debug("debug logs");
		Assert.fail();
		
	}
}

}
