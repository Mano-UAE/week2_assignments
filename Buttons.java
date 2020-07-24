package Week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		WebElement E = driver.findElementById("email");
		E.sendKeys("manoj.balakrishnan55@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Maddy");
	     driver.findElementByXPath("//input[@value='Append ']").sendKeys(Keys.TAB);
	     driver.findElementByXPath("//input[@value=\"Clear me!!\"]").clear();
	       System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
	       
	}

}
