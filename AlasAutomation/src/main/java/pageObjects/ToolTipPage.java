package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Helper;

public class ToolTipPage extends Helper{
	
	public ToolTipPage(WebDriver driver) {
		super(driver);
	}
	
	//locator for the tool tips page
	By tollTip = By.xpath("//*[contains(text(),'Tool Tips' )]");
	//locator for the tool tip message
	By toolMsg = By.cssSelector(".tooltip-inner");
	//locator for the tool tip
	By tooTipBtn = By.cssSelector("#toolTipButton");
	
	//click on the tool tip option
	public void clickOnToolTip() {
		WebElement el = elToBePresence(tollTip);
		el.click();
	}
	//get tool tip message
	public WebElement getToolMessage() {
		WebElement el = elToBePresence(toolMsg);
		return el;
	}
	//get the tool tip button
	public WebElement getToolTipBtn() {
		WebElement el = elToBePresence(tooTipBtn);
		return el;
		
	}
}
