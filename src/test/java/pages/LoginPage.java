package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class LoginPage extends BaseTest {

	public LoginPage() {
	}

	@FindBy(id = "email")
	public WebElement txtUserName;

	@FindBy(id = "passwd")
	public WebElement txtPassword;

	@FindBy(id  = "SubmitLogin")
	public WebElement btnLogin;

	public HomePage login(String username, String password) {
		txtUserName.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
		return new HomePage();
	}

}
