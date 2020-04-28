package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class HomePage extends BaseTest {

	public HomePage() {
	}

	@FindBy(className = "login")
	public WebElement btnSignInHomePage;

	public void loginClick() {
		btnSignInHomePage.click();
	}

}
