package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridPractice2 {
	
	
	  @Test public void test03() throws MalformedURLException { DesiredCapabilities
	  cap = new DesiredCapabilities(); WebDriver driver ;
	  cap.setCapability(CapabilityType.BROWSER_NAME,"chrome");//"firefox"browserName":"MicrosoftEdge","platformName":"Windows11"} 
	  //cap.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
	  //System.setProperty("webdriver.chrome.driver",	  "C:\\Softwares\\SeleniumGrid\\chromedriver.exe"); //driver = new	  ChromeDriver(cap);/
	  driver = new RemoteWebDriver(new URL("http://192.168.29.74:4444"),cap); 
	  System.out.println("Test03");
	  driver.get("http://www.facebook.com");
	  System.out.println(cap.getCapability(CapabilityType.BROWSER_NAME));
	  System.out.println(driver.getTitle());
	  
	  }
	 

  @Test public void test02() throws MalformedURLException { 
	  DesiredCapabilities  cap = new DesiredCapabilities(); WebDriver driver ;
  //System.setProperty("webdriver.gecko.driver","C:\\Softwares\\SeleniumGrid\\geckodriver.exe");
  cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
  //cap.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
  
  //driver = new FirefoxDriver(cap); 
  driver = new RemoteWebDriver(new  URL("http://192.168.29.74:4444"),cap); 
  System.out.println("Test04");
  driver.get("http://www.google.com");
  System.out.println(cap.getCapability(CapabilityType.BROWSER_NAME));
  System.out.println(driver.getTitle());
  
  }
  
}