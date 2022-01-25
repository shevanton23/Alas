package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Helper;

public class DroppablePage extends Helper{
	
	public DroppablePage(WebDriver driver) {
		super(driver);
	}

	//locator for the drag box
	By drag = By.id("draggable");
	//locator for the drop box
	By drop = By.id("droppable");
	//locator for the droppable text
	By dropText = By.cssSelector("#droppable>p");
    //locator for the Widgets option
	By widget = By.xpath("//*[contains(text(),'Widgets' )]");
	
	
	//get the drag box element
	public WebElement getDrag() {
		WebElement el = elToBePresence(drag);
		return el;
	}
	//get the drop box element
	public WebElement getDrop() {
		WebElement el = elToBePresence(drop);
		return el;
	}
	//get the droppable text
	public void printDroppableText() {
		WebElement el = elToBePresence(dropText);
		el.getText();
	}
	//click on the widget option
	public void clickOnWidget() {
		WebElement el = elToBePresence(widget);
		el.click();
	}

}
