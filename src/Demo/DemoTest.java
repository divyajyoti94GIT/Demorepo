package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DemoTest 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	co.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.cleartrip.com/");
	
	
	
}
}
