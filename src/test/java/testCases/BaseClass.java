package testCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public Properties p;

	
	
	@BeforeClass(groups= {"Sanity"})
	@Parameters({"os","browser"})
	public void setUp(String os,String br) throws IOException {
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass());

		switch (br.toLowerCase()) {
		case "chrome":
			chromeSetup();
			break;
		case "edge":
			edgeSetup();
			break;
		case "firefox":
			fireFoxSetup();
			break;
		default:
			System.out.println("Invalid browser option");
		}

		
		driver.get(p.getProperty("appUrl"));// Initialize WebDriver
		driver.manage().window().maximize();
	}

	public void chromeSetup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
	}

	public void edgeSetup() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		driver = new EdgeDriver(options);
	}

	public void fireFoxSetup() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		driver = new FirefoxDriver(options);
	}
	public String captureScreen(String tname) throws IOException {
	  
	    String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	    String generatedNumber = RandomStringUtils.randomNumeric(10);
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + "_" + generatedNumber + ".png";
	    File targetFile = new File(targetFilePath);
	    sourceFile.renameTo(targetFile);
	    return targetFilePath;
	}
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//
//	}

}
