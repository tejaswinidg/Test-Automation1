package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterPage extends BasePage{
	
	public RegisterPage(WebDriver driver) {
		super(driver);	
	}

@FindBy (xpath="//input[@id='input-firstname']") WebElement firstName;

@FindBy (xpath="//input[@id='input-lastname']") WebElement lastName;

@FindBy (xpath ="//input[@id='input-email']") WebElement email1;

@FindBy (xpath ="//input[@id='input-country']") WebElement country;

@FindBy (xpath="//input[@name='agree']") WebElement agree;

@FindBy (xpath ="//input[@id='input-password']") WebElement password;

@FindBy (xpath ="//button[text()='Continue']") WebElement Continue;



public void firsName(String firstname) {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='input-firstname']")));
	firstName.sendKeys(firstname);
}
public void lastName(String lastname) {
	lastName.sendKeys(lastname);
}
public void email(String email)  {
	email1.sendKeys(email);
}

public void  password(String password1){
	password.sendKeys(password1);
}

public void agreeButton() {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();", agree);
	
}

public void clickRegisterButton() {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click();",Continue);
}


public void warning() {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),' Warning: E-Mail Address is already registered! ')]")));
	WebElement warningElement =driver.findElement(By.xpath("//*[contains(text(),' Warning: E-Mail Address is already registered! ')]"));
       // Check if the element is found and is displayed
       if (warningElement != null && warningElement.isDisplayed()) {
           System.out.println("Warning displayed: " + warningElement.getText());
       } else {
           System.out.println("Warning not displayed.");
       }
}
}
