package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.SearchPage;

public class TS002_SearchFunctionality extends  BaseClass{
	  
	    SearchPage searchPage;

	    @BeforeClass
	    public void setUpPages() {	     
	        searchPage = new SearchPage(driver);
	    }
	
	@Test(priority=1)
	public void Search() {
		 searchPage.SearchBar();
		 searchPage.SearchButton();
	}

}
