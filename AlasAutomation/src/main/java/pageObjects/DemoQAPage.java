package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helper.Helper;

public class DemoQAPage extends Helper{

	public WebDriver driver;
	public Actions action;

	public DemoQAPage(WebDriver driver) {
		super(driver);
	}

	//locator for the Interactions card
	By interactionCard = By.xpath("(//*[@class = 'card-up'])[5]");
	//locator for the Droppable option from the left column
	By droppable = By.xpath("//*[contains(text(), 'Droppable')]");


	//get Interactions card and click on it
	public void clickInterCard() {
		//explicit wait for the Interaction card
		WebElement el = elToBeClickable(interactionCard);
		el.click();
	}
	//get Droppable element and click on it
	public void clickDroppable() {
		//explicit wait for the Droppable option
		WebElement el = elToBeVisible(droppable);
		el.click();
	}

}
