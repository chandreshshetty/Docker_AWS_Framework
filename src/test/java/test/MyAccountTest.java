package test;

import org.testng.annotations.Test;

import config.BrowserSetup;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class MyAccountTest extends BrowserSetup{
	
	@Test
	public void verifymyAccountTabVerify() throws Exception {
		MyAccountPage myaccount = new MyAccountPage();
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		homePage.loginClick();
		Thread.sleep(5000);
		homePage = loginPage.login("chandan@tanu.com", "sears123");
		Thread.sleep(5000);
		System.out.println(myaccount.myAccountList().size());
		for(int i=0;i<myaccount.myAccountList().size();i++) {
			System.out.println(myaccount.myAccountList().get(i).getText());
		}
	}

}
