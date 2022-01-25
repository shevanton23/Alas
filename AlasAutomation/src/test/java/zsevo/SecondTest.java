package zsevo;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.CheesePage;
import pageObjects.GooglePage;
import resources.Base;

public class SecondTest extends Base{

	WebDriver driver;
	GooglePage google;
	CheesePage cheese;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = initializeDriver();
		google = new GooglePage(driver);
		cheese = new CheesePage(driver);
		driver.manage().window().maximize();

	}
	@Test
	public void test1() throws InterruptedException {
		//go to the page 
		driver.get("https://www.google.com/");
		//enter text into the search field and hit Enter Key
		google.getSearch().sendKeys("cheese", Keys.ENTER);
		//cheese results in string format
		String numStr = cheese.resultsCheese();
		//convert to integer
		int num = Integer.parseInt(numStr);
		//max number of the search results
		int maxNumber = 777;
		Assert.assertEquals(num, maxNumber, "There is too much cheese on the internet");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
