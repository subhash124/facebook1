package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook1 
{
	static WebDriver driver;
	 public static void bLaunch() throws InterruptedException
	 {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(option);
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
	 }
     
	 public static void openApplication(String url)
	 {
		 driver.get(url);
		 System.out.println("hiiii");
		 
	 }
	 
	 public static void click(String locater)
	 {
		 driver.findElement(By.xpath(locater)).click();
	 }
	 

	 public static void sendkeys(String locater,String str)
	 {
		 driver.findElement(By.xpath(locater)).sendKeys(str);
		 
	 }
	
}
