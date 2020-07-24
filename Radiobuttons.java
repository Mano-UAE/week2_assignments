package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		WebElement E = driver.findElementByXPath("//input[@id='yes']");
		E.click();
      System.out.println(driver.findElementByXPath("(//input[@name='age'])[2]").isSelected());
    
      driver.findElementByXPath("(//input[@value='0'])[3]").click();
        

	}

}
