package testCases;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Iterator;


public class TS001_ActiveLinks extends BaseClass{
	
	@Test
	public void activeLinks(){
	driver.get("https://demo.opencart.com/en-gb?route=account/register");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//aside[@id='column-right']/div/a")));
//	String d=driver.findElement(By.xpath("//aside[@id='column-right']/div/a[1]")).getText();
//	System.out.println(d);
	
	 String url = "";
	 HttpURLConnection huc = null;
        int respCode = 200;
	
	
	List<WebElement> links=driver.findElements(By.xpath("//aside[@id='column-right']/div/a"));
    Iterator<WebElement> it = links.iterator();
    
    while(it.hasNext()){
        
        url = it.next().getAttribute("href");
        
      
        
    
        if(url == null || url.isEmpty()){
System.out.println("URL is either not configured for anchor tag or it is empty");
            continue;
        }
        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());
            
            huc.setRequestMethod("HEAD");
            
            huc.connect();
            
            respCode = huc.getResponseCode();
            
            if(respCode >= 400){
                System.out.println(url+" is a broken link");
            }
            else{
                System.out.println(url+" is a valid link");
            }
                
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	}
}
