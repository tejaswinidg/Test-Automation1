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
import pageObjects.SearchPage;

public class TS001_HomePageFunctionality extends BaseClass {
	HomePage HomePage;
	
	  @BeforeClass
	    public void setUpPages() {
	     
		  HomePage = new  HomePage(driver);
		  driver.manage().window().maximize();
	    }
	  
	  
      @Test(priority=1,enabled=false)
	  public void verify_accountRegister_TC001(){
    	  HomePage.myAccount();		  
	  }
	  
	  @Test(priority=2,enabled=false)
      public void verify_accountRegister_TC002() {
    	  HomePage.clickMyAccount();;
      }
	  
	  
	@Test(priority=3,enabled=false)
	public void verify_accountRegister_TC003() {
	
				   
		 HomePage.clickMyAccount();
		 HomePage.MyAccount_Register();
				
	}
	
	@Test(priority=4,enabled=false)
	public void verify_accountLogIn_TC004() {
		 HomePage.clickMyAccount();
		 HomePage.MyAccount_LogIn();
	}
		

	@Test(priority=5,enabled=true)	
	public void verify_myAccount_dropdownClose_TC005() {	
		HomePage.MyAccount_dropdownClose();
	}
		
	
}
