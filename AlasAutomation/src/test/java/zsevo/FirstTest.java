package zsevo;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.DemoQAPage;
import pageObjects.DroppablePage;
import pageObjects.GooglePage;
import pageObjects.ToolTipPage;
import resources.Base;

public class FirstTest extends Base{

	WebDriver driver;
	GooglePage google;
	DemoQAPage demo;
	DroppablePage drop;
	Actions action;
	ToolTipPage tip;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		google = new GooglePage(driver);
		demo = new DemoQAPage(driver);
		drop = new DroppablePage(driver);
		action = new Actions(driver);
		tip = new ToolTipPage(driver);
	}
	@Test
	public void test1() throws IOException, InterruptedException {
		//open google
		driver.get("https://www.google.rs/");
		//check the title
		assertEquals(driver.getTitle(), "Google");
		//enter text into the search field
		google.setSearchValue("demoqa.com");
		//click on the Google search button
		google.clickGoogleBtn();
		//click on the Demo QA link
		google.clickOnDemoLink();
		//click on the Interaction card
		demo.clickInterCard();
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1500);");
		//click on the Droppable option
		demo.clickDroppable();
		//perform drag and drop action
		action.dragAndDrop(drop.getDrag(), drop.getDrop()).perform();
		//print text from the drop box
		System.out.println(drop.getDrop().getText());
		//take a screenshot
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screnshots/screen.png"));
		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 1500);");
		//click on the widget option
		drop.clickOnWidget();
		//click on the tool tip
		tip.clickOnToolTip();
		//hover over the tool tip
		Thread.sleep(3000);
		action.moveToElement(tip.getToolTipBtn()).perform();
		//print the tool tip message
		System.out.println(tip.getToolMessage().getText());
	}


	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
