// reusable methods for explicit wait

package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
WebDriver driver;
	
	public Helper(WebDriver driver) {
		this.driver = driver;
	}
	
	// explicit wait for presence of element
	public WebElement elToBePresence(By locator) {
		WebElement el = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.presenceOfElementLocated(locator));
		return el;
	}
	
	//explicit wait for element to be clickable
	public WebElement elToBeClickable(By locator) {
		WebElement el = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(locator));
		return el;
	}
	//explicit wait for element to be visible
		public WebElement elToBeVisible(By locator) {
			WebElement el = new WebDriverWait(driver, 10)
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return el;
		}

}
