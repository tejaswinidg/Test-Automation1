package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.util1;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC001_HomePageRegister extends BaseClass {

	@Test(priority=1)
	public void verify_accountRegister() {
		
		HomePage hp= new HomePage(driver);
	    driver.manage().window().maximize();
		hp.clickMyAccount();
		hp.MyAccount_Register();
		hp.clickMyAccount();
		hp.MyAccount_LogIn();
		
		
	}
		
//		@Test(dataProvider="data",dataProviderClass=util1.class,priority=2)
//	
//		public void test(String firstname,String lastname,String email,String password1)  {
//		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
//		System.out.println(firstname);
//		
//		driver.get("https://demo.opencart.com/en-gb?route=account/register");
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Register Account']")));
//		System.out.println("Moving into the register page");
//		String url1=driver.getCurrentUrl();
//	    System.out.println(url1);
//		Assert.assertEquals(url1, "https://demo.opencart.com/en-gb?route=account/register","url as expected");
//		
//		
//		
//		
//		
//		RegisterPage rp= new RegisterPage(driver);
//		System.out.println("Currently in registerpage");
//		rp.firsName(firstname);
//		rp.lastName(lastname);
//		rp.email(email);
//		rp.password(password1);
//		rp.agreeButton();
//		rp.clickRegisterButton();
//		try {
//		    rp.warning(); // This may throw an exception
//		} catch (Exception e) {
//		    System.out.println("An error occurred: " + e.getMessage());
//		    // You can also log the stack trace if needed
//		    e.printStackTrace();
//		}
//	}
		
		
		
	
}
