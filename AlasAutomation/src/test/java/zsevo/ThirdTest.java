package zsevo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.OrangePage;
import resources.Base;

public class ThirdTest extends Base {

	WebDriver driver;
	OrangePage orange;

	@BeforeMethod
	public void setUp() throws IOException {
		driver = initializeDriver();
		orange = new OrangePage(driver);
		driver.manage().window().maximize();

	}
	@Test
	public void test1() throws InterruptedException {
		//go to the page 
		driver.get("https://orangehrm-demo-7x.orangehrmlive.com/");
		//click on the login button
		orange.clickOnLogin();
		//click on the Recruitment
		Thread.sleep(10000);
		orange.clickOnRecruitment();
		//click on the candidates option
		orange.clickOnCandidates();
		//switch to iframe
		driver.switchTo().frame("noncoreIframe");
		//click on the add candidate button		
		Thread.sleep(5000);
		//click on the add button
		orange.addCandidate();
		//wait form to load
		Thread.sleep(10000);
		//enter the first name
		orange.setFirstName("Marko");
		//enter last name
		orange.setLastName("Majkic");
		//enter email
		orange.setEmail("marko@gmail.com");
		String projectPath = System.getProperty("user.dir");
		//upload resume file
		orange.setResume(projectPath+"\\Files\\teacher.pdf");
		//click on the vacancy
		orange.clickOnVacancy();
		//choose vacancy option
		orange.clickOnOption();
		//click on save button
		orange.clickOnSave();
		//click on the check box of fresh candidate
		Thread.sleep(2000);
		orange.clickCheckBox();
		//click on dots menu
		orange.clickOnDotsMenu();
		//click on delete option
		orange.clickOnDelete();
		Thread.sleep(3000);
		//confirm delete
		orange.clickConfirm();
		//click on the user icon
		Thread.sleep(3000);
		orange.clickOnUserIcon();
		//click on logout
		orange.clickOnLogOut();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
