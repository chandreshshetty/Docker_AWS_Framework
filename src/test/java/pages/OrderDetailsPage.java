package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTest;

public class OrderDetailsPage extends BaseTest{
	
	public OrderDetailsPage(){
		
	}
	
	@FindBy(xpath="//tr[@class='first_item ']/td")
	List<WebElement> getOrderDetails;
	
	public List<WebElement> getSingleOrderDetails() {
		return getOrderDetails;
	}
	

}
