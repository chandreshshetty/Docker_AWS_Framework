package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class MyAccountPage extends BaseTest {

	public MyAccountPage() {
		
	}

	@FindBy(className = "logout")
	WebElement btnSignOut;
	
	@FindBy(className = "myaccount-link-list")
	List<WebElement> myaccountlist;
	
	@FindBy(xpath="//a[@title='Orders']")
	public WebElement btnOrderDetails;

	public void signOut() {
		btnSignOut.click();
	}
	
	public List<WebElement> myAccountList() {
		return myaccountlist;
	}

}
