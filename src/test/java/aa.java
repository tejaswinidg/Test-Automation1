package intro;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aa {
	WebDriver driver;
	@Test
	public void t() throws Exception{
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(options);// *[@id="modalId"]
	 
	 
//	  driver.get("https://parabank.parasoft.com/parabank/register.htm");
//	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jk");
	 
	
//	  driver.findElement(By.xpath("//*[text()='Admin Page']")).click();
//	String h=  driver.getTitle();
//	System.out.println("title of the window2");
//	  System.out.println(h);
//	  driver.navigate().back();
//	  String f=driver.getTitle();
//	  System.out.println("title of window1");
//	  System.out.println(f);
	  
	  
	  
//	  try {
//		
// driver.findElement(By.xpath("//h2[text()='TYPES OF MANUAL']"));
//System.out.println("l");

//JavascriptExecutor js=(JavascriptExecutor) driver;
//                              
//js.executeScript("arguments[0].click();",cl);
//	  List<WebElement> li=driver.findElements(By.xpath("//div [@class=\"sideBar--wrap newLeftbar\"]//h2[text()='TYPES OF MANUAL']/following-sibling::ul"));
//	 
//	  for(WebElement g:li) {
//		  if(g.getText().contains("White box Testing - Software Engineering")) {
//			  g.click();
//			  
//		  }
//	  }

//	  }
//	  catch(Exception e){
//			String FileName="iiiI";
//			// Creating instance of File
//			File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	
//			FileUtils.copyFile(File, new File("C:\\Users\\Tejaswini\\Desktop\\dd\\" + FileName + ".jpeg"));
//	  }
	 
//	 long start = System.currentTimeMillis();
//	 
//	driver.get("https://www.pepperfry.com/");
//		
//	long finish = System.currentTimeMillis();
//	long totalTime = finish - start; 
//	System.out.println("Total Time for page load - "+totalTime); 	
		
//
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions
//			.visibilityOfElementLocated(By.xpath("//div[@id='webengage-notification-container']/iframe")));
//
//	WebElement element = driver.findElement(By.xpath("//div[@id='webengage-notification-container']/iframe"));
//	driver.switchTo().frame(element);
//
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	WebElement a = driver.findElement(By.xpath("//div[@class='wrapper-outer']//div//a"));
//	js.executeScript("arguments[0].click();", a);
//	System.out.println("yyy");
//
//	driver.switchTo().defaultContent();
//
//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("bed");
//	driver.findElement(By.xpath("//button[@id='searchButton']")).click();
//	System.out.println("ttt");
//driver.findElement(By.xpath("//input[@id='search']")).clear();
//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("@");
//driver.findElement(By.xpath("//button[@id='searchButton']")).click();

//	driver.findElement(By.xpath("//a[text( )=' Furniture ']")).click();
//	WebElement b = driver.findElement(By.xpath("//*[text()='Office Furniture ']"));
//	js.executeScript("arguments[0].click();", b);
//
//	System.out.println("v");
//	wait.until(ExpectedConditions
//			.visibilityOfElementLocated(By.xpath("//button[@class='false select-btn ng-star-inserted']")));
//	WebElement c = driver.findElement(By.xpath("//button[@class='false select-btn ng-star-inserted']"));
//	System.out.println("q");
//	js.executeScript("arguments[0].click();", c);

	
	
//	wait.until(ExpectedConditions
//			.visibilityOfElementLocated(By.xpath("//div[@class='dropdown-main ng-star-inserted']/ul/li")));
//		List<WebElement> g = driver.findElements(By.xpath("//div[@class='dropdown-main ng-star-inserted']/ul/li"));
//		for (WebElement h : g) {
//			String s = h.getAttribute("data-value");
//		System.out.println(s);
//		
//
//			if (s.equals("Relevance")) {
//			
//				System.out.println("66");
//				js.executeScript("arguments[0].click();", h);
//			}
//			else {
//				System.out.println("ttttttttttttttttttt");
//			}
//	
//		} 
	

	
//this.TakeScreenshot("Googl", c); 
//	 System.out.println("i");
	
//}
//	  @Test
//	public  void z() throws IOException {
//		String FileName="iiiu";
//		// Creating instance of File
//		File File = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(File, new File("C:\\Users\\Tejaswini\\Desktop\\dd\\" + FileName + ".jpeg"));
//
//		
	}
}
