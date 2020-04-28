package base;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {
	
	private static ThreadLocal<RemoteWebDriver> remoteWebDriverThreadLocal = new ThreadLocal<RemoteWebDriver>();
	
	public static RemoteWebDriver getRemoteWebDriver() {
		return remoteWebDriverThreadLocal.get();
	}
	
	public static void setRemoteWebDriverLocal(RemoteWebDriver driverThreadLocal) {
		remoteWebDriverThreadLocal.set(driverThreadLocal);
	}

	public BaseTest() {
		PageFactory.initElements(getRemoteWebDriver(), this);
	}

}
