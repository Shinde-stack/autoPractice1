package Utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {

	
	public static WebDriver launchChrome (String url) {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"chromedriver.exe");
		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
	
	
	
}
