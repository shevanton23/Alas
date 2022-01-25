package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Helper;

public class GooglePage extends Helper{

	public GooglePage(WebDriver driver) {
		super(driver);
	}

	//locator for the Search input field
	By search = By.cssSelector("input[name = q]");
	//locator for the Google search button
	By googleBtn = By.xpath("//*[@class = 'FPdoLc lJ9FBc']/center/input[@name = 'btnK']");
	// locator for the Demo QA link
	By demoQA = By.xpath("//h3[contains(text(), 'Demo QA')]");


	//get the Search field
	public WebElement getSearch() {
		//explicit wait for the Search field
		WebElement el = elToBePresence(search);
		return el;
	}
	//clear field and set value to the Search field
	public void setSearchValue(String text) {
		WebElement el = getSearch();
		el.clear();
		el.sendKeys(text);
	}
	//get the Google button and click on it
	public void clickGoogleBtn() {
		//explicit wait for the Google button
		WebElement el = elToBeClickable(googleBtn);
		el.click();
	}
	//get the Demo Qa link and click on it
	public void clickOnDemoLink() {
		//explicit wait for the Demo QA link
		WebElement el = elToBeClickable(demoQA);
		el.click();
	}
	
}
