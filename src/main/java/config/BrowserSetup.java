package config;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup extends BaseTest {
	
	RemoteWebDriver driver=null;

	public enum BrowserType {
		Chrome, Firefox, IE, Safari
	}

	public void InitializeBrowser(BrowserType type) throws MalformedURLException {
		switch (type) {
		case Chrome:
			System.out.println("-----browser invoking-----");
			System.setProperty("Webdriver.chrome.driver", "E:\\Software\\chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			DesiredCapabilities cap = new DesiredCapabilities().chrome();
			URL url = new URL("http://localhost:4444/wd/hub");
			driver = new RemoteWebDriver(url,cap);
			BaseTest.setRemoteWebDriverLocal(driver);
			break;
		case Firefox:
			break;
		default:
			break;
		}
	}

	@BeforeMethod
	public void browserSetup() throws Exception {
		ConfigReader.readConfigData();
		InitializeBrowser(ConfigReader.browser);
		System.out.println("-----maximizing the browser window-----");
		BaseTest.getRemoteWebDriver().manage().window().maximize();
		BaseTest.getRemoteWebDriver().get(ConfigReader.URL);
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("-----closing down browser window-----");
		BaseTest.getRemoteWebDriver().quit();
	}

}
