package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



@FindBy (xpath="//input[@name='search']") WebElement SearchBar;
@FindBy (xpath="//div[@id='search'] //child:: button[@type='button']")WebElement SearchButton;


public void SearchBar() {
	SearchBar.sendKeys("laptops");
}
public void SearchButton() {
	SearchButton.click();
}
}