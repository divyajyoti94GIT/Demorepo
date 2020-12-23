package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:5502/framedemo.html");
	driver.findElement(By.id("un")).sendKeys("admin");
	//driver.findElement(By.id("pwd")).sendKeys("manager");
	driver.switchTo().frame(0);
	driver.findElement(By.id("pwd")).sendKeys("manager");
	
}

}
