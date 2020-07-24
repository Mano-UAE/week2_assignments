package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
         // driver.findElementByLinkText("Go to Home Page").click();
         // driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		//driver.findElementByPartialLinkText("Verify").click();
		driver.findElementByXPath("(//a)[5]").click();
	}

}
