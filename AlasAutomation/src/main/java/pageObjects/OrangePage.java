package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Helper;

public class OrangePage extends Helper{
	
	public OrangePage(WebDriver driver) {
		super(driver);
	}

	//locator for the Login button
	By login = By.cssSelector("#btnLogin");
	//locator for the Recruitment 
	By recruitment = By.xpath("(//*[contains(text(), 'Recruitment')])[1]");
	//locator for the Candidates option
	By candidates = By.xpath("(//*[contains(text(), 'Candidates')])[1]");
	//locator for the Add button
	By add = By.cssSelector("#addItemBtn");
	//locator for the first name
	By firstName = By.id("addCandidate_firstName");
	//locator for the last name
	By lastName = By.id("addCandidate_lastName");
	//locator for the email
	By email = By.id("addCandidate_email");
	//locator for the resume
	By resume = By.id("addCandidate_resume");
	//locator for the vacancy
	By vacancy = By.id("textarea_addCandidate_vacancy");
	//locator for vacancy option
	By vacancyOption = By.xpath("(//*[contains(text(), 'Software QA Engineer')])[1]");
	//locator for the save button
	By saveCandidate = By.id("saveCandidateButton");
	//locator for the added candidate
	By freshCandidate = By.xpath("//*[contains(text(), 'marko@gmail.com')]/preceding-sibling::td[@class = 'material-checkbox']/label");
	//locator for 3 dots menu
	By dots = By.cssSelector("#ohrmList_Menu");
	//locator for deleting 
	By deleteBtn = By.id("deleteItemBtn");
	//locator to confirm deleting candidate
	By confirm = By.id("candidate-delete-button");
	//locator for the user icon
	By userIcon = By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/a/span[2]/i");
	//locator for the log out
	By logout = By.xpath("//*[@class = 'dropdown-content active']/li[3]/a");

	//click on the login button
	public void clickOnLogin() {
		//explicit wait for the login button
		WebElement el = elToBeClickable(login);
		el.click();
	}
	//click on the Recruitment
	public void clickOnRecruitment() {
		//explicit wait for the recruitment button
		WebElement el = elToBeClickable(recruitment);
		el.click();
	}
	//click on the candidates option
	public void clickOnCandidates() {
		//explicit wait for the candidates option
		WebElement el = elToBeClickable(candidates);
		el.click();
	}
	//click on the Add button to add candidate
	public void addCandidate() {
		//explicit wait for the Add button
		WebElement el = elToBeClickable(add);
		el.click();
	}
	//get the first name input field
	public WebElement getFirstName() {
		WebElement el = elToBePresence(firstName);
		return el;
	}
	//enter first name
	public void setFirstName(String text) {
		WebElement el = getFirstName();
		el.sendKeys(text);
	}
	//get the last name field
	public WebElement getLastName() {
		WebElement el = elToBePresence(lastName);
		return el;
	}
	//enter the last name
	public void setLastName(String text) {
		WebElement el = getLastName();
		el.sendKeys(text);
	}
	//get email input field
	public WebElement getEmail() {
		WebElement el = elToBePresence(email);
		return el;
	}
	//enter the email
	public void setEmail(String text) {
		WebElement el = getEmail();
		el.sendKeys(text);
	}
	//get the resume element
	public WebElement getResume() {
		WebElement el = elToBePresence(resume);
		return el;
	}
	//set the resume
	public void setResume(String path) {
		WebElement el = getResume();
		el.sendKeys(path);
	}
	//get vacancy
	public WebElement getVacancy() {
		WebElement el = elToBePresence(vacancy);
		return el;
	}
	//click on vacancy
	public void clickOnVacancy() {
		WebElement el = getVacancy();
		el.click();
	}
	//get vacancy option
	public WebElement getVacancyOption() {
		WebElement el = elToBePresence(vacancyOption);
		return el;
	}
	//click on vacancy option
	public void clickOnOption() {
		WebElement el = getVacancyOption();
		el.click();
	}
	//get save button
	public WebElement getSaveBtn() {
		WebElement el = elToBeClickable(saveCandidate);
		return el;
	}
	//click on save button
	public void clickOnSave() {
		WebElement el = getSaveBtn();
		el.click();
		
	}
	//get the check box of the new candidate
	public WebElement getCheckBox() {
		WebElement el = elToBeClickable(freshCandidate);
		return el;
	}
	//click on the check box of new candidate
	public void clickCheckBox() {
		WebElement el = getCheckBox();
		el.click();
	}
	//get dots menu
	public WebElement getDots() {
		WebElement el = elToBePresence(dots);
		return el;
	}
	//click on the dots menu
	public void clickOnDotsMenu() {
		WebElement el = getDots();
		el.click();
		
	}
	//get delete button
	public WebElement getDeleteBtn() {
		WebElement el = elToBePresence(deleteBtn);
		return el;
	}
	//click on the delete button
	public void clickOnDelete() {
		WebElement el = getDeleteBtn();
		el.click();
	}
	//get confirm button
	public WebElement getConfirmBtn() {
		WebElement el = elToBePresence(confirm);
		return el;
		
	}
	//confirm deleting
	public void clickConfirm() {
		WebElement el = getConfirmBtn();
		el.click();
	}
	//get the user icon
	public WebElement getUserIcon() {
		WebElement el = elToBePresence(userIcon);
		return el;
	}
	//click on the user icon
	public void clickOnUserIcon() {
		WebElement el = getUserIcon();
		el.click();
	}
	//get logout element
	public WebElement getLogout() {
		WebElement el = elToBeClickable(logout);
		return el;
	}
	//click on the logout
	public void clickOnLogOut() {
		WebElement el = getLogout();
		el.click();
		
	}
}
