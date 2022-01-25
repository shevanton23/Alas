package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Helper;

public class CheesePage extends Helper{


	public CheesePage(WebDriver driver) {
		super(driver);
	}

	//locator for the search results
	By searchResults = By.id("result-stats");


	//get search results element
	public WebElement getResults() {
		WebElement el = elToBePresence(searchResults);
		return el;
	}
	//google results for cheese
	public String resultsCheese() {
		String cheese = getResults().getText();
		//remove the first 4 characters and after 15th character 
		String trimString = cheese.substring(4,15);
		//remove dots from string
		String strNew = trimString.replace(".", "");
		return strNew;
	}
	
}
