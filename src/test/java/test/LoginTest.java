package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import config.BrowserSetup;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class LoginTest extends BrowserSetup{
	
	@Test
	public void loginToSite() throws Exception {
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		MyAccountPage myaccountpage = new MyAccountPage();
		homePage.loginClick();
		Thread.sleep(5000);
		homePage = loginPage.login("chandan@tanu.com", "sears123");
		Thread.sleep(5000);
		Assert.assertEquals(BaseTest.getRemoteWebDriver().getTitle(), "My account - My Store");
		Thread.sleep(2000);
		myaccountpage.signOut();
		
	}
	
}

