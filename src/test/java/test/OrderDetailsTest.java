package test;

import org.testng.annotations.Test;

import config.BrowserSetup;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.OrderDetailsPage;

public class OrderDetailsTest extends BrowserSetup{
	
	@Test
	public void getSingleOrderDetails() throws Exception {
		MyAccountPage myaccount = new MyAccountPage();
		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		OrderDetailsPage orderPage = new OrderDetailsPage();
		homePage.loginClick();
		Thread.sleep(5000);
		homePage = loginPage.login("chandan@tanu.com", "sears123");
		Thread.sleep(5000);
		System.out.println("Clicking on order Details");
		myaccount.btnOrderDetails.click();
		Thread.sleep(5000);
		int orderSize=orderPage.getSingleOrderDetails().size();
		for(int i=0;i<orderSize;i++) {
			System.out.println(orderPage.getSingleOrderDetails().get(i).getAttribute("className") +" : "+orderPage.getSingleOrderDetails().get(i).getText());
		}
		Thread.sleep(2000);
	}

}
