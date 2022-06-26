package SeleniumGrid;

import java.lang.module.Configuration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Capabilities {
	
   DesiredCapabilities cap = new DesiredCapabilities();
   ChromeOptions optionsChrome = new ChromeOptions();
   FirefoxOptions optionsFireFox = new FirefoxOptions();
   EdgeOptions optionsEdge	= new EdgeOptions();
  
	
	@Test
	public void test01() {
	
    optionsChrome.addArguments("start-maximized");
	optionsChrome.setHeadless(true)	; //HeadLess Browser
    cap.setAcceptInsecureCerts(false);
  //optionsChrome.setAcceptInsecureCerts(false); //Insecure certifications
    optionsChrome.merge(cap);
	System.setProperty("webdriver.chrome.driver","C:\\Interviews\\SDET\\Selenium\\eclipse_workspace\\Drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver(optionsChrome);
	//driver.get("https://www.google.com");
	driver.get("http://expired.badssl.com");
	System.out.println(driver.getTitle());
	//cap.setBrowserName("chrome");
	cap.setVersion("10");
	cap.setPlatform(Platform.LINUX);
	cap.setCapability(CapabilityType.BROWSER_NAME, "Firefox");
	cap.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
	cap.setCapability(CapabilityType.APPLICATION_NAME,"TestApp");
	cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
	cap.setCapability("browserName", "Edge");
	System.out.println(cap.getPlatform());
	System.out.println(cap.getBrowserName());
	System.out.println(cap.getPlatform());
	System.out.println(cap.getVersion());
	System.out.println(cap.getCapabilityNames());

	System.out.println(cap.getCapability(CapabilityType.BROWSER_NAME));
	System.out.println(cap.getCapability(CapabilityType.ACCEPT_INSECURE_CERTS));
	System.out.println(cap.getCapability(CapabilityType.ACCEPT_SSL_CERTS));
	System.out.println(cap.getCapability(CapabilityType.APPLICATION_NAME));
	System.out.println(cap.getCapability(CapabilityType.BROWSER_VERSION));
	System.out.println(cap.getCapability(CapabilityType.ELEMENT_SCROLL_BEHAVIOR));
	System.out.println(cap.getCapability(CapabilityType.ENABLE_PERSISTENT_HOVERING));
	System.out.println(cap.getCapability(CapabilityType.ENABLE_PROFILING_CAPABILITY));
	System.out.println(cap.getCapability(CapabilityType.HAS_NATIVE_EVENTS));
	System.out.println(cap.getCapability(CapabilityType.HAS_TOUCHSCREEN));
	System.out.println(cap.getCapability(CapabilityType.LOGGING_PREFS));
	System.out.println(cap.getCapability(CapabilityType.OVERLAPPING_CHECK_DISABLED));
	System.out.println(cap.getCapability(CapabilityType.PAGE_LOAD_STRATEGY));
	System.out.println(cap.getCapability(CapabilityType.PAGE_LOADING_STRATEGY));
	System.out.println(cap.getCapability(CapabilityType.PLATFORM_NAME));
	System.out.println(cap.getCapability(CapabilityType.PROXY));
	System.out.println(cap.getCapability(CapabilityType.ROTATABLE));
	System.out.println(cap.getCapability(CapabilityType.TAKES_SCREENSHOT));
	System.out.println(cap.getCapability(CapabilityType.VERSION));
	System.out.println(cap.getCapability(CapabilityType.SUPPORTS_JAVASCRIPT));
	
	}

}
