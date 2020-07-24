package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@type='checkbox'])[3]").click();
		System.out.println(driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]").isSelected());
		///input[@type='checkbox']/parent::div
		
		driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
		driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
		

	}

}
