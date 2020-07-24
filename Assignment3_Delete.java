package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Delete {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 	
	ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				WebElement E = driver.findElementByXPath("//input[@id='username']");
				E.sendKeys("demosalesmanager");
				driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
				driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
				driver.findElementByXPath("(//a)[2]").click();
				driver.findElementByXPath("//a[text()='Leads']").click();
				driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//span[contains(text(),'Pho')]").click();
				driver.findElementByName("phoneCountryCode").clear();
				driver.findElementByXPath("((//label[text()='Phone Number:'])[4]/following::input)[1]").sendKeys("971"); 
				driver.findElementById("ext-gen334").click();
				Thread.sleep(2000);
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]").click();
				Thread.sleep(4000);
				driver.findElementByXPath("//a[text()='Delete']").click();
				Thread.sleep(4000);
				
				driver.findElementByLinkText("Find Leads").click();
				Thread.sleep(3000);
				//driver.findElementByLinkText("Find Leads").click();
				driver.findElementById("ext-gen246").sendKeys("10153");
				Thread.sleep(3000);
				// driver.findElementByXPath("//a[text()='Find Leads']").click();
				 driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(3000);
				String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
				System.out.println(text); 
				
				/*driver.findElementByLinkText("Find Leads").click();
				Thread.sleep(3000);
				//driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys("LeadId");
				Thread.sleep(3000);
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(3000);
				String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
				System.out.println(text);*/
			
			
	}
	
	

}
